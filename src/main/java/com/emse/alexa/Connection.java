package com.emse.alexa;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Connection {
    private Object homeID;
    private Object macAddress;
    private Object nodeID;
    private ConnectionType type;
    private Object value;

    @JsonProperty("homeId")
    public Object getHomeID() {
        return homeID;
    }

    @JsonProperty("homeId")
    public void setHomeID(Object value) {
        this.homeID = value;
    }

    @JsonProperty("macAddress")
    public Object getMACAddress() {
        return macAddress;
    }

    @JsonProperty("macAddress")
    public void setMACAddress(Object value) {
        this.macAddress = value;
    }

    @JsonProperty("nodeId")
    public Object getNodeID() {
        return nodeID;
    }

    @JsonProperty("nodeId")
    public void setNodeID(Object value) {
        this.nodeID = value;
    }

    @JsonProperty("type")
    public ConnectionType getType() {
        return type;
    }

    @JsonProperty("type")
    public void setType(ConnectionType value) {
        this.type = value;
    }

    @JsonProperty("value")
    public Object getValue() {
        return value;
    }

    @JsonProperty("value")
    public void setValue(Object value) {
        this.value = value;
    }
}
