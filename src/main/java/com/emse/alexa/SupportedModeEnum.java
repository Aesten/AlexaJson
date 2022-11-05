package com.emse.alexa;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

import java.io.IOException;

public enum SupportedModeEnum {
    AUTO, COOL, ECO, HEAT, OFF;

    @JsonValue
    public String toValue() {
        return switch (this) {
            case AUTO -> "AUTO";
            case COOL -> "COOL";
            case ECO -> "ECO";
            case HEAT -> "HEAT";
            case OFF -> "OFF";
        };
    }

    @JsonCreator
    public static SupportedModeEnum forValue(String value) throws IOException {
        if (value.equals("AUTO")) return AUTO;
        if (value.equals("COOL")) return COOL;
        if (value.equals("ECO")) return ECO;
        if (value.equals("HEAT")) return HEAT;
        if (value.equals("OFF")) return OFF;
        throw new IOException("Cannot deserialize SupportedModeEnum");
    }
}
