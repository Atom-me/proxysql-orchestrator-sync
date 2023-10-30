package com.atom.orchestrator.config;

import com.atom.orchestrator.model.OrchestratorServer;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

import java.util.List;

/**
 * @author Atom
 */
@Configuration
@ConfigurationProperties(prefix = "orchestrator")
public class OrchestratorConfig {

    private List<OrchestratorServer> servers;
    private Long pollInterval;
    private String clusterAlias;

    public OrchestratorConfig(List<OrchestratorServer> servers, Long pollInterval, String clusterAlias) {
        this.servers = servers;
        this.pollInterval = pollInterval;
        this.clusterAlias = clusterAlias;
    }

    public OrchestratorConfig() {
    }

    public List<OrchestratorServer> getServers() {
        return servers;
    }

    public void setServers(List<OrchestratorServer> servers) {
        this.servers = servers;
    }

    public Long getPollInterval() {
        return pollInterval;
    }

    public void setPollInterval(Long pollInterval) {
        this.pollInterval = pollInterval;
    }

    public String getClusterAlias() {
        return clusterAlias;
    }

    public void setClusterAlias(String clusterAlias) {
        this.clusterAlias = clusterAlias;
    }

    @Override
    public String toString() {
        return "OrchestratorConfig{" +
                "servers=" + servers +
                ", pollInterval=" + pollInterval +
                ", clusterAlias='" + clusterAlias + '\'' +
                '}';
    }
}
