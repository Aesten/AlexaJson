package com.emse.alexa;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

import java.io.IOException;

public enum CurrentDeviceMode {
    ASLEEP, COLOR, NOT_PROVISIONED, OTHER;

    @JsonValue
    public String toValue() {
        return switch (this) {
            case ASLEEP -> "ASLEEP";
            case COLOR -> "COLOR";
            case NOT_PROVISIONED -> "NOT_PROVISIONED";
            case OTHER -> "OTHER";
        };
    }

    @JsonCreator
    public static CurrentDeviceMode forValue(String value) throws IOException {
        if (value.equals("ASLEEP")) return ASLEEP;
        if (value.equals("COLOR")) return COLOR;
        if (value.equals("NOT_PROVISIONED")) return NOT_PROVISIONED;
        if (value.equals("OTHER")) return OTHER;
        throw new IOException("Cannot deserialize CurrentDeviceMode");
    }
}
