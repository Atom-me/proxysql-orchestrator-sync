package com.atom.orchestrator.model;

/**
 * @author Atom
 */
public class Master {
    private String hostname;
    private Integer port;

    public Master(String hostname, Integer port) {
        this.hostname = hostname;
        this.port = port;
    }

    public Master() {
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
        return "Master{" +
                "hostname='" + hostname + '\'' +
                ", port=" + port +
                '}';
    }
}
