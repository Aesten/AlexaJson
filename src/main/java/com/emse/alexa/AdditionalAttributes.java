package com.emse.alexa;

import com.fasterxml.jackson.annotation.JsonProperty;

public class AdditionalAttributes {
    private Object customIdentifier;
    private Object firmwareVersion;
    private String manufacturer;
    private Object model;
    private Object serialNumber;
    private Object softwareVersion;

    @JsonProperty("customIdentifier")
    public Object getCustomIdentifier() {
        return customIdentifier;
    }

    @JsonProperty("customIdentifier")
    public void setCustomIdentifier(Object value) {
        this.customIdentifier = value;
    }

    @JsonProperty("firmwareVersion")
    public Object getFirmwareVersion() {
        return firmwareVersion;
    }

    @JsonProperty("firmwareVersion")
    public void setFirmwareVersion(Object value) {
        this.firmwareVersion = value;
    }

    @JsonProperty("manufacturer")
    public String getManufacturer() {
        return manufacturer;
    }

    @JsonProperty("manufacturer")
    public void setManufacturer(String value) {
        this.manufacturer = value;
    }

    @JsonProperty("model")
    public Object getModel() {
        return model;
    }

    @JsonProperty("model")
    public void setModel(Object value) {
        this.model = value;
    }

    @JsonProperty("serialNumber")
    public Object getSerialNumber() {
        return serialNumber;
    }

    @JsonProperty("serialNumber")
    public void setSerialNumber(Object value) {
        this.serialNumber = value;
    }

    @JsonProperty("softwareVersion")
    public Object getSoftwareVersion() {
        return softwareVersion;
    }

    @JsonProperty("softwareVersion")
    public void setSoftwareVersion(Object value) {
        this.softwareVersion = value;
    }
}
