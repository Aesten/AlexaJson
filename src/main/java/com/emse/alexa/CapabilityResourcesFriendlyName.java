package com.emse.alexa;

import com.fasterxml.jackson.annotation.JsonProperty;

public class CapabilityResourcesFriendlyName {
    private FluffyValue value;
    private FriendlyNameType type;

    @JsonProperty("value")
    public FluffyValue getValue() {
        return value;
    }

    @JsonProperty("value")
    public void setValue(FluffyValue value) {
        this.value = value;
    }

    @JsonProperty("@type")
    public FriendlyNameType getType() {
        return type;
    }

    @JsonProperty("@type")
    public void setType(FriendlyNameType value) {
        this.type = value;
    }
}
