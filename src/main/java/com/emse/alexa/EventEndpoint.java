package com.emse.alexa;

import com.fasterxml.jackson.annotation.JsonProperty;

public class EventEndpoint {
    private String endpointID;
    private EndpointScope scope;

    @JsonProperty("endpointId")
    public String getEndpointID() {
        return endpointID;
    }

    @JsonProperty("endpointId")
    public void setEndpointID(String value) {
        this.endpointID = value;
    }

    @JsonProperty("scope")
    public EndpointScope getScope() {
        return scope;
    }

    @JsonProperty("scope")
    public void setScope(EndpointScope value) {
        this.scope = value;
    }
}
