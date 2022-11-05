package com.emse.alexa;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

import java.io.IOException;

public enum ValueName {
    BASS, MIDRANGE, TREBLE;

    @JsonValue
    public String toValue() {
        return switch (this) {
            case BASS -> "BASS";
            case MIDRANGE -> "MIDRANGE";
            case TREBLE -> "TREBLE";
        };
    }

    @JsonCreator
    public static ValueName forValue(String value) throws IOException {
        if (value.equals("BASS")) return BASS;
        if (value.equals("MIDRANGE")) return MIDRANGE;
        if (value.equals("TREBLE")) return TREBLE;
        throw new IOException("Cannot deserialize ValueName");
    }
}