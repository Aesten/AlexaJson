package com.emse.alexa;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class Configuration {
    private List<SupportedModeElement> supportedModes;
    private Boolean supportsScheduling;
    private List<SupportedIntent> supportedIntents;
    private SupportsDeactivationUnion isFullDuplexAudioSupported;
    private List<DetectionMethod> detectionMethods;
    private DetectionModes detectionModes;
    private String firstConnectionTime;
    private StaticDeviceInformation staticDeviceInformation;
    private Boolean ordered;
    private List<Preset> presets;
    private SupportedRange supportedRange;
    private String unitOfMeasure;
    private List<SupportedArmState> supportedArmStates;
    private List<SupportedAuthorizationType> supportedAuthorizationTypes;
    private List<SupportedCredentialType> supportedCredentialTypes;
    private Boolean supportsArmInstant;
    private List<String> macAddresses;
    private Measurement measurement;
    private Replenishment replenishment;

    @JsonProperty("supportedModes")
    public List<SupportedModeElement> getSupportedModes() {
        return supportedModes;
    }

    @JsonProperty("supportedModes")
    public void setSupportedModes(List<SupportedModeElement> value) {
        this.supportedModes = value;
    }

    @JsonProperty("supportsScheduling")
    public Boolean getSupportsScheduling() {
        return supportsScheduling;
    }

    @JsonProperty("supportsScheduling")
    public void setSupportsScheduling(Boolean value) {
        this.supportsScheduling = value;
    }

    @JsonProperty("supportedIntents")
    public List<SupportedIntent> getSupportedIntents() {
        return supportedIntents;
    }

    @JsonProperty("supportedIntents")
    public void setSupportedIntents(List<SupportedIntent> value) {
        this.supportedIntents = value;
    }

    @JsonProperty("isFullDuplexAudioSupported")
    public SupportsDeactivationUnion getIsFullDuplexAudioSupported() {
        return isFullDuplexAudioSupported;
    }

    @JsonProperty("isFullDuplexAudioSupported")
    public void setIsFullDuplexAudioSupported(SupportsDeactivationUnion value) {
        this.isFullDuplexAudioSupported = value;
    }

    @JsonProperty("detectionMethods")
    public List<DetectionMethod> getDetectionMethods() {
        return detectionMethods;
    }

    @JsonProperty("detectionMethods")
    public void setDetectionMethods(List<DetectionMethod> value) {
        this.detectionMethods = value;
    }

    @JsonProperty("detectionModes")
    public DetectionModes getDetectionModes() {
        return detectionModes;
    }

    @JsonProperty("detectionModes")
    public void setDetectionModes(DetectionModes value) {
        this.detectionModes = value;
    }

    @JsonProperty("firstConnectionTime")
    public String getFirstConnectionTime() {
        return firstConnectionTime;
    }

    @JsonProperty("firstConnectionTime")
    public void setFirstConnectionTime(String value) {
        this.firstConnectionTime = value;
    }

    @JsonProperty("staticDeviceInformation")
    public StaticDeviceInformation getStaticDeviceInformation() {
        return staticDeviceInformation;
    }

    @JsonProperty("staticDeviceInformation")
    public void setStaticDeviceInformation(StaticDeviceInformation value) {
        this.staticDeviceInformation = value;
    }

    @JsonProperty("ordered")
    public Boolean getOrdered() {
        return ordered;
    }

    @JsonProperty("ordered")
    public void setOrdered(Boolean value) {
        this.ordered = value;
    }

    @JsonProperty("presets")
    public List<Preset> getPresets() {
        return presets;
    }

    @JsonProperty("presets")
    public void setPresets(List<Preset> value) {
        this.presets = value;
    }

    @JsonProperty("supportedRange")
    public SupportedRange getSupportedRange() {
        return supportedRange;
    }

    @JsonProperty("supportedRange")
    public void setSupportedRange(SupportedRange value) {
        this.supportedRange = value;
    }

    @JsonProperty("unitOfMeasure")
    public String getUnitOfMeasure() {
        return unitOfMeasure;
    }

    @JsonProperty("unitOfMeasure")
    public void setUnitOfMeasure(String value) {
        this.unitOfMeasure = value;
    }

    @JsonProperty("supportedArmStates")
    public List<SupportedArmState> getSupportedArmStates() {
        return supportedArmStates;
    }

    @JsonProperty("supportedArmStates")
    public void setSupportedArmStates(List<SupportedArmState> value) {
        this.supportedArmStates = value;
    }

    @JsonProperty("supportedAuthorizationTypes")
    public List<SupportedAuthorizationType> getSupportedAuthorizationTypes() {
        return supportedAuthorizationTypes;
    }

    @JsonProperty("supportedAuthorizationTypes")
    public void setSupportedAuthorizationTypes(List<SupportedAuthorizationType> value) {
        this.supportedAuthorizationTypes = value;
    }

    @JsonProperty("supportedCredentialTypes")
    public List<SupportedCredentialType> getSupportedCredentialTypes() {
        return supportedCredentialTypes;
    }

    @JsonProperty("supportedCredentialTypes")
    public void setSupportedCredentialTypes(List<SupportedCredentialType> value) {
        this.supportedCredentialTypes = value;
    }

    @JsonProperty("supportsArmInstant")
    public Boolean getSupportsArmInstant() {
        return supportsArmInstant;
    }

    @JsonProperty("supportsArmInstant")
    public void setSupportsArmInstant(Boolean value) {
        this.supportsArmInstant = value;
    }

    @JsonProperty("MACAddresses")
    public List<String> getMACAddresses() {
        return macAddresses;
    }

    @JsonProperty("MACAddresses")
    public void setMACAddresses(List<String> value) {
        this.macAddresses = value;
    }

    @JsonProperty("measurement")
    public Measurement getMeasurement() {
        return measurement;
    }

    @JsonProperty("measurement")
    public void setMeasurement(Measurement value) {
        this.measurement = value;
    }

    @JsonProperty("replenishment")
    public Replenishment getReplenishment() {
        return replenishment;
    }

    @JsonProperty("replenishment")
    public void setReplenishment(Replenishment value) {
        this.replenishment = value;
    }
}
