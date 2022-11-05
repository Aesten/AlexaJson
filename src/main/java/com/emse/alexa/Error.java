package com.emse.alexa;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Error {
    private String mediaID;
    private ErrorStatus status;

    @JsonProperty("mediaId")
    public String getMediaID() {
        return mediaID;
    }

    @JsonProperty("mediaId")
    public void setMediaID(String value) {
        this.mediaID = value;
    }

    @JsonProperty("status")
    public ErrorStatus getStatus() {
        return status;
    }

    @JsonProperty("status")
    public void setStatus(ErrorStatus value) {
        this.status = value;
    }
}
