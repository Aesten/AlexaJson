package com.emse.alexa;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

import java.io.IOException;

public enum AudioCodec {
    AAC, G711, NONE;

    @JsonValue
    public String toValue() {
        return switch (this) {
            case AAC -> "AAC";
            case G711 -> "G711";
            case NONE -> "NONE";
        };
    }

    @JsonCreator
    public static AudioCodec forValue(String value) throws IOException {
        if (value.equals("AAC")) return AAC;
        if (value.equals("G711")) return G711;
        if (value.equals("NONE")) return NONE;
        throw new IOException("Cannot deserialize AudioCodec");
    }
}
