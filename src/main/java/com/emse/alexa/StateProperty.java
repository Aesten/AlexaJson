package com.emse.alexa;

import com.fasterxml.jackson.annotation.JsonProperty;

public class StateProperty {
    private String instance;
    private PurpleName name;
    private PropertyNamespace namespace;
    private String timeOfSample;
    private double uncertaintyInMilliseconds;
    private PropertyValue value;

    @JsonProperty("instance")
    public String getInstance() { return instance; }
    @JsonProperty("instance")
    public void setInstance(String value) { this.instance = value; }

    @JsonProperty("name")
    public PurpleName getName() { return name; }
    @JsonProperty("name")
    public void setName(PurpleName value) { this.name = value; }

    @JsonProperty("namespace")
    public PropertyNamespace getNamespace() { return namespace; }
    @JsonProperty("namespace")
    public void setNamespace(PropertyNamespace value) { this.namespace = value; }

    @JsonProperty("timeOfSample")
    public String getTimeOfSample() { return timeOfSample; }
    @JsonProperty("timeOfSample")
    public void setTimeOfSample(String value) { this.timeOfSample = value; }

    @JsonProperty("uncertaintyInMilliseconds")
    public double getUncertaintyInMilliseconds() { return uncertaintyInMilliseconds; }
    @JsonProperty("uncertaintyInMilliseconds")
    public void setUncertaintyInMilliseconds(double value) { this.uncertaintyInMilliseconds = value; }

    @JsonProperty("value")
    public PropertyValue getValue() { return value; }
    @JsonProperty("value")
    public void setValue(PropertyValue value) { this.value = value; }
}
