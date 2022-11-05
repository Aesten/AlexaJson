package com.emse.alexa;

import com.fasterxml.jackson.annotation.JsonProperty;

public class StaticDeviceInformation {
    private String brand;
    private String deviceName;
    private String dhcp4Fingerprint;
    private String dhcp6Fingerprint;
    private String hostname;
    private String macAddress;
    private String model;
    private String operatingSystem;

    @JsonProperty("brand")
    public String getBrand() {
        return brand;
    }

    @JsonProperty("brand")
    public void setBrand(String value) {
        this.brand = value;
    }

    @JsonProperty("deviceName")
    public String getDeviceName() {
        return deviceName;
    }

    @JsonProperty("deviceName")
    public void setDeviceName(String value) {
        this.deviceName = value;
    }

    @JsonProperty("dhcp4Fingerprint")
    public String getDhcp4Fingerprint() {
        return dhcp4Fingerprint;
    }

    @JsonProperty("dhcp4Fingerprint")
    public void setDhcp4Fingerprint(String value) {
        this.dhcp4Fingerprint = value;
    }

    @JsonProperty("dhcp6Fingerprint")
    public String getDhcp6Fingerprint() {
        return dhcp6Fingerprint;
    }

    @JsonProperty("dhcp6Fingerprint")
    public void setDhcp6Fingerprint(String value) {
        this.dhcp6Fingerprint = value;
    }

    @JsonProperty("hostname")
    public String getHostname() {
        return hostname;
    }

    @JsonProperty("hostname")
    public void setHostname(String value) {
        this.hostname = value;
    }

    @JsonProperty("macAddress")
    public String getMACAddress() {
        return macAddress;
    }

    @JsonProperty("macAddress")
    public void setMACAddress(String value) {
        this.macAddress = value;
    }

    @JsonProperty("model")
    public String getModel() {
        return model;
    }

    @JsonProperty("model")
    public void setModel(String value) {
        this.model = value;
    }

    @JsonProperty("operatingSystem")
    public String getOperatingSystem() {
        return operatingSystem;
    }

    @JsonProperty("operatingSystem")
    public void setOperatingSystem(String value) {
        this.operatingSystem = value;
    }
}
