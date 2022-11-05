package com.emse.alexa;

import com.fasterxml.jackson.annotation.JsonProperty;

public class EndpointScope {
    private String token;
    private ScopeType type;

    @JsonProperty("token")
    public String getToken() {
        return token;
    }

    @JsonProperty("token")
    public void setToken(String value) {
        this.token = value;
    }

    @JsonProperty("type")
    public ScopeType getType() {
        return type;
    }

    @JsonProperty("type")
    public void setType(ScopeType value) {
        this.type = value;
    }
}
