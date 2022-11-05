package com.emse.alexa;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

import java.io.IOException;

public enum SupportsDeactivationEnum {
    FALSE, IS_FULL_DUPLEX_AUDIO_SUPPORTED_FALSE, IS_FULL_DUPLEX_AUDIO_SUPPORTED_TRUE, PURPLE_FALSE, PURPLE_TRUE, TRUE;

    @JsonValue
    public String toValue() {
        return switch (this) {
            case FALSE -> "false";
            case IS_FULL_DUPLEX_AUDIO_SUPPORTED_FALSE -> "False";
            case IS_FULL_DUPLEX_AUDIO_SUPPORTED_TRUE -> "True";
            case PURPLE_FALSE -> "FALSE";
            case PURPLE_TRUE -> "TRUE";
            case TRUE -> "true";
        };
    }

    @JsonCreator
    public static SupportsDeactivationEnum forValue(String value) throws IOException {
        if (value.equals("false")) return FALSE;
        if (value.equals("False")) return IS_FULL_DUPLEX_AUDIO_SUPPORTED_FALSE;
        if (value.equals("True")) return IS_FULL_DUPLEX_AUDIO_SUPPORTED_TRUE;
        if (value.equals("FALSE")) return PURPLE_FALSE;
        if (value.equals("TRUE")) return PURPLE_TRUE;
        if (value.equals("true")) return TRUE;
        throw new IOException("Cannot deserialize SupportsDeactivationEnum");
    }
}
