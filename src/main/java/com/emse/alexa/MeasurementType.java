package com.emse.alexa;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

import java.io.IOException;

public enum MeasurementType {
    COUNT, PERCENTAGE, VOLUME, WEIGHT;

    @JsonValue
    public String toValue() {
        return switch (this) {
            case COUNT -> "Count";
            case PERCENTAGE -> "Percentage";
            case VOLUME -> "Volume";
            case WEIGHT -> "Weight";
        };
    }

    @JsonCreator
    public static MeasurementType forValue(String value) throws IOException {
        if (value.equals("Count")) return COUNT;
        if (value.equals("Percentage")) return PERCENTAGE;
        if (value.equals("Volume")) return VOLUME;
        if (value.equals("Weight")) return WEIGHT;
        throw new IOException("Cannot deserialize MeasurementType");
    }
}
