package com.emse.alexa;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Property {
    private FluffyName name;
    private long value;

    @JsonProperty("name")
    public FluffyName getName() {
        return name;
    }

    @JsonProperty("name")
    public void setName(FluffyName value) {
        this.name = value;
    }

    @JsonProperty("value")
    public long getValue() {
        return value;
    }

    @JsonProperty("value")
    public void setValue(long value) {
        this.value = value;
    }
}
