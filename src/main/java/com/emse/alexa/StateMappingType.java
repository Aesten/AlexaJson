package com.emse.alexa;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

import java.io.IOException;

public enum StateMappingType {
    STATES_TO_RANGE, STATES_TO_VALUE;

    @JsonValue
    public String toValue() {
        return switch (this) {
            case STATES_TO_RANGE -> "StatesToRange";
            case STATES_TO_VALUE -> "StatesToValue";
        };
    }

    @JsonCreator
    public static StateMappingType forValue(String value) throws IOException {
        if (value.equals("StatesToRange")) return STATES_TO_RANGE;
        if (value.equals("StatesToValue")) return STATES_TO_VALUE;
        throw new IOException("Cannot deserialize StateMappingType");
    }
}
