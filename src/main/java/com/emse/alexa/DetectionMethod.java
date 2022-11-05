package com.emse.alexa;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

import java.io.IOException;

public enum DetectionMethod {
    AUDIO, VIDEO;

    @JsonValue
    public String toValue() {
        return switch (this) {
            case AUDIO -> "AUDIO";
            case VIDEO -> "VIDEO";
        };
    }

    @JsonCreator
    public static DetectionMethod forValue(String value) throws IOException {
        if (value.equals("AUDIO")) return AUDIO;
        if (value.equals("VIDEO")) return VIDEO;
        throw new IOException("Cannot deserialize DetectionMethod");
    }
}
