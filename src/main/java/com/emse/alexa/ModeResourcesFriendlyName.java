package com.emse.alexa;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ModeResourcesFriendlyName {
    private FriendlyNameType type;
    private StickyValue value;

    @JsonProperty("@type")
    public FriendlyNameType getType() {
        return type;
    }

    @JsonProperty("@type")
    public void setType(FriendlyNameType value) {
        this.type = value;
    }

    @JsonProperty("value")
    public StickyValue getValue() {
        return value;
    }

    @JsonProperty("value")
    public void setValue(StickyValue value) {
        this.value = value;
    }
}
