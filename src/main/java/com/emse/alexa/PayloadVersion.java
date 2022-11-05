package com.emse.alexa;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

import java.io.IOException;

public enum PayloadVersion {
    THE_3;

    @JsonValue
    public String toValue() {
        if (this == PayloadVersion.THE_3) {
            return "3";
        }
        return null;
    }

    @JsonCreator
    public static PayloadVersion forValue(String value) throws IOException {
        if (value.equals("3")) return THE_3;
        throw new IOException("Cannot deserialize PayloadVersion");
    }
}
