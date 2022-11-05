package com.emse.alexa;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

import java.io.IOException;

public enum ScaleEnum {
    CELSIUS, FAHRENHEIT, KELVIN;

    @JsonValue
    public String toValue() {
        return switch (this) {
            case CELSIUS -> "CELSIUS";
            case FAHRENHEIT -> "FAHRENHEIT";
            case KELVIN -> "KELVIN";
        };
    }

    @JsonCreator
    public static ScaleEnum forValue(String value) throws IOException {
        if (value.equals("CELSIUS")) return CELSIUS;
        if (value.equals("FAHRENHEIT")) return FAHRENHEIT;
        if (value.equals("KELVIN")) return KELVIN;
        throw new IOException("Cannot deserialize ScaleEnum");
    }
}
