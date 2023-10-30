package com.atom.orchestrator.model;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * @author Atom
 */
public class Replicas {
    @JsonProperty("Hostname")
    private String hostname;
    @JsonProperty("Port")
    private int port;

    public void setHostname(String Hostname) {
        this.hostname = Hostname;
    }

    public String getHostname() {
        return hostname;
    }

    public void setPort(int Port) {
        this.port = Port;
    }

    public int getPort() {
        return port;
    }

    public Replicas() {
    }

    public Replicas(String hostname, int port) {
        this.hostname = hostname;
        this.port = port;
    }

    @Override
    public String toString() {
        return "Replicas{" +
                "hostname='" + hostname + '\'' +
                ", port=" + port +
                '}';
    }
}
