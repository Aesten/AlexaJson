package com.emse.alexa;

import com.fasterxml.jackson.annotation.JsonProperty;

public class AnimalPresence {
    private FeatureAvailability featureAvailability;
    private Boolean supportsCloudVerificationMode;
    private Boolean supportsEnablementMode;
    private Boolean supportsNotDetected;

    @JsonProperty("featureAvailability")
    public FeatureAvailability getFeatureAvailability() {
        return featureAvailability;
    }

    @JsonProperty("featureAvailability")
    public void setFeatureAvailability(FeatureAvailability value) {
        this.featureAvailability = value;
    }

    @JsonProperty("supportsCloudVerificationMode")
    public Boolean getSupportsCloudVerificationMode() {
        return supportsCloudVerificationMode;
    }

    @JsonProperty("supportsCloudVerificationMode")
    public void setSupportsCloudVerificationMode(Boolean value) {
        this.supportsCloudVerificationMode = value;
    }

    @JsonProperty("supportsEnablementMode")
    public Boolean getSupportsEnablementMode() {
        return supportsEnablementMode;
    }

    @JsonProperty("supportsEnablementMode")
    public void setSupportsEnablementMode(Boolean value) {
        this.supportsEnablementMode = value;
    }

    @JsonProperty("supportsNotDetected")
    public Boolean getSupportsNotDetected() {
        return supportsNotDetected;
    }

    @JsonProperty("supportsNotDetected")
    public void setSupportsNotDetected(Boolean value) {
        this.supportsNotDetected = value;
    }
}
