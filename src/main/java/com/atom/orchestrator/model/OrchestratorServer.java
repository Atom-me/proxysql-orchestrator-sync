package com.atom.orchestrator.model;

/**
 * @author Atom
 */
public class OrchestratorServer {
    private String url;
    private String username;
    private String password;

    public OrchestratorServer(String url, String username, String password) {
        this.url = url;
        this.username = username;
        this.password = password;
    }

    public OrchestratorServer() {
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "OrchestratorServer{" +
                "url='" + url + '\'' +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
