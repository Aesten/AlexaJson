package com.emse.alexa;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

import java.io.IOException;

public enum Mode {
    DEFAULT, VOICE_OPTIMIZED;

    @JsonValue
    public String toValue() {
        return switch (this) {
            case DEFAULT -> "DEFAULT";
            case VOICE_OPTIMIZED -> "VOICE_OPTIMIZED";
        };
    }

    @JsonCreator
    public static Mode forValue(String value) throws IOException {
        if (value.equals("DEFAULT")) return DEFAULT;
        if (value.equals("VOICE_OPTIMIZED")) return VOICE_OPTIMIZED;
        throw new IOException("Cannot deserialize Mode");
    }
}
