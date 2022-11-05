package com.emse.alexa;

import com.fasterxml.jackson.annotation.JsonProperty;

public class MinimumValueClass {
    private ScaleEnum scale;
    private Double value;

    @JsonProperty("scale")
    public ScaleEnum getScale() {
        return scale;
    }

    @JsonProperty("scale")
    public void setScale(ScaleEnum value) {
        this.scale = value;
    }

    @JsonProperty("value")
    public Double getValue() {
        return value;
    }

    @JsonProperty("value")
    public void setValue(Double value) {
        this.value = value;
    }
}
