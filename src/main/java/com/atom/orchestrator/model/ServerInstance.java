package com.atom.orchestrator.model;

import java.util.Objects;

/**
 * @author Atom
 */
public class ServerInstance {
    private String hostname;
    private Integer port;

    public ServerInstance() {
    }

    public ServerInstance(String hostname, Integer port) {
        this.hostname = hostname;
        this.port = port;
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
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ServerInstance that = (ServerInstance) o;

        if (!Objects.equals(hostname, that.hostname)) return false;
        return Objects.equals(port, that.port);
    }

    @Override
    public int hashCode() {
        int result = hostname != null ? hostname.hashCode() : 0;
        result = 31 * result + (port != null ? port.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "ServerInstance{" +
                "hostname='" + hostname + '\'' +
                ", port=" + port +
                '}';
    }
}
