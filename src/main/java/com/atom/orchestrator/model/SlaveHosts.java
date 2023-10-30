package com.atom.orchestrator.model;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * @author Atom
 */
public class SlaveHosts {

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

    public SlaveHosts() {
    }

    public SlaveHosts(String hostname, int port) {
        this.hostname = hostname;
        this.port = port;
    }

    @Override
    public String toString() {
        return "SlaveHosts{" +
                "hostname='" + hostname + '\'' +
                ", port=" + port +
                '}';
    }
}
