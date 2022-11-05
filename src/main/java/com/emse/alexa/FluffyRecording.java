package com.emse.alexa;

import com.fasterxml.jackson.annotation.JsonProperty;

public class FluffyRecording {
    private AudioCodec audioCodec;
    private String endTime;
    private String name;
    private String startTime;
    private FluffyThumbnailURI thumbnailURI;
    private FluffyURI uri;
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
    public FluffyThumbnailURI getThumbnailURI() {
        return thumbnailURI;
    }

    @JsonProperty("thumbnailUri")
    public void setThumbnailURI(FluffyThumbnailURI value) {
        this.thumbnailURI = value;
    }

    @JsonProperty("uri")
    public FluffyURI getURI() {
        return uri;
    }

    @JsonProperty("uri")
    public void setURI(FluffyURI value) {
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
