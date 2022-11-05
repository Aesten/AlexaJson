package com.emse.alexa;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class ActionMapping {
    private ActionMappingType type;
    private List<String> actions;
    private Directive directive;

    @JsonProperty("@type")
    public ActionMappingType getType() {
        return type;
    }

    @JsonProperty("@type")
    public void setType(ActionMappingType value) {
        this.type = value;
    }

    @JsonProperty("actions")
    public List<String> getActions() {
        return actions;
    }

    @JsonProperty("actions")
    public void setActions(List<String> value) {
        this.actions = value;
    }

    @JsonProperty("directive")
    public Directive getDirective() {
        return directive;
    }

    @JsonProperty("directive")
    public void setDirective(Directive value) {
        this.directive = value;
    }
}
