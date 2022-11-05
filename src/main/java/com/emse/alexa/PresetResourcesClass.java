package com.emse.alexa;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class PresetResourcesClass {
    private List<PresetResourcesFriendlyName> friendlyNames;

    @JsonProperty("friendlyNames")
    public List<PresetResourcesFriendlyName> getFriendlyNames() {
        return friendlyNames;
    }

    @JsonProperty("friendlyNames")
    public void setFriendlyNames(List<PresetResourcesFriendlyName> value) {
        this.friendlyNames = value;
    }
}
