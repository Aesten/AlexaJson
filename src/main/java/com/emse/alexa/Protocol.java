package com.emse.alexa;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

import java.io.IOException;

public enum Protocol {
    RTSP, WEBRTC;

    @JsonValue
    public String toValue() {
        return switch (this) {
            case RTSP -> "RTSP";
            case WEBRTC -> "WEBRTC";
        };
    }

    @JsonCreator
    public static Protocol forValue(String value) throws IOException {
        if (value.equals("RTSP")) return RTSP;
        if (value.equals("WEBRTC")) return WEBRTC;
        throw new IOException("Cannot deserialize Protocol");
    }
}
