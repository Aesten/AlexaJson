package com.emse.alexa;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

import java.io.IOException;

public enum VersionEnum {
    THE_10, THE_3;

    @JsonValue
    public String toValue() {
        return switch (this) {
            case THE_10 -> "1.0";
            case THE_3 -> "3";
        };
    }

    @JsonCreator
    public static VersionEnum forValue(String value) throws IOException {
        if (value.equals("1.0")) return THE_10;
        if (value.equals("3")) return THE_3;
        throw new IOException("Cannot deserialize VersionEnum");
    }
}
