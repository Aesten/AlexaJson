package com.emse.alexa;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;
import java.util.Map;

public class EndpointElement {
    private AdditionalAttributes additionalAttributes;
    private List<EndpointCapability> capabilities;
    private List<Connection> connections;
    private Map<String, String> cookie;
    private String description;
    private List<DisplayCategory> displayCategories;
    private String endpointID;
    private String friendlyName;
    private String manufacturerName;

    @JsonProperty("additionalAttributes")
    public AdditionalAttributes getAdditionalAttributes() {
        return additionalAttributes;
    }

    @JsonProperty("additionalAttributes")
    public void setAdditionalAttributes(AdditionalAttributes value) {
        this.additionalAttributes = value;
    }

    @JsonProperty("capabilities")
    public List<EndpointCapability> getCapabilities() {
        return capabilities;
    }

    @JsonProperty("capabilities")
    public void setCapabilities(List<EndpointCapability> value) {
        this.capabilities = value;
    }

    @JsonProperty("connections")
    public List<Connection> getConnections() {
        return connections;
    }

    @JsonProperty("connections")
    public void setConnections(List<Connection> value) {
        this.connections = value;
    }

    @JsonProperty("cookie")
    public Map<String, String> getCookie() {
        return cookie;
    }

    @JsonProperty("cookie")
    public void setCookie(Map<String, String> value) {
        this.cookie = value;
    }

    @JsonProperty("description")
    public String getDescription() {
        return description;
    }

    @JsonProperty("description")
    public void setDescription(String value) {
        this.description = value;
    }

    @JsonProperty("displayCategories")
    public List<DisplayCategory> getDisplayCategories() {
        return displayCategories;
    }

    @JsonProperty("displayCategories")
    public void setDisplayCategories(List<DisplayCategory> value) {
        this.displayCategories = value;
    }

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

    @JsonProperty("manufacturerName")
    public String getManufacturerName() {
        return manufacturerName;
    }

    @JsonProperty("manufacturerName")
    public void setManufacturerName(String value) {
        this.manufacturerName = value;
    }
}
