package com.emse.alexa;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

import java.io.IOException;

public enum FeatureAvailability {
    DISABLED, ENABLED, SUBSCRIPTION_REQUIRED;

    @JsonValue
    public String toValue() {
        return switch (this) {
            case DISABLED -> "DISABLED";
            case ENABLED -> "ENABLED";
            case SUBSCRIPTION_REQUIRED -> "SUBSCRIPTION_REQUIRED";
        };
    }

    @JsonCreator
    public static FeatureAvailability forValue(String value) throws IOException {
        if (value.equals("DISABLED")) return DISABLED;
        if (value.equals("ENABLED")) return ENABLED;
        if (value.equals("SUBSCRIPTION_REQUIRED")) return SUBSCRIPTION_REQUIRED;
        throw new IOException("Cannot deserialize FeatureAvailability");
    }
}
