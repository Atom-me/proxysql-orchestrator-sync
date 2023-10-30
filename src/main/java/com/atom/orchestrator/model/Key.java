package com.atom.orchestrator.model;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * @author Atom
 */
public class Key {

    @JsonProperty("Hostname")
    private String hostName;
    @JsonProperty("Port")
    private int port;
    public void setHostName(String Hostname) {
        this.hostName = Hostname;
    }
    public String getHostName() {
        return hostName;
    }

    public void setPort(int Port) {
        this.port = Port;
    }
    public int getPort() {
        return port;
    }

    public Key() {
    }

    public Key(String hostName, int port) {
        this.hostName = hostName;
        this.port = port;
    }

    @Override
    public String toString() {
        return "Key{" +
                "Hostname='" + hostName + '\'' +
                ", Port=" + port +
                '}';
    }
}
