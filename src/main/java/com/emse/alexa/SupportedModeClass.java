package com.emse.alexa;

import com.fasterxml.jackson.annotation.JsonProperty;

public class SupportedModeClass {
    private ModeResourcesUnion modeResources;
    private String value;

    @JsonProperty("modeResources")
    public ModeResourcesUnion getModeResources() {
        return modeResources;
    }

    @JsonProperty("modeResources")
    public void setModeResources(ModeResourcesUnion value) {
        this.modeResources = value;
    }

    @JsonProperty("value")
    public String getValue() {
        return value;
    }

    @JsonProperty("value")
    public void setValue(String value) {
        this.value = value;
    }
}
