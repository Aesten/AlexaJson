package com.emse.alexa;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

import java.io.IOException;

public enum ErrorStatus {
    DELETED, INTERNAL_ERROR, NOT_FOUND, SUBSCRIPTION_ERROR;

    @JsonValue
    public String toValue() {
        return switch (this) {
            case DELETED -> "DELETED";
            case INTERNAL_ERROR -> "INTERNAL_ERROR";
            case NOT_FOUND -> "NOT_FOUND";
            case SUBSCRIPTION_ERROR -> "SUBSCRIPTION_ERROR";
        };
    }

    @JsonCreator
    public static ErrorStatus forValue(String value) throws IOException {
        if (value.equals("DELETED")) return DELETED;
        if (value.equals("INTERNAL_ERROR")) return INTERNAL_ERROR;
        if (value.equals("NOT_FOUND")) return NOT_FOUND;
        if (value.equals("SUBSCRIPTION_ERROR")) return SUBSCRIPTION_ERROR;
        throw new IOException("Cannot deserialize ErrorStatus");
    }
}
