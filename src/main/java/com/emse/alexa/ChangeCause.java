package com.emse.alexa;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ChangeCause {
    private CauseType type;

    @JsonProperty("type")
    public CauseType getType() {
        return type;
    }

    @JsonProperty("type")
    public void setType(CauseType value) {
        this.type = value;
    }
}
