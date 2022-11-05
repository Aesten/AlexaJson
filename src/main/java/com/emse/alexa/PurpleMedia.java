package com.emse.alexa;

import com.fasterxml.jackson.annotation.JsonProperty;

public class PurpleMedia {
    private CauseEnum cause;
    private String id;
    private FluffyRecording recording;

    @JsonProperty("cause")
    public CauseEnum getCause() {
        return cause;
    }

    @JsonProperty("cause")
    public void setCause(CauseEnum value) {
        this.cause = value;
    }

    @JsonProperty("id")
    public String getID() {
        return id;
    }

    @JsonProperty("id")
    public void setID(String value) {
        this.id = value;
    }

    @JsonProperty("recording")
    public FluffyRecording getRecording() {
        return recording;
    }

    @JsonProperty("recording")
    public void setRecording(FluffyRecording value) {
        this.recording = value;
    }
}
