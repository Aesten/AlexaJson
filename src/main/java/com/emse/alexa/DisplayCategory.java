package com.emse.alexa;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

import java.io.IOException;

public enum DisplayCategory {
    ACTIVITY_TRIGGER, CAMERA, COMPUTER, CONTACT_SENSOR, DOOR, DOORBELL, EXTERIOR_BLIND, FAN, GAME_CONSOLE, GARAGE_DOOR, INTERIOR_BLIND, LAPTOP, LIGHT, MICROWAVE, MOBILE_PHONE, MOTION_SENSOR, MUSIC_SYSTEM, NETWORK_HARDWARE, OTHER, OVEN, PHONE, SCENE_TRIGGER, SCREEN, SECURITY_PANEL, SMARTLOCK, SMARTPLUG, SPEAKER, STREAMING_DEVICE, SWITCH, TABLET, TEMPERATURE_SENSOR, THERMOSTAT, TV, WEARABLE;

    @JsonValue
    public String toValue() {
        return switch (this) {
            case ACTIVITY_TRIGGER -> "ACTIVITY_TRIGGER";
            case CAMERA -> "CAMERA";
            case COMPUTER -> "COMPUTER";
            case CONTACT_SENSOR -> "CONTACT_SENSOR";
            case DOOR -> "DOOR";
            case DOORBELL -> "DOORBELL";
            case EXTERIOR_BLIND -> "EXTERIOR_BLIND";
            case FAN -> "FAN";
            case GAME_CONSOLE -> "GAME_CONSOLE";
            case GARAGE_DOOR -> "GARAGE_DOOR";
            case INTERIOR_BLIND -> "INTERIOR_BLIND";
            case LAPTOP -> "LAPTOP";
            case LIGHT -> "LIGHT";
            case MICROWAVE -> "MICROWAVE";
            case MOBILE_PHONE -> "MOBILE_PHONE";
            case MOTION_SENSOR -> "MOTION_SENSOR";
            case MUSIC_SYSTEM -> "MUSIC_SYSTEM";
            case NETWORK_HARDWARE -> "NETWORK_HARDWARE";
            case OTHER -> "OTHER";
            case OVEN -> "OVEN";
            case PHONE -> "PHONE";
            case SCENE_TRIGGER -> "SCENE_TRIGGER";
            case SCREEN -> "SCREEN";
            case SECURITY_PANEL -> "SECURITY_PANEL";
            case SMARTLOCK -> "SMARTLOCK";
            case SMARTPLUG -> "SMARTPLUG";
            case SPEAKER -> "SPEAKER";
            case STREAMING_DEVICE -> "STREAMING_DEVICE";
            case SWITCH -> "SWITCH";
            case TABLET -> "TABLET";
            case TEMPERATURE_SENSOR -> "TEMPERATURE_SENSOR";
            case THERMOSTAT -> "THERMOSTAT";
            case TV -> "TV";
            case WEARABLE -> "WEARABLE";
        };
    }

    @JsonCreator
    public static DisplayCategory forValue(String value) throws IOException {
        if (value.equals("ACTIVITY_TRIGGER")) return ACTIVITY_TRIGGER;
        if (value.equals("CAMERA")) return CAMERA;
        if (value.equals("COMPUTER")) return COMPUTER;
        if (value.equals("CONTACT_SENSOR")) return CONTACT_SENSOR;
        if (value.equals("DOOR")) return DOOR;
        if (value.equals("DOORBELL")) return DOORBELL;
        if (value.equals("EXTERIOR_BLIND")) return EXTERIOR_BLIND;
        if (value.equals("FAN")) return FAN;
        if (value.equals("GAME_CONSOLE")) return GAME_CONSOLE;
        if (value.equals("GARAGE_DOOR")) return GARAGE_DOOR;
        if (value.equals("INTERIOR_BLIND")) return INTERIOR_BLIND;
        if (value.equals("LAPTOP")) return LAPTOP;
        if (value.equals("LIGHT")) return LIGHT;
        if (value.equals("MICROWAVE")) return MICROWAVE;
        if (value.equals("MOBILE_PHONE")) return MOBILE_PHONE;
        if (value.equals("MOTION_SENSOR")) return MOTION_SENSOR;
        if (value.equals("MUSIC_SYSTEM")) return MUSIC_SYSTEM;
        if (value.equals("NETWORK_HARDWARE")) return NETWORK_HARDWARE;
        if (value.equals("OTHER")) return OTHER;
        if (value.equals("OVEN")) return OVEN;
        if (value.equals("PHONE")) return PHONE;
        if (value.equals("SCENE_TRIGGER")) return SCENE_TRIGGER;
        if (value.equals("SCREEN")) return SCREEN;
        if (value.equals("SECURITY_PANEL")) return SECURITY_PANEL;
        if (value.equals("SMARTLOCK")) return SMARTLOCK;
        if (value.equals("SMARTPLUG")) return SMARTPLUG;
        if (value.equals("SPEAKER")) return SPEAKER;
        if (value.equals("STREAMING_DEVICE")) return STREAMING_DEVICE;
        if (value.equals("SWITCH")) return SWITCH;
        if (value.equals("TABLET")) return TABLET;
        if (value.equals("TEMPERATURE_SENSOR")) return TEMPERATURE_SENSOR;
        if (value.equals("THERMOSTAT")) return THERMOSTAT;
        if (value.equals("TV")) return TV;
        if (value.equals("WEARABLE")) return WEARABLE;
        throw new IOException("Cannot deserialize DisplayCategory");
    }
}
