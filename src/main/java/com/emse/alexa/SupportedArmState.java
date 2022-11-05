package com.emse.alexa;

import com.fasterxml.jackson.annotation.JsonProperty;

public class SupportedArmState {
    private SupportedArmStateValue value;

    @JsonProperty("value")
    public SupportedArmStateValue getValue() {
        return value;
    }

    @JsonProperty("value")
    public void setValue(SupportedArmStateValue value) {
        this.value = value;
    }
}
