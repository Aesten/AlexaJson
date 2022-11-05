package com.emse.alexa;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

import java.io.IOException;

public enum TypeType {
    COUNT, ENUMERATED_POWER_LEVEL, INTEGRAL_POWER_LEVEL, PERCENTAGE, VOLUME, WEIGHT;

    @JsonValue
    public String toValue() {
        return switch (this) {
            case COUNT -> "Count";
            case ENUMERATED_POWER_LEVEL -> "EnumeratedPowerLevel";
            case INTEGRAL_POWER_LEVEL -> "IntegralPowerLevel";
            case PERCENTAGE -> "Percentage";
            case VOLUME -> "Volume";
            case WEIGHT -> "Weight";
        };
    }

    @JsonCreator
    public static TypeType forValue(String value) throws IOException {
        if (value.equals("Count")) return COUNT;
        if (value.equals("EnumeratedPowerLevel")) return ENUMERATED_POWER_LEVEL;
        if (value.equals("IntegralPowerLevel")) return INTEGRAL_POWER_LEVEL;
        if (value.equals("Percentage")) return PERCENTAGE;
        if (value.equals("Volume")) return VOLUME;
        if (value.equals("Weight")) return WEIGHT;
        throw new IOException("Cannot deserialize TypeType");
    }
}
