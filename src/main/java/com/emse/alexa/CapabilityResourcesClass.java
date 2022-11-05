package com.emse.alexa;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class CapabilityResourcesClass {
    private List<CapabilityResourcesFriendlyName> friendlyNames;

    @JsonProperty("friendlyNames")
    public List<CapabilityResourcesFriendlyName> getFriendlyNames() {
        return friendlyNames;
    }

    @JsonProperty("friendlyNames")
    public void setFriendlyNames(List<CapabilityResourcesFriendlyName> value) {
        this.friendlyNames = value;
    }
}
