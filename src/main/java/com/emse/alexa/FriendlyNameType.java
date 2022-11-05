package com.emse.alexa;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

import java.io.IOException;

public enum FriendlyNameType {
    ASSET, TEXT;

    @JsonValue
    public String toValue() {
        return switch (this) {
            case ASSET -> "asset";
            case TEXT -> "text";
        };
    }

    @JsonCreator
    public static FriendlyNameType forValue(String value) throws IOException {
        if (value.equals("asset")) return ASSET;
        if (value.equals("text")) return TEXT;
        throw new IOException("Cannot deserialize FriendlyNameType");
    }
}
