package com.emse.alexa;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

import java.io.IOException;

public enum ReplenishmentType {
    DASH_REPLENISHMENT_ID;

    @JsonValue
    public String toValue() {
        if (this == ReplenishmentType.DASH_REPLENISHMENT_ID) {
            return "DashReplenishmentId";
        }
        return null;
    }

    @JsonCreator
    public static ReplenishmentType forValue(String value) throws IOException {
        if (value.equals("DashReplenishmentId")) return DASH_REPLENISHMENT_ID;
        throw new IOException("Cannot deserialize ReplenishmentType");
    }
}
