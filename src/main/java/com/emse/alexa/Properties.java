package com.emse.alexa;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Properties {
    private NonControllable proactivelyReported;
    private NonControllable retrievable;
    private SupportedUnion supported;
    private NonControllable nonControllable;
    private Boolean readOnly;

    @JsonProperty("proactivelyReported")
    public NonControllable getProactivelyReported() {
        return proactivelyReported;
    }

    @JsonProperty("proactivelyReported")
    public void setProactivelyReported(NonControllable value) {
        this.proactivelyReported = value;
    }

    @JsonProperty("retrievable")
    public NonControllable getRetrievable() {
        return retrievable;
    }

    @JsonProperty("retrievable")
    public void setRetrievable(NonControllable value) {
        this.retrievable = value;
    }

    @JsonProperty("supported")
    public SupportedUnion getSupported() {
        return supported;
    }

    @JsonProperty("supported")
    public void setSupported(SupportedUnion value) {
        this.supported = value;
    }

    @JsonProperty("nonControllable")
    public NonControllable getNonControllable() {
        return nonControllable;
    }

    @JsonProperty("nonControllable")
    public void setNonControllable(NonControllable value) {
        this.nonControllable = value;
    }

    @JsonProperty("readOnly")
    public Boolean getReadOnly() {
        return readOnly;
    }

    @JsonProperty("readOnly")
    public void setReadOnly(Boolean value) {
        this.readOnly = value;
    }
}
