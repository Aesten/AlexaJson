package com.emse.alexa;

import com.fasterxml.jackson.annotation.JsonProperty;

public class FoodThickness {
    private String cloudVerificationMode;
    private EnablementMode enablementMode;
    private FoodThicknessUnit unit;
    private Double value;

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

    @JsonProperty("unit")
    public FoodThicknessUnit getUnit() {
        return unit;
    }

    @JsonProperty("unit")
    public void setUnit(FoodThicknessUnit value) {
        this.unit = value;
    }

    @JsonProperty("value")
    public Double getValue() {
        return value;
    }

    @JsonProperty("value")
    public void setValue(Double value) {
        this.value = value;
    }
}
