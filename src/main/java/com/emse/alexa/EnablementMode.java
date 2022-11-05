package com.emse.alexa;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

import java.io.IOException;

public enum EnablementMode {
    DISABLED, ENABLED;

    @JsonValue
    public String toValue() {
        return switch (this) {
            case DISABLED -> "DISABLED";
            case ENABLED -> "ENABLED";
        };
    }

    @JsonCreator
    public static EnablementMode forValue(String value) throws IOException {
        if (value.equals("DISABLED")) return DISABLED;
        if (value.equals("ENABLED")) return ENABLED;
        throw new IOException("Cannot deserialize EnablementMode");
    }
}
