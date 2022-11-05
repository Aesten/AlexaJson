package com.emse.alexa;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

import java.io.IOException;

public enum ScopeType {
    BEARER_TOKEN;

    @JsonValue
    public String toValue() {
        if (this == ScopeType.BEARER_TOKEN) {
            return "BearerToken";
        }
        return null;
    }

    @JsonCreator
    public static ScopeType forValue(String value) throws IOException {
        if (value.equals("BearerToken")) return BEARER_TOKEN;
        throw new IOException("Cannot deserialize ScopeType");
    }
}
