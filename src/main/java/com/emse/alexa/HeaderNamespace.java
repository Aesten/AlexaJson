package com.emse.alexa;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

import java.io.IOException;

public enum HeaderNamespace {
    ALEXA, ALEXA_AUTHORIZATION, ALEXA_AUTOMATION_MANAGEMENT, ALEXA_CAMERA_STREAM_CONTROLLER, ALEXA_COOKING, ALEXA_DISCOVERY, ALEXA_DOORBELL_EVENT_SOURCE, ALEXA_MEDIA_METADATA, ALEXA_RTC_SESSION_CONTROLLER, ALEXA_SCENE_CONTROLLER, ALEXA_SECURITY_PANEL_CONTROLLER, ALEXA_SEEK_CONTROLLER, ALEXA_THERMOSTAT_CONTROLLER, ALEXA_WAKE_ON_LAN_CONTROLLER;

    @JsonValue
    public String toValue() {
        return switch (this) {
            case ALEXA -> "Alexa";
            case ALEXA_AUTHORIZATION -> "Alexa.Authorization";
            case ALEXA_AUTOMATION_MANAGEMENT -> "Alexa.AutomationManagement";
            case ALEXA_CAMERA_STREAM_CONTROLLER -> "Alexa.CameraStreamController";
            case ALEXA_COOKING -> "Alexa.Cooking";
            case ALEXA_DISCOVERY -> "Alexa.Discovery";
            case ALEXA_DOORBELL_EVENT_SOURCE -> "Alexa.DoorbellEventSource";
            case ALEXA_MEDIA_METADATA -> "Alexa.MediaMetadata";
            case ALEXA_RTC_SESSION_CONTROLLER -> "Alexa.RTCSessionController";
            case ALEXA_SCENE_CONTROLLER -> "Alexa.SceneController";
            case ALEXA_SECURITY_PANEL_CONTROLLER -> "Alexa.SecurityPanelController";
            case ALEXA_SEEK_CONTROLLER -> "Alexa.SeekController";
            case ALEXA_THERMOSTAT_CONTROLLER -> "Alexa.ThermostatController";
            case ALEXA_WAKE_ON_LAN_CONTROLLER -> "Alexa.WakeOnLANController";
        };
    }

    @JsonCreator
    public static HeaderNamespace forValue(String value) throws IOException {
        if (value.equals("Alexa")) return ALEXA;
        if (value.equals("Alexa.Authorization")) return ALEXA_AUTHORIZATION;
        if (value.equals("Alexa.AutomationManagement")) return ALEXA_AUTOMATION_MANAGEMENT;
        if (value.equals("Alexa.CameraStreamController")) return ALEXA_CAMERA_STREAM_CONTROLLER;
        if (value.equals("Alexa.Cooking")) return ALEXA_COOKING;
        if (value.equals("Alexa.Discovery")) return ALEXA_DISCOVERY;
        if (value.equals("Alexa.DoorbellEventSource")) return ALEXA_DOORBELL_EVENT_SOURCE;
        if (value.equals("Alexa.MediaMetadata")) return ALEXA_MEDIA_METADATA;
        if (value.equals("Alexa.RTCSessionController")) return ALEXA_RTC_SESSION_CONTROLLER;
        if (value.equals("Alexa.SceneController")) return ALEXA_SCENE_CONTROLLER;
        if (value.equals("Alexa.SecurityPanelController")) return ALEXA_SECURITY_PANEL_CONTROLLER;
        if (value.equals("Alexa.SeekController")) return ALEXA_SEEK_CONTROLLER;
        if (value.equals("Alexa.ThermostatController")) return ALEXA_THERMOSTAT_CONTROLLER;
        if (value.equals("Alexa.WakeOnLANController")) return ALEXA_WAKE_ON_LAN_CONTROLLER;
        throw new IOException("Cannot deserialize HeaderNamespace");
    }
}
