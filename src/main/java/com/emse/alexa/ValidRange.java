package com.emse.alexa;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ValidRange {
    private MaximumValueUnion maximumValue;
    private MinimumValueUnion minimumValue;

    @JsonProperty("maximumValue")
    public MaximumValueUnion getMaximumValue() {
        return maximumValue;
    }

    @JsonProperty("maximumValue")
    public void setMaximumValue(MaximumValueUnion value) {
        this.maximumValue = value;
    }

    @JsonProperty("minimumValue")
    public MinimumValueUnion getMinimumValue() {
        return minimumValue;
    }

    @JsonProperty("minimumValue")
    public void setMinimumValue(MinimumValueUnion value) {
        this.minimumValue = value;
    }
}
