package com.emse.alexa;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class CameraStreamConfiguration {
    private List<AudioCodec> audioCodecs;
    private List<AuthorizationType> authorizationTypes;
    private List<Protocol> protocols;
    private List<ResolutionElement> resolutions;
    private List<VideoCodecElement> videoCodecs;

    @JsonProperty("audioCodecs")
    public List<AudioCodec> getAudioCodecs() {
        return audioCodecs;
    }

    @JsonProperty("audioCodecs")
    public void setAudioCodecs(List<AudioCodec> value) {
        this.audioCodecs = value;
    }

    @JsonProperty("authorizationTypes")
    public List<AuthorizationType> getAuthorizationTypes() {
        return authorizationTypes;
    }

    @JsonProperty("authorizationTypes")
    public void setAuthorizationTypes(List<AuthorizationType> value) {
        this.authorizationTypes = value;
    }

    @JsonProperty("protocols")
    public List<Protocol> getProtocols() {
        return protocols;
    }

    @JsonProperty("protocols")
    public void setProtocols(List<Protocol> value) {
        this.protocols = value;
    }

    @JsonProperty("resolutions")
    public List<ResolutionElement> getResolutions() {
        return resolutions;
    }

    @JsonProperty("resolutions")
    public void setResolutions(List<ResolutionElement> value) {
        this.resolutions = value;
    }

    @JsonProperty("videoCodecs")
    public List<VideoCodecElement> getVideoCodecs() {
        return videoCodecs;
    }

    @JsonProperty("videoCodecs")
    public void setVideoCodecs(List<VideoCodecElement> value) {
        this.videoCodecs = value;
    }
}
