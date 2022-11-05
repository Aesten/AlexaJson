package com.emse.alexa;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

import java.io.IOException;

public enum VideoCodecElement {
    H264, JPG, MJPEG, MPEG2;

    @JsonValue
    public String toValue() {
        return switch (this) {
            case H264 -> "H264";
            case JPG -> "JPG";
            case MJPEG -> "MJPEG";
            case MPEG2 -> "MPEG2";
        };
    }

    @JsonCreator
    public static VideoCodecElement forValue(String value) throws IOException {
        if (value.equals("H264")) return H264;
        if (value.equals("JPG")) return JPG;
        if (value.equals("MJPEG")) return MJPEG;
        if (value.equals("MPEG2")) return MPEG2;
        throw new IOException("Cannot deserialize VideoCodecElement");
    }
}
