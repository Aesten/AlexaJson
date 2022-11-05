package com.emse.alexa;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class Bands {
    private Range range;
    private List<BandsSupported> supported;

    @JsonProperty("range")
    public Range getRange() {
        return range;
    }

    @JsonProperty("range")
    public void setRange(Range value) {
        this.range = value;
    }

    @JsonProperty("supported")
    public List<BandsSupported> getSupported() {
        return supported;
    }

    @JsonProperty("supported")
    public void setSupported(List<BandsSupported> value) {
        this.supported = value;
    }
}
