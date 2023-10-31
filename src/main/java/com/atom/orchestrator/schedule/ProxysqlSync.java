package com.atom.orchestrator.schedule;

import com.atom.orchestrator.config.OrchestratorConfig;
import com.atom.orchestrator.model.OrchestratorServer;
import com.atom.orchestrator.service.ProxySyncService;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.util.List;
import java.util.Random;

/**
 * @author Atom
 */
@Component
@EnableScheduling
public class ProxysqlSync {
    @Resource
    private OrchestratorConfig orchestratorConfig;
    @Resource
    private ProxySyncService proxySyncService;


    /**
     * Periodic ProxySql update
     */
    @Scheduled(fixedRateString = "${orchestrator.pollInterval}")
    public void sync() {
        List<OrchestratorServer> orchestratorServers = orchestratorConfig.getServers();
        Random random = new Random();
        OrchestratorServer orchestratorServer = orchestratorServers.get(random.nextInt(orchestratorServers.size()));
        proxySyncService.proxySync(orchestratorServer, false);

    }
}
