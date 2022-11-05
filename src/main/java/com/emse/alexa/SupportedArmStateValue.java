package com.emse.alexa;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

import java.io.IOException;

public enum SupportedArmStateValue {
    ARMED_AWAY, ARMED_NIGHT, ARMED_STAY, DISARMED;

    @JsonValue
    public String toValue() {
        return switch (this) {
            case ARMED_AWAY -> "ARMED_AWAY";
            case ARMED_NIGHT -> "ARMED_NIGHT";
            case ARMED_STAY -> "ARMED_STAY";
            case DISARMED -> "DISARMED";
        };
    }

    @JsonCreator
    public static SupportedArmStateValue forValue(String value) throws IOException {
        if (value.equals("ARMED_AWAY")) return ARMED_AWAY;
        if (value.equals("ARMED_NIGHT")) return ARMED_NIGHT;
        if (value.equals("ARMED_STAY")) return ARMED_STAY;
        if (value.equals("DISARMED")) return DISARMED;
        throw new IOException("Cannot deserialize SupportedArmStateValue");
    }
}
