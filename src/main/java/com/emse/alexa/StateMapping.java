package com.emse.alexa;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;
import java.util.Map;

public class StateMapping {
    private StateMappingType type;
    private List<String> states;
    private Object value;
    private Map<String, Object> range;

    @JsonProperty("@type")
    public StateMappingType getType() {
        return type;
    }

    @JsonProperty("@type")
    public void setType(StateMappingType value) {
        this.type = value;
    }

    @JsonProperty("states")
    public List<String> getStates() {
        return states;
    }

    @JsonProperty("states")
    public void setStates(List<String> value) {
        this.states = value;
    }

    @JsonProperty("value")
    public Object getValue() {
        return value;
    }

    @JsonProperty("value")
    public void setValue(Object value) {
        this.value = value;
    }

    @JsonProperty("range")
    public Map<String, Object> getRange() {
        return range;
    }

    @JsonProperty("range")
    public void setRange(Map<String, Object> value) {
        this.range = value;
    }
}
