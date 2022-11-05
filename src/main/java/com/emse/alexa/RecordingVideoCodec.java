package com.emse.alexa;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

import java.io.IOException;

public enum RecordingVideoCodec {
    H264;

    @JsonValue
    public String toValue() {
        if (this == RecordingVideoCodec.H264) {
            return "H264";
        }
        return null;
    }

    @JsonCreator
    public static RecordingVideoCodec forValue(String value) throws IOException {
        if (value.equals("H264")) return H264;
        throw new IOException("Cannot deserialize RecordingVideoCodec");
    }
}
