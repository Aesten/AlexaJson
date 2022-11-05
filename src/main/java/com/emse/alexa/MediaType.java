package com.emse.alexa;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

import java.io.IOException;

public enum MediaType {
    ALEXA_MEDIAMETADATA, DATAMART;

    @JsonValue
    public String toValue() {
        return switch (this) {
            case ALEXA_MEDIAMETADATA -> "ALEXA.MEDIAMETADATA";
            case DATAMART -> "DATAMART";
        };
    }

    @JsonCreator
    public static MediaType forValue(String value) throws IOException {
        if (value.equals("ALEXA.MEDIAMETADATA")) return ALEXA_MEDIAMETADATA;
        if (value.equals("DATAMART")) return DATAMART;
        throw new IOException("Cannot deserialize MediaType");
    }
}
