package com.emse.alexa;

import com.fasterxml.jackson.annotation.JsonProperty;

public class PurpleURI {
    private String expireTime;
    private String value;

    @JsonProperty("expireTime")
    public String getExpireTime() {
        return expireTime;
    }

    @JsonProperty("expireTime")
    public void setExpireTime(String value) {
        this.expireTime = value;
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
