package com.emse.alexa;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class Input {
    private List<String> friendlyNames;
    private String name;

    @JsonProperty("friendlyNames")
    public List<String> getFriendlyNames() {
        return friendlyNames;
    }

    @JsonProperty("friendlyNames")
    public void setFriendlyNames(List<String> value) {
        this.friendlyNames = value;
    }

    @JsonProperty("name")
    public String getName() {
        return name;
    }

    @JsonProperty("name")
    public void setName(String value) {
        this.name = value;
    }
}
