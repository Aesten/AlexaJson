package com.emse.alexa;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

import java.io.IOException;

public enum SupportedAuthorizationTypeType {
    FOUR_DIGIT_PIN;

    @JsonValue
    public String toValue() {
        if (this == SupportedAuthorizationTypeType.FOUR_DIGIT_PIN) {
            return "FOUR_DIGIT_PIN";
        }
        return null;
    }

    @JsonCreator
    public static SupportedAuthorizationTypeType forValue(String value) throws IOException {
        if (value.equals("FOUR_DIGIT_PIN")) return FOUR_DIGIT_PIN;
        throw new IOException("Cannot deserialize SupportedAuthorizationTypeType");
    }
}
