package com.emse.alexa;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class Change {
    private ChangeCause cause;
    private List<StateProperty> properties;

    @JsonProperty("cause")
    public ChangeCause getCause() {
        return cause;
    }

    @JsonProperty("cause")
    public void setCause(ChangeCause value) {
        this.cause = value;
    }

    @JsonProperty("properties")
    public List<StateProperty> getProperties() {
        return properties;
    }

    @JsonProperty("properties")
    public void setProperties(List<StateProperty> value) {
        this.properties = value;
    }
}
