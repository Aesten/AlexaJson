package com.emse.alexa;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

import java.io.IOException;

public enum FluffyName {
    POSITION_MILLISECONDS;

    @JsonValue
    public String toValue() {
        if (this == FluffyName.POSITION_MILLISECONDS) {
            return "positionMilliseconds";
        }
        return null;
    }

    @JsonCreator
    public static FluffyName forValue(String value) throws IOException {
        if (value.equals("positionMilliseconds")) return POSITION_MILLISECONDS;
        throw new IOException("Cannot deserialize FluffyName");
    }
}
