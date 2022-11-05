package com.emse.alexa;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder;

import java.io.IOException;

public class Header {
    private String correlationToken;
    private String messageID;
    private HeaderName name;
    private HeaderNamespace namespace;
    private PayloadVersion payloadVersion;

    @JsonProperty("correlationToken")
    public String getCorrelationToken() {
        return correlationToken;
    }

    @JsonProperty("correlationToken")
    public void setCorrelationToken(String value) {
        this.correlationToken = value;
    }

    @JsonProperty("messageId")
    public String getMessageID() {
        return messageID;
    }

    @JsonProperty("messageId")
    public void setMessageID(String value) {
        this.messageID = value;
    }

    @JsonProperty("name")
    public HeaderName getName() {
        return name;
    }

    @JsonProperty("name")
    public void setName(HeaderName value) {
        this.name = value;
    }

    @JsonProperty("namespace")
    public HeaderNamespace getNamespace() {
        return namespace;
    }

    @JsonProperty("namespace")
    public void setNamespace(HeaderNamespace value) {
        this.namespace = value;
    }

    @JsonProperty("payloadVersion")
    public PayloadVersion getPayloadVersion() {
        return payloadVersion;
    }

    @JsonProperty("payloadVersion")
    public void setPayloadVersion(PayloadVersion value) {
        this.payloadVersion = value;
    }
}
