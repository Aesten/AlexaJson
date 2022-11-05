package com.emse.alexa;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class Semantics {
    private List<ActionMapping> actionMappings;
    private List<StateMapping> stateMappings;

    @JsonProperty("actionMappings")
    public List<ActionMapping> getActionMappings() {
        return actionMappings;
    }

    @JsonProperty("actionMappings")
    public void setActionMappings(List<ActionMapping> value) {
        this.actionMappings = value;
    }

    @JsonProperty("stateMappings")
    public List<StateMapping> getStateMappings() {
        return stateMappings;
    }

    @JsonProperty("stateMappings")
    public void setStateMappings(List<StateMapping> value) {
        this.stateMappings = value;
    }
}
