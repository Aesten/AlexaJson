package com.emse.alexa;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

import java.io.IOException;

public enum ValueStatus {
    AUTOMATED, NOT_AUTOMATED;

    @JsonValue
    public String toValue() {
        return switch (this) {
            case AUTOMATED -> "AUTOMATED";
            case NOT_AUTOMATED -> "NOT_AUTOMATED";
        };
    }

    @JsonCreator
    public static ValueStatus forValue(String value) throws IOException {
        if (value.equals("AUTOMATED")) return AUTOMATED;
        if (value.equals("NOT_AUTOMATED")) return NOT_AUTOMATED;
        throw new IOException("Cannot deserialize ValueStatus");
    }
}