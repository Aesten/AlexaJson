package com.emse.alexa;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

import java.io.IOException;

public enum FoodStateEnum {
    BRINED, CANNED, CHILLED, COLD_SMOKED, DEFROSTED, DRIED, EMULSIFIED, FREEZE_DRIED, FRESH, FROZEN, MELTED, REFRIGERATED, ROOM_TEMPERATURE, SMOKED, WHIPPED;

    @JsonValue
    public String toValue() {
        return switch (this) {
            case BRINED -> "BRINED";
            case CANNED -> "CANNED";
            case CHILLED -> "CHILLED";
            case COLD_SMOKED -> "COLD_SMOKED";
            case DEFROSTED -> "DEFROSTED";
            case DRIED -> "DRIED";
            case EMULSIFIED -> "EMULSIFIED";
            case FREEZE_DRIED -> "FREEZE_DRIED";
            case FRESH -> "FRESH";
            case FROZEN -> "FROZEN";
            case MELTED -> "MELTED";
            case REFRIGERATED -> "REFRIGERATED";
            case ROOM_TEMPERATURE -> "ROOM_TEMPERATURE";
            case SMOKED -> "SMOKED";
            case WHIPPED -> "WHIPPED";
        };
    }

    @JsonCreator
    public static FoodStateEnum forValue(String value) throws IOException {
        if (value.equals("BRINED")) return BRINED;
        if (value.equals("CANNED")) return CANNED;
        if (value.equals("CHILLED")) return CHILLED;
        if (value.equals("COLD_SMOKED")) return COLD_SMOKED;
        if (value.equals("DEFROSTED")) return DEFROSTED;
        if (value.equals("DRIED")) return DRIED;
        if (value.equals("EMULSIFIED")) return EMULSIFIED;
        if (value.equals("FREEZE_DRIED")) return FREEZE_DRIED;
        if (value.equals("FRESH")) return FRESH;
        if (value.equals("FROZEN")) return FROZEN;
        if (value.equals("MELTED")) return MELTED;
        if (value.equals("REFRIGERATED")) return REFRIGERATED;
        if (value.equals("ROOM_TEMPERATURE")) return ROOM_TEMPERATURE;
        if (value.equals("SMOKED")) return SMOKED;
        if (value.equals("WHIPPED")) return WHIPPED;
        throw new IOException("Cannot deserialize FoodStateEnum");
    }
}
