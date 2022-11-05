package com.emse.alexa;

import com.fasterxml.jackson.annotation.JsonProperty;

public class SupportedRange {
    private Version maximumValue;
    private Version minimumValue;
    private Version precision;

    @JsonProperty("maximumValue")
    public Version getMaximumValue() {
        return maximumValue;
    }

    @JsonProperty("maximumValue")
    public void setMaximumValue(Version value) {
        this.maximumValue = value;
    }

    @JsonProperty("minimumValue")
    public Version getMinimumValue() {
        return minimumValue;
    }

    @JsonProperty("minimumValue")
    public void setMinimumValue(Version value) {
        this.minimumValue = value;
    }

    @JsonProperty("precision")
    public Version getPrecision() {
        return precision;
    }

    @JsonProperty("precision")
    public void setPrecision(Version value) {
        this.precision = value;
    }
}
