package com.emse.alexa;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

import java.io.IOException;

public enum ActionMappingType {
    ACTIONS_TO_DIRECTIVE;

    @JsonValue
    public String toValue() {
        if (this == ActionMappingType.ACTIONS_TO_DIRECTIVE) {
            return "ActionsToDirective";
        }
        return null;
    }

    @JsonCreator
    public static ActionMappingType forValue(String value) throws IOException {
        if (value.equals("ActionsToDirective")) return ACTIONS_TO_DIRECTIVE;
        throw new IOException("Cannot deserialize ActionMappingType");
    }
}
