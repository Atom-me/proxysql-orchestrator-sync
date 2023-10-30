package com.atom.orchestrator.model;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * @author Atom
 */
public class SecondsSinceLastSeen {
    @JsonProperty("Int64")
    private int int64;
    @JsonProperty("Valid")
    private boolean valid;

    public void setInt64(int Int64) {
        this.int64 = Int64;
    }

    public int getInt64() {
        return int64;
    }

    public void setValid(boolean Valid) {
        this.valid = Valid;
    }

    public boolean getValid() {
        return valid;
    }

    public SecondsSinceLastSeen(int int64, boolean valid) {
        this.int64 = int64;
        this.valid = valid;
    }

    public SecondsSinceLastSeen() {
    }

    @Override
    public String toString() {
        return "SecondsSinceLastSeen{" +
                "int64=" + int64 +
                ", valid=" + valid +
                '}';
    }
}
