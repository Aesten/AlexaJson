package com.emse.alexa;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Range {
    private Long maximum;
    private Long minimum;

    @JsonProperty("maximum")
    public Long getMaximum() {
        return maximum;
    }

    @JsonProperty("maximum")
    public void setMaximum(Long value) {
        this.maximum = value;
    }

    @JsonProperty("minimum")
    public Long getMinimum() {
        return minimum;
    }

    @JsonProperty("minimum")
    public void setMinimum(Long value) {
        this.minimum = value;
    }
}
