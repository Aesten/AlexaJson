package com.emse.alexa;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class ModeResourcesClass {
    private List<ModeResourcesFriendlyName> friendlyNames;

    @JsonProperty("friendlyNames")
    public List<ModeResourcesFriendlyName> getFriendlyNames() {
        return friendlyNames;
    }

    @JsonProperty("friendlyNames")
    public void setFriendlyNames(List<ModeResourcesFriendlyName> value) {
        this.friendlyNames = value;
    }
}
