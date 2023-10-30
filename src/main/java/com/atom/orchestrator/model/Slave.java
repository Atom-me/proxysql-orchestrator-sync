package com.atom.orchestrator.model;

/**
 * @author Atom
 */
public class Slave {
    private String hostname;
    private Integer port;

    public Slave(String hostname, Integer port) {
        this.hostname = hostname;
        this.port = port;
    }

    public Slave() {
    }

    public String getHostname() {
        return hostname;
    }

    public void setHostname(String hostname) {
        this.hostname = hostname;
    }

    public Integer getPort() {
        return port;
    }

    public void setPort(Integer port) {
        this.port = port;
    }

    @Override
    public String toString() {
        return "Slave{" +
                "hostname='" + hostname + '\'' +
                ", port=" + port +
                '}';
    }
}
