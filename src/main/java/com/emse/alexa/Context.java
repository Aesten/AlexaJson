package com.emse.alexa;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class Context {
    private List<StateProperty> properties;

    @JsonProperty("properties")
    public List<StateProperty> getProperties() { return properties; }
    @JsonProperty("properties")
    public void setProperties(List<StateProperty> value) { this.properties = value; }
}
