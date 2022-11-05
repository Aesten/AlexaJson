package com.emse.alexa;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

import java.io.IOException;

public enum AuthorizationType {
    BASIC, DIGEST, NONE;

    @JsonValue
    public String toValue() {
        return switch (this) {
            case BASIC -> "BASIC";
            case DIGEST -> "DIGEST";
            case NONE -> "NONE";
        };
    }

    @JsonCreator
    public static AuthorizationType forValue(String value) throws IOException {
        if (value.equals("BASIC")) return BASIC;
        if (value.equals("DIGEST")) return DIGEST;
        if (value.equals("NONE")) return NONE;
        throw new IOException("Cannot deserialize AuthorizationType");
    }
}
