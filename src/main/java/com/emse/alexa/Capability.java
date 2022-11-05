package com.emse.alexa;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Capability {
    private String capability;
    private String instance;

    @JsonProperty("capability")
    public String getCapability() {
        return capability;
    }

    @JsonProperty("capability")
    public void setCapability(String value) {
        this.capability = value;
    }

    @JsonProperty("instance")
    public String getInstance() {
        return instance;
    }

    @JsonProperty("instance")
    public void setInstance(String value) {
        this.instance = value;
    }
}
