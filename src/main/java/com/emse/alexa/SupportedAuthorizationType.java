package com.emse.alexa;

import com.fasterxml.jackson.annotation.JsonProperty;

public class SupportedAuthorizationType {
    private SupportedAuthorizationTypeType type;

    @JsonProperty("type")
    public SupportedAuthorizationTypeType getType() {
        return type;
    }

    @JsonProperty("type")
    public void setType(SupportedAuthorizationTypeType value) {
        this.type = value;
    }
}
