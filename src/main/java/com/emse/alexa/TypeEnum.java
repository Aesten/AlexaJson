package com.emse.alexa;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

import java.io.IOException;

public enum TypeEnum {
    ALEXA_INTERFACE;

    @JsonValue
    public String toValue() {
        if (this == TypeEnum.ALEXA_INTERFACE) {
            return "AlexaInterface";
        }
        return null;
    }

    @JsonCreator
    public static TypeEnum forValue(String value) throws IOException {
        if (value.equals("AlexaInterface")) return ALEXA_INTERFACE;
        throw new IOException("Cannot deserialize TypeEnum");
    }
}
