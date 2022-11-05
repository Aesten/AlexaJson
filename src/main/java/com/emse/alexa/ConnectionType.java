package com.emse.alexa;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

import java.io.IOException;

public enum ConnectionType {
    TCP_IP, UNKNOWN, ZIGBEE, ZWAVE;

    @JsonValue
    public String toValue() {
        return switch (this) {
            case TCP_IP -> "TCP_IP";
            case UNKNOWN -> "UNKNOWN";
            case ZIGBEE -> "ZIGBEE";
            case ZWAVE -> "ZWAVE";
        };
    }

    @JsonCreator
    public static ConnectionType forValue(String value) throws IOException {
        if (value.equals("TCP_IP")) return TCP_IP;
        if (value.equals("UNKNOWN")) return UNKNOWN;
        if (value.equals("ZIGBEE")) return ZIGBEE;
        if (value.equals("ZWAVE")) return ZWAVE;
        throw new IOException("Cannot deserialize ConnectionType");
    }
}
