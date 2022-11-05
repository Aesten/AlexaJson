package com.emse.alexa;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class Modes {
    private List<ModesSupported> supported;

    @JsonProperty("supported")
    public List<ModesSupported> getSupported() {
        return supported;
    }

    @JsonProperty("supported")
    public void setSupported(List<ModesSupported> value) {
        this.supported = value;
    }
}
