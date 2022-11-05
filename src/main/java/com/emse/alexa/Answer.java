package com.emse.alexa;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Answer {
    private String format;
    private String value;

    @JsonProperty("format")
    public String getFormat() {
        return format;
    }

    @JsonProperty("format")
    public void setFormat(String value) {
        this.format = value;
    }

    @JsonProperty("value")
    public String getValue() {
        return value;
    }

    @JsonProperty("value")
    public void setValue(String value) {
        this.value = value;
    }
}
