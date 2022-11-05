package com.emse.alexa;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Configurations {
    private Bands bands;
    private Modes modes;

    @JsonProperty("bands")
    public Bands getBands() {
        return bands;
    }

    @JsonProperty("bands")
    public void setBands(Bands value) {
        this.bands = value;
    }

    @JsonProperty("modes")
    public Modes getModes() {
        return modes;
    }

    @JsonProperty("modes")
    public void setModes(Modes value) {
        this.modes = value;
    }
}
