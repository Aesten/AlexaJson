package com.emse.alexa;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ValueMedia {
    private String id;
    private MediaType type;
    private String cloudVerificationMode;
    private EnablementMode enablementMode;

    @JsonProperty("id")
    public String getID() {
        return id;
    }

    @JsonProperty("id")
    public void setID(String value) {
        this.id = value;
    }

    @JsonProperty("type")
    public MediaType getType() {
        return type;
    }

    @JsonProperty("type")
    public void setType(MediaType value) {
        this.type = value;
    }

    @JsonProperty("cloudVerificationMode")
    public String getCloudVerificationMode() {
        return cloudVerificationMode;
    }

    @JsonProperty("cloudVerificationMode")
    public void setCloudVerificationMode(String value) {
        this.cloudVerificationMode = value;
    }

    @JsonProperty("enablementMode")
    public EnablementMode getEnablementMode() {
        return enablementMode;
    }

    @JsonProperty("enablementMode")
    public void setEnablementMode(EnablementMode value) {
        this.enablementMode = value;
    }
}
