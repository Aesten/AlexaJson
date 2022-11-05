package com.emse.alexa;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ResolutionElement {
    private long height;
    private long width;

    @JsonProperty("height")
    public long getHeight() {
        return height;
    }

    @JsonProperty("height")
    public void setHeight(long value) {
        this.height = value;
    }

    @JsonProperty("width")
    public long getWidth() {
        return width;
    }

    @JsonProperty("width")
    public void setWidth(long value) {
        this.width = value;
    }
}
