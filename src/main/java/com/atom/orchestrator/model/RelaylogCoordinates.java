package com.atom.orchestrator.model;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * @author Atom
 */
public class RelaylogCoordinates {
    @JsonProperty("LogFile")
    private String logFile;
    @JsonProperty("LogPos")
    private long logPos;
    @JsonProperty("Type")
    private int type;

    public void setLogFile(String LogFile) {
        this.logFile = LogFile;
    }

    public String getLogFile() {
        return logFile;
    }

    public void setLogPos(long LogPos) {
        this.logPos = LogPos;
    }

    public long getLogPos() {
        return logPos;
    }

    public void setType(int Type) {
        this.type = Type;
    }

    public int getType() {
        return type;
    }

    public RelaylogCoordinates() {
    }

    public RelaylogCoordinates(String logFile, long logPos, int type) {
        this.logFile = logFile;
        this.logPos = logPos;
        this.type = type;
    }

    @Override
    public String toString() {
        return "RelaylogCoordinates{" +
                "logFile='" + logFile + '\'' +
                ", logPos=" + logPos +
                ", type=" + type +
                '}';
    }
}
