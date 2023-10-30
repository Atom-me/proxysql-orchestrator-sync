package com.atom.orchestrator.model;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Atom
 */
public class MysqlServers {
    private List<Master> masters;
    private List<Slave> slaves;

    public MysqlServers(List<Master> masters, List<Slave> slaves) {
        this.masters = masters;
        this.slaves = slaves;
    }

    public MysqlServers() {
    }

    public List<Master> getMasters() {
        return masters;
    }

    public void setMasters(List<Master> masters) {
        this.masters = masters;
    }

    public List<Slave> getSlaves() {
        return slaves;
    }

    public void setSlaves(List<Slave> slaves) {
        this.slaves = slaves;
    }


    public List<ServerInstance> toServerInstance() {
        List<ServerInstance> serverInOrchestrator = new ArrayList<>();
        for (Master master : this.masters) {
            serverInOrchestrator.add(new ServerInstance(master.getHostname(), master.getPort()));
        }
        for (Slave slave : this.slaves) {
            serverInOrchestrator.add(new ServerInstance(slave.getHostname(), slave.getPort()));
        }
        return serverInOrchestrator;
    }

    @Override
    public String toString() {
        return "MysqlServers{" +
                "masters=" + masters +
                ", slaves=" + slaves +
                '}';
    }
}
