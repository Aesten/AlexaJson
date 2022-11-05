package com.emse.alexa;

import com.fasterxml.jackson.annotation.JsonProperty;

public class FluffyValue {
    private String assetID;
    private String locale;
    private String text;

    @JsonProperty("assetId")
    public String getAssetID() {
        return assetID;
    }

    @JsonProperty("assetId")
    public void setAssetID(String value) {
        this.assetID = value;
    }

    @JsonProperty("locale")
    public String getLocale() {
        return locale;
    }

    @JsonProperty("locale")
    public void setLocale(String value) {
        this.locale = value;
    }

    @JsonProperty("text")
    public String getText() {
        return text;
    }

    @JsonProperty("text")
    public void setText(String value) {
        this.text = value;
    }
}
