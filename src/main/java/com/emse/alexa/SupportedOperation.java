package com.emse.alexa;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

import java.io.IOException;

public enum SupportedOperation {
    FAST_FORWARD, NEXT, PAUSE, PLAY, PREVIOUS, RESUME, REWIND, SKIP, START_OVER, STOP;

    @JsonValue
    public String toValue() {
        return switch (this) {
            case FAST_FORWARD -> "FastForward";
            case NEXT -> "Next";
            case PAUSE -> "Pause";
            case PLAY -> "Play";
            case PREVIOUS -> "Previous";
            case RESUME -> "Resume";
            case REWIND -> "Rewind";
            case SKIP -> "Skip";
            case START_OVER -> "StartOver";
            case STOP -> "Stop";
        };
    }

    @JsonCreator
    public static SupportedOperation forValue(String value) throws IOException {
        if (value.equals("FastForward")) return FAST_FORWARD;
        if (value.equals("Next")) return NEXT;
        if (value.equals("Pause")) return PAUSE;
        if (value.equals("Play")) return PLAY;
        if (value.equals("Previous")) return PREVIOUS;
        if (value.equals("Resume")) return RESUME;
        if (value.equals("Rewind")) return REWIND;
        if (value.equals("Skip")) return SKIP;
        if (value.equals("StartOver")) return START_OVER;
        if (value.equals("Stop")) return STOP;
        throw new IOException("Cannot deserialize SupportedOperation");
    }
}
