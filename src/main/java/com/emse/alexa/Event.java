package com.emse.alexa;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Event {
    private EventEndpoint endpoint;
    private Header header;
    private Payload payload;

    @JsonProperty("endpoint")
    public EventEndpoint getEndpoint() {
        return endpoint;
    }

    @JsonProperty("endpoint")
    public void setEndpoint(EventEndpoint value) {
        this.endpoint = value;
    }

    @JsonProperty("header")
    public Header getHeader() {
        return header;
    }

    @JsonProperty("header")
    public void setHeader(Header value) {
        this.header = value;
    }

    @JsonProperty("payload")
    public Payload getPayload() {
        return payload;
    }

    @JsonProperty("payload")
    public void setPayload(Payload value) {
        this.payload = value;
    }
}
