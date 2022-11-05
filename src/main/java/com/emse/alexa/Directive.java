package com.emse.alexa;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Map;

public class Directive {
    private String name;
    private Map<String, Object> payload;

    @JsonProperty("name")
    public String getName() {
        return name;
    }

    @JsonProperty("name")
    public void setName(String value) {
        this.name = value;
    }

    @JsonProperty("payload")
    public Map<String, Object> getPayload() {
        return payload;
    }

    @JsonProperty("payload")
    public void setPayload(Map<String, Object> value) {
        this.payload = value;
    }
}
