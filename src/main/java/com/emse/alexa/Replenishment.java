package com.emse.alexa;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Replenishment {
    private ReplenishmentType type;
    private String value;

    @JsonProperty("@type")
    public ReplenishmentType getType() {
        return type;
    }

    @JsonProperty("@type")
    public void setType(ReplenishmentType value) {
        this.type = value;
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
