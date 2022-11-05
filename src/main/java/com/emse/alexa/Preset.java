package com.emse.alexa;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Preset {
    private PresetResourcesUnion presetResources;
    private Version rangeValue;

    @JsonProperty("presetResources")
    public PresetResourcesUnion getPresetResources() {
        return presetResources;
    }

    @JsonProperty("presetResources")
    public void setPresetResources(PresetResourcesUnion value) {
        this.presetResources = value;
    }

    @JsonProperty("rangeValue")
    public Version getRangeValue() {
        return rangeValue;
    }

    @JsonProperty("rangeValue")
    public void setRangeValue(Version value) {
        this.rangeValue = value;
    }
}
