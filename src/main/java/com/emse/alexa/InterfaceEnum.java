package com.emse.alexa;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

import java.io.IOException;

public enum InterfaceEnum {
    ALEXA, ALEXA_AUTOMATION_MANAGEMENT, ALEXA_BRIGHTNESS_CONTROLLER, ALEXA_CAMERA_STREAM_CONTROLLER, ALEXA_CHANNEL_CONTROLLER, ALEXA_COLOR_CONTROLLER, ALEXA_COLOR_TEMPERATURE_CONTROLLER, ALEXA_CONTACT_SENSOR, ALEXA_COOKING, ALEXA_COOKING_PRESET_CONTROLLER, ALEXA_COOKING_TIME_CONTROLLER, ALEXA_CUSTOM_INTENT, ALEXA_DOORBELL_EVENT_SOURCE, ALEXA_ENDPOINT_HEALTH, ALEXA_EQUALIZER_CONTROLLER, ALEXA_EVENT_DETECTION_SENSOR, ALEXA_INPUT_CONTROLLER, ALEXA_INVENTORY_LEVEL_SENSOR, ALEXA_LAUNCHER, ALEXA_LOCK_CONTROLLER, ALEXA_MEDIA_METADATA, ALEXA_MODE_CONTROLLER, ALEXA_MOTION_SENSOR, ALEXA_NETWORKING_ACCESS_CONTROLLER, ALEXA_NETWORKING_CONNECTED_DEVICE, ALEXA_NETWORKING_HOME_NETWORK_CONTROLLER, ALEXA_PERCENTAGE_CONTROLLER, ALEXA_PLAYBACK_CONTROLLER, ALEXA_POWER_CONTROLLER, ALEXA_POWER_LEVEL_CONTROLLER, ALEXA_RANGE_CONTROLLER, ALEXA_RECORD_CONTROLLER, ALEXA_REMOTE_VIDEO_PLAYER, ALEXA_RTC_SESSION_CONTROLLER, ALEXA_SCENE_CONTROLLER, ALEXA_SECURITY_PANEL_CONTROLLER, ALEXA_SEEK_CONTROLLER, ALEXA_SPEAKER, ALEXA_STEP_SPEAKER, ALEXA_TEMPERATURE_SENSOR, ALEXA_THERMOSTAT_CONTROLLER, ALEXA_TIME_HOLD_CONTROLLER, ALEXA_TOGGLE_CONTROLLER, ALEXA_WAKE_ON_LAN_CONTROLLER;

    @JsonValue
    public String toValue() {
        return switch (this) {
            case ALEXA -> "Alexa";
            case ALEXA_AUTOMATION_MANAGEMENT -> "Alexa.AutomationManagement";
            case ALEXA_BRIGHTNESS_CONTROLLER -> "Alexa.BrightnessController";
            case ALEXA_CAMERA_STREAM_CONTROLLER -> "Alexa.CameraStreamController";
            case ALEXA_CHANNEL_CONTROLLER -> "Alexa.ChannelController";
            case ALEXA_COLOR_CONTROLLER -> "Alexa.ColorController";
            case ALEXA_COLOR_TEMPERATURE_CONTROLLER -> "Alexa.ColorTemperatureController";
            case ALEXA_CONTACT_SENSOR -> "Alexa.ContactSensor";
            case ALEXA_COOKING -> "Alexa.Cooking";
            case ALEXA_COOKING_PRESET_CONTROLLER -> "Alexa.Cooking.PresetController";
            case ALEXA_COOKING_TIME_CONTROLLER -> "Alexa.Cooking.TimeController";
            case ALEXA_CUSTOM_INTENT -> "Alexa.CustomIntent";
            case ALEXA_DOORBELL_EVENT_SOURCE -> "Alexa.DoorbellEventSource";
            case ALEXA_ENDPOINT_HEALTH -> "Alexa.EndpointHealth";
            case ALEXA_EQUALIZER_CONTROLLER -> "Alexa.EqualizerController";
            case ALEXA_EVENT_DETECTION_SENSOR -> "Alexa.EventDetectionSensor";
            case ALEXA_INPUT_CONTROLLER -> "Alexa.InputController";
            case ALEXA_INVENTORY_LEVEL_SENSOR -> "Alexa.InventoryLevelSensor";
            case ALEXA_LAUNCHER -> "Alexa.Launcher";
            case ALEXA_LOCK_CONTROLLER -> "Alexa.LockController";
            case ALEXA_MEDIA_METADATA -> "Alexa.MediaMetadata";
            case ALEXA_MODE_CONTROLLER -> "Alexa.ModeController";
            case ALEXA_MOTION_SENSOR -> "Alexa.MotionSensor";
            case ALEXA_NETWORKING_ACCESS_CONTROLLER -> "Alexa.Networking.AccessController";
            case ALEXA_NETWORKING_CONNECTED_DEVICE -> "Alexa.Networking.ConnectedDevice";
            case ALEXA_NETWORKING_HOME_NETWORK_CONTROLLER -> "Alexa.Networking.HomeNetworkController";
            case ALEXA_PERCENTAGE_CONTROLLER -> "Alexa.PercentageController";
            case ALEXA_PLAYBACK_CONTROLLER -> "Alexa.PlaybackController";
            case ALEXA_POWER_CONTROLLER -> "Alexa.PowerController";
            case ALEXA_POWER_LEVEL_CONTROLLER -> "Alexa.PowerLevelController";
            case ALEXA_RANGE_CONTROLLER -> "Alexa.RangeController";
            case ALEXA_RECORD_CONTROLLER -> "Alexa.RecordController";
            case ALEXA_REMOTE_VIDEO_PLAYER -> "Alexa.RemoteVideoPlayer";
            case ALEXA_RTC_SESSION_CONTROLLER -> "Alexa.RTCSessionController";
            case ALEXA_SCENE_CONTROLLER -> "Alexa.SceneController";
            case ALEXA_SECURITY_PANEL_CONTROLLER -> "Alexa.SecurityPanelController";
            case ALEXA_SEEK_CONTROLLER -> "Alexa.SeekController";
            case ALEXA_SPEAKER -> "Alexa.Speaker";
            case ALEXA_STEP_SPEAKER -> "Alexa.StepSpeaker";
            case ALEXA_TEMPERATURE_SENSOR -> "Alexa.TemperatureSensor";
            case ALEXA_THERMOSTAT_CONTROLLER -> "Alexa.ThermostatController";
            case ALEXA_TIME_HOLD_CONTROLLER -> "Alexa.TimeHoldController";
            case ALEXA_TOGGLE_CONTROLLER -> "Alexa.ToggleController";
            case ALEXA_WAKE_ON_LAN_CONTROLLER -> "Alexa.WakeOnLANController";
        };
    }

    @JsonCreator
    public static InterfaceEnum forValue(String value) throws IOException {
        if (value.equals("Alexa")) return ALEXA;
        if (value.equals("Alexa.AutomationManagement")) return ALEXA_AUTOMATION_MANAGEMENT;
        if (value.equals("Alexa.BrightnessController")) return ALEXA_BRIGHTNESS_CONTROLLER;
        if (value.equals("Alexa.CameraStreamController")) return ALEXA_CAMERA_STREAM_CONTROLLER;
        if (value.equals("Alexa.ChannelController")) return ALEXA_CHANNEL_CONTROLLER;
        if (value.equals("Alexa.ColorController")) return ALEXA_COLOR_CONTROLLER;
        if (value.equals("Alexa.ColorTemperatureController")) return ALEXA_COLOR_TEMPERATURE_CONTROLLER;
        if (value.equals("Alexa.ContactSensor")) return ALEXA_CONTACT_SENSOR;
        if (value.equals("Alexa.Cooking")) return ALEXA_COOKING;
        if (value.equals("Alexa.Cooking.PresetController")) return ALEXA_COOKING_PRESET_CONTROLLER;
        if (value.equals("Alexa.Cooking.TimeController")) return ALEXA_COOKING_TIME_CONTROLLER;
        if (value.equals("Alexa.CustomIntent")) return ALEXA_CUSTOM_INTENT;
        if (value.equals("Alexa.DoorbellEventSource")) return ALEXA_DOORBELL_EVENT_SOURCE;
        if (value.equals("Alexa.EndpointHealth")) return ALEXA_ENDPOINT_HEALTH;
        if (value.equals("Alexa.EqualizerController")) return ALEXA_EQUALIZER_CONTROLLER;
        if (value.equals("Alexa.EventDetectionSensor")) return ALEXA_EVENT_DETECTION_SENSOR;
        if (value.equals("Alexa.InputController")) return ALEXA_INPUT_CONTROLLER;
        if (value.equals("Alexa.InventoryLevelSensor")) return ALEXA_INVENTORY_LEVEL_SENSOR;
        if (value.equals("Alexa.Launcher")) return ALEXA_LAUNCHER;
        if (value.equals("Alexa.LockController")) return ALEXA_LOCK_CONTROLLER;
        if (value.equals("Alexa.MediaMetadata")) return ALEXA_MEDIA_METADATA;
        if (value.equals("Alexa.ModeController")) return ALEXA_MODE_CONTROLLER;
        if (value.equals("Alexa.MotionSensor")) return ALEXA_MOTION_SENSOR;
        if (value.equals("Alexa.Networking.AccessController")) return ALEXA_NETWORKING_ACCESS_CONTROLLER;
        if (value.equals("Alexa.Networking.ConnectedDevice")) return ALEXA_NETWORKING_CONNECTED_DEVICE;
        if (value.equals("Alexa.Networking.HomeNetworkController")) return ALEXA_NETWORKING_HOME_NETWORK_CONTROLLER;
        if (value.equals("Alexa.PercentageController")) return ALEXA_PERCENTAGE_CONTROLLER;
        if (value.equals("Alexa.PlaybackController")) return ALEXA_PLAYBACK_CONTROLLER;
        if (value.equals("Alexa.PowerController")) return ALEXA_POWER_CONTROLLER;
        if (value.equals("Alexa.PowerLevelController")) return ALEXA_POWER_LEVEL_CONTROLLER;
        if (value.equals("Alexa.RangeController")) return ALEXA_RANGE_CONTROLLER;
        if (value.equals("Alexa.RecordController")) return ALEXA_RECORD_CONTROLLER;
        if (value.equals("Alexa.RemoteVideoPlayer")) return ALEXA_REMOTE_VIDEO_PLAYER;
        if (value.equals("Alexa.RTCSessionController")) return ALEXA_RTC_SESSION_CONTROLLER;
        if (value.equals("Alexa.SceneController")) return ALEXA_SCENE_CONTROLLER;
        if (value.equals("Alexa.SecurityPanelController")) return ALEXA_SECURITY_PANEL_CONTROLLER;
        if (value.equals("Alexa.SeekController")) return ALEXA_SEEK_CONTROLLER;
        if (value.equals("Alexa.Speaker")) return ALEXA_SPEAKER;
        if (value.equals("Alexa.StepSpeaker")) return ALEXA_STEP_SPEAKER;
        if (value.equals("Alexa.TemperatureSensor")) return ALEXA_TEMPERATURE_SENSOR;
        if (value.equals("Alexa.ThermostatController")) return ALEXA_THERMOSTAT_CONTROLLER;
        if (value.equals("Alexa.TimeHoldController")) return ALEXA_TIME_HOLD_CONTROLLER;
        if (value.equals("Alexa.ToggleController")) return ALEXA_TOGGLE_CONTROLLER;
        if (value.equals("Alexa.WakeOnLANController")) return ALEXA_WAKE_ON_LAN_CONTROLLER;
        throw new IOException("Cannot deserialize InterfaceEnum");
    }
}
