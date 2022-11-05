package com.emse.alexa;

import com.fasterxml.jackson.annotation.JsonProperty;

public class SupportedIntent {
    private String name;

    @JsonProperty("name")
    public String getName() {
        return name;
    }

    @JsonProperty("name")
    public void setName(String value) {
        this.name = value;
    }
}
