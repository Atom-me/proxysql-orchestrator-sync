package com.atom.orchestrator.service;

import com.atom.orchestrator.config.OrchestratorConfig;
import com.atom.orchestrator.config.ProxySqlConfig;
import com.atom.orchestrator.config.ProxysqlClient;
import com.atom.orchestrator.constant.Constants;
import com.atom.orchestrator.model.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Component
public class ProxySyncService {

    @Resource
    private RestTemplate restTemplate;

    @Resource
    private OrchestratorConfig orchestratorConfig;

    @Resource
    private ProxySqlConfig proxySqlConfig;

    private static final Logger LOGGER = LoggerFactory.getLogger(ProxySyncService.class);

    public MysqlServers callOrchestratorApi(OrchestratorServer orchestratorServer) {
        String orchestratorServerUrl = orchestratorServer.getUrl() + Constants.CLUSTER_ALIAS + orchestratorConfig.getClusterAlias();
        String orchestratorServerUsername = orchestratorServer.getUsername();
        String orchestratorServerPassword = orchestratorServer.getPassword();

        MysqlInstanceInfo[] mysqlInstanceInfos = restTemplate.getForObject(orchestratorServerUrl, MysqlInstanceInfo[].class);
        MysqlServers mysqlServers = new MysqlServers();
        List<Master> masters = new ArrayList<>();
        List<Slave> slaves = new ArrayList<>();

        for (MysqlInstanceInfo mysqlInstanceInfo : mysqlInstanceInfos) {
            if (mysqlInstanceInfo.getIsDowntimed()) {
                LOGGER.debug("Server [{}] is in scheduled downtime until [{}] by [{}]. [{}]",
                        mysqlInstanceInfo.getKey().getHostName(),
                        mysqlInstanceInfo.getDowntimeEndTimestamp(),
                        mysqlInstanceInfo.getDowntimeOwner(),
                        mysqlInstanceInfo.getDowntimeReason());
            } else if (mysqlInstanceInfo.getIsLastCheckValid()) {
                if (mysqlInstanceInfo.getMasterKey().getHostName().isEmpty()) {
                    Master master = new Master();
                    master.setHostname(mysqlInstanceInfo.getKey().getHostName());
                    master.setPort(mysqlInstanceInfo.getKey().getPort());
                    masters.add(master);
                    LOGGER.debug("Master: [{}]", mysqlInstanceInfo.getKey().getHostName());
                } else if (!mysqlInstanceInfo.getSlaveSQLRunning() || !mysqlInstanceInfo.getSlaveIORunning()) {
                    LOGGER.debug("Slave not replicating: [{}]", mysqlInstanceInfo.getKey().getHostName());
                } else {
                    Slave slave = new Slave();
                    slave.setHostname(mysqlInstanceInfo.getKey().getHostName());
                    slave.setPort(mysqlInstanceInfo.getKey().getPort());
                    slaves.add(slave);
                    LOGGER.debug("Slave: [{}]", mysqlInstanceInfo.getKey().getHostName());
                }
            }
        }

        mysqlServers.setMasters(masters);
        mysqlServers.setSlaves(slaves);
        return mysqlServers;
    }

    public void updateProxySql(MysqlServers serversInOrchestrator, Boolean forceSync) {
        boolean changes = false;
        List<ProxySqlServer> proxySqlServers = proxySqlConfig.getServers();

        List<ServerInstance> serversInstanceInProxySql = selectProxySqlMysqlServers(proxySqlServers);
        LOGGER.info("servers in proxySql [{}]", serversInstanceInProxySql);

        //Check for changes
        List<ServerInstance> serverInstanceInOrchestrator = serversInOrchestrator.toServerInstance();
        serverInstanceInOrchestrator.sort(Comparator.comparing(ServerInstance::getHostname).thenComparing(ServerInstance::getPort));

        if (!serversInstanceInProxySql.equals(serverInstanceInOrchestrator)) {
            changes = true;
            LOGGER.info("Detected changes on ProxySQL server.");
        }
        if (forceSync) {
            changes = true;
            LOGGER.info("Forcing changes");
        }
        if (!changes) {
            LOGGER.info("No changes detected");
            return;
        }

        deleteProxySqlConfig(proxySqlServers);

        //Insert data into tables
        insertMasterAndSlaveServersOnProxySql(serversInOrchestrator, proxySqlServers);
    }

    private static void insertMasterAndSlaveServersOnProxySql(MysqlServers serversInOrchestrator, List<ProxySqlServer> proxySqlServers) {
        List<String> insertSqlList = new ArrayList<>();

        if (!serversInOrchestrator.getMasters().isEmpty()) {
            for (Master master : serversInOrchestrator.getMasters()) {
                String insertMasterSql = String.format("INSERT INTO `mysql_servers` (`hostgroup_id`,`hostname`,`port`) VALUES ('1','%s','%s')", master.getHostname(), master.getPort());
                insertSqlList.add(insertMasterSql);
            }
            LOGGER.info("Insert master SQL: [{}]", insertSqlList);
        }

        if (!serversInOrchestrator.getSlaves().isEmpty()) {
            for (Slave slave : serversInOrchestrator.getSlaves()) {
                String insertSlaveSql = String.format("INSERT INTO `mysql_servers` (`hostgroup_id`,`hostname`,`port`) VALUES ('2','%s','%s')", slave.getHostname(), slave.getPort());
                insertSqlList.add(insertSlaveSql);
            }
            LOGGER.info("Insert slave SQL: [{}]", insertSqlList);
        }

        for (ProxySqlServer proxysqlServer : proxySqlServers) {
            String hostname = proxysqlServer.getHostname();
            Integer port = proxysqlServer.getPort();
            String username = proxysqlServer.getUsername();
            String password = proxysqlServer.getPassword();
            insertSqlList.add("LOAD MYSQL SERVERS FROM MEMORY");
            insertSqlList.add("SAVE MYSQL SERVERS TO DISK");
            LOGGER.info("all sql is [{}]", insertSqlList);
            boolean executed = ProxysqlClient.execute(hostname, port, "main", username, password, insertSqlList, 0, true);
            LOGGER.info("Inserted master and slaves on ProxySQL server [{}]", proxysqlServer.getHostname());
        }
    }

    private static List<ServerInstance> selectProxySqlMysqlServers(List<ProxySqlServer> proxySqlServers) {
        List<ServerInstance> serversInProxySql = new ArrayList<>();
        for (ProxySqlServer proxysqlServer : proxySqlServers) {
            String hostname = proxysqlServer.getHostname();
            Integer port = proxysqlServer.getPort();
            String username = proxysqlServer.getUsername();
            String password = proxysqlServer.getPassword();
            String sql = "SELECT hostname,port FROM`mysql_servers` ORDER BY hostname,port";
            List<Map<String, Object>> executeQueryResult = ProxysqlClient.executeQuery(hostname, port, "main", username, password, sql, 0);
            LOGGER.info("executeQueryResult: [{}]", executeQueryResult);
            for (Map<String, Object> stringObjectMap : executeQueryResult) {
                String hostname1 = (String) stringObjectMap.get("hostname");
                Integer port1 = Integer.valueOf((String) stringObjectMap.get("port"));
                serversInProxySql.add(new ServerInstance(hostname1, port1));
            }
        }
        return serversInProxySql.stream().distinct().collect(Collectors.toList());
    }


    private static void deleteProxySqlConfig(List<ProxySqlServer> proxySqlServers) {
        List<String> deleteSqlList = new ArrayList<>();
        deleteSqlList.add("DELETE FROM `mysql_servers`");

        for (ProxySqlServer proxysqlServer : proxySqlServers) {
            String hostname = proxysqlServer.getHostname();
            Integer port = proxysqlServer.getPort();
            String username = proxysqlServer.getUsername();
            String password = proxysqlServer.getPassword();
            boolean executed = ProxysqlClient.execute(hostname, port, "main", username, password, deleteSqlList, 0, true);
            LOGGER.info("Inserted master and slaves on ProxySQL server [{}]", proxysqlServer.getHostname());
        }
    }

    /**
     * Update the ProxySql config based on Github Orchestrator API data
     *
     * @param orchestratorServer
     */
    public void proxySync(OrchestratorServer orchestratorServer, Boolean forceSync) {
        MysqlServers serversInOrchestrator = callOrchestratorApi(orchestratorServer);
        updateProxySql(serversInOrchestrator, forceSync);
    }
}