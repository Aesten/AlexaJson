package com.emse.alexa;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.time.OffsetDateTime;

public class CameraStream {
    private AudioCodec audioCodec;
    private AuthorizationType authorizationType;
    private OffsetDateTime expirationTime;
    private Long idleTimeoutSeconds;
    private Protocol protocol;
    private CameraStreamResolution resolution;
    private String uri;
    private VideoCodecElement videoCodec;

    @JsonProperty("audioCodec")
    public AudioCodec getAudioCodec() {
        return audioCodec;
    }

    @JsonProperty("audioCodec")
    public void setAudioCodec(AudioCodec value) {
        this.audioCodec = value;
    }

    @JsonProperty("authorizationType")
    public AuthorizationType getAuthorizationType() {
        return authorizationType;
    }

    @JsonProperty("authorizationType")
    public void setAuthorizationType(AuthorizationType value) {
        this.authorizationType = value;
    }

    @JsonProperty("expirationTime")
    public OffsetDateTime getExpirationTime() {
        return expirationTime;
    }

    @JsonProperty("expirationTime")
    public void setExpirationTime(OffsetDateTime value) {
        this.expirationTime = value;
    }

    @JsonProperty("idleTimeoutSeconds")
    public Long getIdleTimeoutSeconds() {
        return idleTimeoutSeconds;
    }

    @JsonProperty("idleTimeoutSeconds")
    public void setIdleTimeoutSeconds(Long value) {
        this.idleTimeoutSeconds = value;
    }

    @JsonProperty("protocol")
    public Protocol getProtocol() {
        return protocol;
    }

    @JsonProperty("protocol")
    public void setProtocol(Protocol value) {
        this.protocol = value;
    }

    @JsonProperty("resolution")
    public CameraStreamResolution getResolution() {
        return resolution;
    }

    @JsonProperty("resolution")
    public void setResolution(CameraStreamResolution value) {
        this.resolution = value;
    }

    @JsonProperty("uri")
    public String getURI() {
        return uri;
    }

    @JsonProperty("uri")
    public void setURI(String value) {
        this.uri = value;
    }

    @JsonProperty("videoCodec")
    public VideoCodecElement getVideoCodec() {
        return videoCodec;
    }

    @JsonProperty("videoCodec")
    public void setVideoCodec(VideoCodecElement value) {
        this.videoCodec = value;
    }
}
