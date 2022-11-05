package com.emse.alexa;

import com.fasterxml.jackson.annotation.JsonProperty;

public class PurpleRecording {
    private AudioCodec audioCodec;
    private String endTime;
    private String name;
    private String startTime;
    private PurpleThumbnailURI thumbnailURI;
    private PurpleURI uri;
    private RecordingVideoCodec videoCodec;

    @JsonProperty("audioCodec")
    public AudioCodec getAudioCodec() {
        return audioCodec;
    }

    @JsonProperty("audioCodec")
    public void setAudioCodec(AudioCodec value) {
        this.audioCodec = value;
    }

    @JsonProperty("endTime")
    public String getEndTime() {
        return endTime;
    }

    @JsonProperty("endTime")
    public void setEndTime(String value) {
        this.endTime = value;
    }

    @JsonProperty("name")
    public String getName() {
        return name;
    }

    @JsonProperty("name")
    public void setName(String value) {
        this.name = value;
    }

    @JsonProperty("startTime")
    public String getStartTime() {
        return startTime;
    }

    @JsonProperty("startTime")
    public void setStartTime(String value) {
        this.startTime = value;
    }

    @JsonProperty("thumbnailUri")
    public PurpleThumbnailURI getThumbnailURI() {
        return thumbnailURI;
    }

    @JsonProperty("thumbnailUri")
    public void setThumbnailURI(PurpleThumbnailURI value) {
        this.thumbnailURI = value;
    }

    @JsonProperty("uri")
    public PurpleURI getURI() {
        return uri;
    }

    @JsonProperty("uri")
    public void setURI(PurpleURI value) {
        this.uri = value;
    }

    @JsonProperty("videoCodec")
    public RecordingVideoCodec getVideoCodec() {
        return videoCodec;
    }

    @JsonProperty("videoCodec")
    public void setVideoCodec(RecordingVideoCodec value) {
        this.videoCodec = value;
    }
}
