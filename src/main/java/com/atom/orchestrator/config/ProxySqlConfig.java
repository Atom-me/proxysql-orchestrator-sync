package com.atom.orchestrator.config;

import com.atom.orchestrator.model.ProxySqlServer;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

import java.util.List;

/**
 * @author Atom
 */
@Configuration
@ConfigurationProperties(prefix = "proxysql")
public class ProxySqlConfig {

    private List<ProxySqlServer> servers;

    public ProxySqlConfig(List<ProxySqlServer> servers) {
        this.servers = servers;
    }

    public ProxySqlConfig() {
    }

    public List<ProxySqlServer> getServers() {
        return servers;
    }

    public void setServers(List<ProxySqlServer> servers) {
        this.servers = servers;
    }

    @Override
    public String toString() {
        return "ProxysqlConfig{" +
                "servers=" + servers +
                '}';
    }
}
