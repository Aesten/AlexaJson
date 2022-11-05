package com.emse.alexa;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ValueElement {
    private ValueName name;
    private Long value;
    private Long level;
    private String capability;
    private String instance;
    private ValueStatus status;

    @JsonProperty("name")
    public ValueName getName() { return name; }
    @JsonProperty("name")
    public void setName(ValueName value) { this.name = value; }

    @JsonProperty("value")
    public Long getValue() { return value; }
    @JsonProperty("value")
    public void setValue(Long value) { this.value = value; }

    @JsonProperty("level")
    public Long getLevel() { return level; }
    @JsonProperty("level")
    public void setLevel(Long value) { this.level = value; }

    @JsonProperty("capability")
    public String getCapability() { return capability; }
    @JsonProperty("capability")
    public void setCapability(String value) { this.capability = value; }

    @JsonProperty("instance")
    public String getInstance() { return instance; }
    @JsonProperty("instance")
    public void setInstance(String value) { this.instance = value; }

    @JsonProperty("status")
    public ValueStatus getStatus() { return status; }
    @JsonProperty("status")
    public void setStatus(ValueStatus value) { this.status = value; }
}