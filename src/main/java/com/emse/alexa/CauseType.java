package com.emse.alexa;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

import java.io.IOException;

public enum CauseType {
    ALEXA_INTERACTION, APP_INTERACTION, INVALID_CREDENTIALS, PERIODIC_POLL, PHYSICAL_INTERACTION, RULE_TRIGGER, SUBSCRIPTION_EXPIRED, VOICE_INTERACTION;

    @JsonValue
    public String toValue() {
        return switch (this) {
            case ALEXA_INTERACTION -> "ALEXA_INTERACTION";
            case APP_INTERACTION -> "APP_INTERACTION";
            case INVALID_CREDENTIALS -> "INVALID_CREDENTIALS";
            case PERIODIC_POLL -> "PERIODIC_POLL";
            case PHYSICAL_INTERACTION -> "PHYSICAL_INTERACTION";
            case RULE_TRIGGER -> "RULE_TRIGGER";
            case SUBSCRIPTION_EXPIRED -> "SUBSCRIPTION_EXPIRED";
            case VOICE_INTERACTION -> "VOICE_INTERACTION";
        };
    }

    @JsonCreator
    public static CauseType forValue(String value) throws IOException {
        if (value.equals("ALEXA_INTERACTION")) return ALEXA_INTERACTION;
        if (value.equals("APP_INTERACTION")) return APP_INTERACTION;
        if (value.equals("INVALID_CREDENTIALS")) return INVALID_CREDENTIALS;
        if (value.equals("PERIODIC_POLL")) return PERIODIC_POLL;
        if (value.equals("PHYSICAL_INTERACTION")) return PHYSICAL_INTERACTION;
        if (value.equals("RULE_TRIGGER")) return RULE_TRIGGER;
        if (value.equals("SUBSCRIPTION_EXPIRED")) return SUBSCRIPTION_EXPIRED;
        if (value.equals("VOICE_INTERACTION")) return VOICE_INTERACTION;
        throw new IOException("Cannot deserialize CauseType");
    }
}
