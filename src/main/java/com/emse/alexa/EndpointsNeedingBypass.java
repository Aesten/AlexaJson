package com.emse.alexa;

import com.fasterxml.jackson.annotation.JsonProperty;

public class EndpointsNeedingBypass {
    private String endpointID;
    private String friendlyName;

    @JsonProperty("endpointId")
    public String getEndpointID() {
        return endpointID;
    }

    @JsonProperty("endpointId")
    public void setEndpointID(String value) {
        this.endpointID = value;
    }

    @JsonProperty("friendlyName")
    public String getFriendlyName() {
        return friendlyName;
    }

    @JsonProperty("friendlyName")
    public void setFriendlyName(String value) {
        this.friendlyName = value;
    }
}
