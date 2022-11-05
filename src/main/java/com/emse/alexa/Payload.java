package com.emse.alexa;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class Payload {
    private PayloadCause cause;
    private String timestamp;
    private Answer answer;
    private String sessionID;
    private List<BypassedEndpoint> bypassedEndpoints;
    private Long exitDelayInSeconds;
    private List<Property> properties;
    private List<Error> errors;
    private MediaUnion media;
    private PayloadScope scope;
    private List<CameraStream> cameraStreams;
    private String imageURI;
    private String message;
    private PayloadType type;
    private Double percentageState;
    private CurrentDeviceMode currentDeviceMode;
    private ValidRange validRange;
    private MinimumTemperatureDelta minimumTemperatureDelta;
    private List<EndpointsNeedingBypass> endpointsNeedingBypass;
    private String maxCookTime;
    private Change change;
    private Long estimatedDeferralInSeconds;
    private List<Capability> capabilities;
    private List<String> mediaIDS;
    private List<EndpointElement> endpoints;

    @JsonProperty("cause")
    public PayloadCause getCause() {
        return cause;
    }

    @JsonProperty("cause")
    public void setCause(PayloadCause value) {
        this.cause = value;
    }

    @JsonProperty("timestamp")
    public String getTimestamp() {
        return timestamp;
    }

    @JsonProperty("timestamp")
    public void setTimestamp(String value) {
        this.timestamp = value;
    }

    @JsonProperty("answer")
    public Answer getAnswer() {
        return answer;
    }

    @JsonProperty("answer")
    public void setAnswer(Answer value) {
        this.answer = value;
    }

    @JsonProperty("sessionId")
    public String getSessionID() {
        return sessionID;
    }

    @JsonProperty("sessionId")
    public void setSessionID(String value) {
        this.sessionID = value;
    }

    @JsonProperty("bypassedEndpoints")
    public List<BypassedEndpoint> getBypassedEndpoints() {
        return bypassedEndpoints;
    }

    @JsonProperty("bypassedEndpoints")
    public void setBypassedEndpoints(List<BypassedEndpoint> value) {
        this.bypassedEndpoints = value;
    }

    @JsonProperty("exitDelayInSeconds")
    public Long getExitDelayInSeconds() {
        return exitDelayInSeconds;
    }

    @JsonProperty("exitDelayInSeconds")
    public void setExitDelayInSeconds(Long value) {
        this.exitDelayInSeconds = value;
    }

    @JsonProperty("properties")
    public List<Property> getProperties() {
        return properties;
    }

    @JsonProperty("properties")
    public void setProperties(List<Property> value) {
        this.properties = value;
    }

    @JsonProperty("errors")
    public List<Error> getErrors() {
        return errors;
    }

    @JsonProperty("errors")
    public void setErrors(List<Error> value) {
        this.errors = value;
    }

    @JsonProperty("media")
    public MediaUnion getMedia() {
        return media;
    }

    @JsonProperty("media")
    public void setMedia(MediaUnion value) {
        this.media = value;
    }

    @JsonProperty("scope")
    public PayloadScope getScope() {
        return scope;
    }

    @JsonProperty("scope")
    public void setScope(PayloadScope value) {
        this.scope = value;
    }

    @JsonProperty("cameraStreams")
    public List<CameraStream> getCameraStreams() {
        return cameraStreams;
    }

    @JsonProperty("cameraStreams")
    public void setCameraStreams(List<CameraStream> value) {
        this.cameraStreams = value;
    }

    @JsonProperty("imageUri")
    public String getImageURI() {
        return imageURI;
    }

    @JsonProperty("imageUri")
    public void setImageURI(String value) {
        this.imageURI = value;
    }

    @JsonProperty("message")
    public String getMessage() {
        return message;
    }

    @JsonProperty("message")
    public void setMessage(String value) {
        this.message = value;
    }

    @JsonProperty("type")
    public PayloadType getType() {
        return type;
    }

    @JsonProperty("type")
    public void setType(PayloadType value) {
        this.type = value;
    }

    @JsonProperty("percentageState")
    public Double getPercentageState() {
        return percentageState;
    }

    @JsonProperty("percentageState")
    public void setPercentageState(Double value) {
        this.percentageState = value;
    }

    @JsonProperty("currentDeviceMode")
    public CurrentDeviceMode getCurrentDeviceMode() {
        return currentDeviceMode;
    }

    @JsonProperty("currentDeviceMode")
    public void setCurrentDeviceMode(CurrentDeviceMode value) {
        this.currentDeviceMode = value;
    }

    @JsonProperty("validRange")
    public ValidRange getValidRange() {
        return validRange;
    }

    @JsonProperty("validRange")
    public void setValidRange(ValidRange value) {
        this.validRange = value;
    }

    @JsonProperty("minimumTemperatureDelta")
    public MinimumTemperatureDelta getMinimumTemperatureDelta() {
        return minimumTemperatureDelta;
    }

    @JsonProperty("minimumTemperatureDelta")
    public void setMinimumTemperatureDelta(MinimumTemperatureDelta value) {
        this.minimumTemperatureDelta = value;
    }

    @JsonProperty("endpointsNeedingBypass")
    public List<EndpointsNeedingBypass> getEndpointsNeedingBypass() {
        return endpointsNeedingBypass;
    }

    @JsonProperty("endpointsNeedingBypass")
    public void setEndpointsNeedingBypass(List<EndpointsNeedingBypass> value) {
        this.endpointsNeedingBypass = value;
    }

    @JsonProperty("maxCookTime")
    public String getMaxCookTime() {
        return maxCookTime;
    }

    @JsonProperty("maxCookTime")
    public void setMaxCookTime(String value) {
        this.maxCookTime = value;
    }

    @JsonProperty("change")
    public Change getChange() {
        return change;
    }

    @JsonProperty("change")
    public void setChange(Change value) {
        this.change = value;
    }

    @JsonProperty("estimatedDeferralInSeconds")
    public Long getEstimatedDeferralInSeconds() {
        return estimatedDeferralInSeconds;
    }

    @JsonProperty("estimatedDeferralInSeconds")
    public void setEstimatedDeferralInSeconds(Long value) {
        this.estimatedDeferralInSeconds = value;
    }

    @JsonProperty("capabilities")
    public List<Capability> getCapabilities() {
        return capabilities;
    }

    @JsonProperty("capabilities")
    public void setCapabilities(List<Capability> value) {
        this.capabilities = value;
    }

    @JsonProperty("mediaIds")
    public List<String> getMediaIDS() {
        return mediaIDS;
    }

    @JsonProperty("mediaIds")
    public void setMediaIDS(List<String> value) {
        this.mediaIDS = value;
    }

    @JsonProperty("endpoints")
    public List<EndpointElement> getEndpoints() {
        return endpoints;
    }

    @JsonProperty("endpoints")
    public void setEndpoints(List<EndpointElement> value) {
        this.endpoints = value;
    }
}
