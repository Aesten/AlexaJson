package com.emse.alexa;

import com.fasterxml.jackson.annotation.JsonProperty;

public class PresetResourcesFriendlyName {
    private FriendlyNameType type;
    private TentacledValue value;

    @JsonProperty("@type")
    public FriendlyNameType getType() {
        return type;
    }

    @JsonProperty("@type")
    public void setType(FriendlyNameType value) {
        this.type = value;
    }

    @JsonProperty("value")
    public TentacledValue getValue() {
        return value;
    }

    @JsonProperty("value")
    public void setValue(TentacledValue value) {
        this.value = value;
    }
}
