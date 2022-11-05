package com.emse.alexa;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

import java.io.IOException;

public enum CauseEnum {
    APP_INTERACTION, AUDIO_DETECTED, MOTION_DETECTED, PERSON_DETECTED, RULE_TRIGGER, VOICE_INTERACTION;

    @JsonValue
    public String toValue() {
        return switch (this) {
            case APP_INTERACTION -> "APP_INTERACTION";
            case AUDIO_DETECTED -> "AUDIO_DETECTED";
            case MOTION_DETECTED -> "MOTION_DETECTED";
            case PERSON_DETECTED -> "PERSON_DETECTED";
            case RULE_TRIGGER -> "RULE_TRIGGER";
            case VOICE_INTERACTION -> "VOICE_INTERACTION";
        };
    }

    @JsonCreator
    public static CauseEnum forValue(String value) throws IOException {
        if (value.equals("APP_INTERACTION")) return APP_INTERACTION;
        if (value.equals("AUDIO_DETECTED")) return AUDIO_DETECTED;
        if (value.equals("MOTION_DETECTED")) return MOTION_DETECTED;
        if (value.equals("PERSON_DETECTED")) return PERSON_DETECTED;
        if (value.equals("RULE_TRIGGER")) return RULE_TRIGGER;
        if (value.equals("VOICE_INTERACTION")) return VOICE_INTERACTION;
        throw new IOException("Cannot deserialize CauseEnum");
    }
}
