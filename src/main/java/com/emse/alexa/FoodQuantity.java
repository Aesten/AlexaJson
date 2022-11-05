package com.emse.alexa;

import com.fasterxml.jackson.annotation.JsonProperty;

public class FoodQuantity {
    private String cloudVerificationMode;
    private EnablementMode enablementMode;

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
