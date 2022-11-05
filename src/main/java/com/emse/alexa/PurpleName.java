package com.emse.alexa;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

import java.io.IOException;

public enum PurpleName {
    ANIMAL_PRESENCE_DETECTION_STATE, ARM_STATE, AUTOMATION_STATUSES, BABY_CRY_DETECTION_STATE, BANDS, BRIGHTNESS, BURGLARY_ALARM, CARBON_MONOXIDE_ALARM, CHANNEL, COLOR, COLOR_TEMPERATURE_IN_KELVIN, CONNECTIVITY, COOKING_MODE, COOKING_POWER_LEVEL, COOKING_TIME_INTERVAL, DETECTION_MODES, DETECTION_STATE, DOG_BARK_DETECTION_STATE, ENABLEMENT_MODE, FIRE_ALARM, FOOD_ITEM, GLASS_BREAK_DETECTION_STATE, HOLD_END_TIME, HOLD_START_TIME, HUMAN_PRESENCE_DETECTION_STATE, INPUT, LEVEL, LOCK_STATE, LOWER_SETPOINT, MODE, MUTED, NETWORK_ACCESS, PERCENTAGE, POWER_LEVEL, POWER_STATE, PRESET_NAME, RANGE_VALUE, RECORDING_STATE, REQUESTED_COOK_TIME, REQUESTED_FOOD_DONENESS, SMOKE_SIREN_DETECTION_STATE, TARGET, TARGET_SETPOINT, TEMPERATURE, THERMOSTAT_MODE, TOGGLE_STATE, UPPER_SETPOINT, VEHICLE_PRESENCE_DETECTION_STATE, VOLUME, WATER_ALARM;

    @JsonValue
    public String toValue() {
        return switch (this) {
            case ANIMAL_PRESENCE_DETECTION_STATE -> "animalPresenceDetectionState";
            case ARM_STATE -> "armState";
            case AUTOMATION_STATUSES -> "automationStatuses";
            case BABY_CRY_DETECTION_STATE -> "babyCryDetectionState";
            case BANDS -> "bands";
            case BRIGHTNESS -> "brightness";
            case BURGLARY_ALARM -> "burglaryAlarm";
            case CARBON_MONOXIDE_ALARM -> "carbonMonoxideAlarm";
            case CHANNEL -> "channel";
            case COLOR -> "color";
            case COLOR_TEMPERATURE_IN_KELVIN -> "colorTemperatureInKelvin";
            case CONNECTIVITY -> "connectivity";
            case COOKING_MODE -> "cookingMode";
            case COOKING_POWER_LEVEL -> "cookingPowerLevel";
            case COOKING_TIME_INTERVAL -> "cookingTimeInterval";
            case DETECTION_MODES -> "detectionModes";
            case DETECTION_STATE -> "detectionState";
            case DOG_BARK_DETECTION_STATE -> "dogBarkDetectionState";
            case ENABLEMENT_MODE -> "enablementMode";
            case FIRE_ALARM -> "fireAlarm";
            case FOOD_ITEM -> "foodItem";
            case GLASS_BREAK_DETECTION_STATE -> "glassBreakDetectionState";
            case HOLD_END_TIME -> "holdEndTime";
            case HOLD_START_TIME -> "holdStartTime";
            case HUMAN_PRESENCE_DETECTION_STATE -> "humanPresenceDetectionState";
            case INPUT -> "input";
            case LEVEL -> "level";
            case LOCK_STATE -> "lockState";
            case LOWER_SETPOINT -> "lowerSetpoint";
            case MODE -> "mode";
            case MUTED -> "muted";
            case NETWORK_ACCESS -> "networkAccess";
            case PERCENTAGE -> "percentage";
            case POWER_LEVEL -> "powerLevel";
            case POWER_STATE -> "powerState";
            case PRESET_NAME -> "presetName";
            case RANGE_VALUE -> "rangeValue";
            case RECORDING_STATE -> "RecordingState";
            case REQUESTED_COOK_TIME -> "requestedCookTime";
            case REQUESTED_FOOD_DONENESS -> "requestedFoodDoneness";
            case SMOKE_SIREN_DETECTION_STATE -> "smokeSirenDetectionState";
            case TARGET -> "target";
            case TARGET_SETPOINT -> "targetSetpoint";
            case TEMPERATURE -> "temperature";
            case THERMOSTAT_MODE -> "thermostatMode";
            case TOGGLE_STATE -> "toggleState";
            case UPPER_SETPOINT -> "upperSetpoint";
            case VEHICLE_PRESENCE_DETECTION_STATE -> "vehiclePresenceDetectionState";
            case VOLUME -> "volume";
            case WATER_ALARM -> "waterAlarm";
        };
    }

    @JsonCreator
    public static PurpleName forValue(String value) throws IOException {
        if (value.equals("animalPresenceDetectionState")) return ANIMAL_PRESENCE_DETECTION_STATE;
        if (value.equals("armState")) return ARM_STATE;
        if (value.equals("automationStatuses")) return AUTOMATION_STATUSES;
        if (value.equals("babyCryDetectionState")) return BABY_CRY_DETECTION_STATE;
        if (value.equals("bands")) return BANDS;
        if (value.equals("brightness")) return BRIGHTNESS;
        if (value.equals("burglaryAlarm")) return BURGLARY_ALARM;
        if (value.equals("carbonMonoxideAlarm")) return CARBON_MONOXIDE_ALARM;
        if (value.equals("channel")) return CHANNEL;
        if (value.equals("color")) return COLOR;
        if (value.equals("colorTemperatureInKelvin")) return COLOR_TEMPERATURE_IN_KELVIN;
        if (value.equals("connectivity")) return CONNECTIVITY;
        if (value.equals("cookingMode")) return COOKING_MODE;
        if (value.equals("cookingPowerLevel")) return COOKING_POWER_LEVEL;
        if (value.equals("cookingTimeInterval")) return COOKING_TIME_INTERVAL;
        if (value.equals("detectionModes")) return DETECTION_MODES;
        if (value.equals("detectionState")) return DETECTION_STATE;
        if (value.equals("dogBarkDetectionState")) return DOG_BARK_DETECTION_STATE;
        if (value.equals("enablementMode")) return ENABLEMENT_MODE;
        if (value.equals("fireAlarm")) return FIRE_ALARM;
        if (value.equals("foodItem")) return FOOD_ITEM;
        if (value.equals("glassBreakDetectionState")) return GLASS_BREAK_DETECTION_STATE;
        if (value.equals("holdEndTime")) return HOLD_END_TIME;
        if (value.equals("holdStartTime")) return HOLD_START_TIME;
        if (value.equals("humanPresenceDetectionState")) return HUMAN_PRESENCE_DETECTION_STATE;
        if (value.equals("input")) return INPUT;
        if (value.equals("level")) return LEVEL;
        if (value.equals("lockState")) return LOCK_STATE;
        if (value.equals("lowerSetpoint")) return LOWER_SETPOINT;
        if (value.equals("mode")) return MODE;
        if (value.equals("muted")) return MUTED;
        if (value.equals("networkAccess")) return NETWORK_ACCESS;
        if (value.equals("percentage")) return PERCENTAGE;
        if (value.equals("powerLevel")) return POWER_LEVEL;
        if (value.equals("powerState")) return POWER_STATE;
        if (value.equals("presetName")) return PRESET_NAME;
        if (value.equals("rangeValue")) return RANGE_VALUE;
        if (value.equals("RecordingState")) return RECORDING_STATE;
        if (value.equals("requestedCookTime")) return REQUESTED_COOK_TIME;
        if (value.equals("requestedFoodDoneness")) return REQUESTED_FOOD_DONENESS;
        if (value.equals("smokeSirenDetectionState")) return SMOKE_SIREN_DETECTION_STATE;
        if (value.equals("target")) return TARGET;
        if (value.equals("targetSetpoint")) return TARGET_SETPOINT;
        if (value.equals("temperature")) return TEMPERATURE;
        if (value.equals("thermostatMode")) return THERMOSTAT_MODE;
        if (value.equals("toggleState")) return TOGGLE_STATE;
        if (value.equals("upperSetpoint")) return UPPER_SETPOINT;
        if (value.equals("vehiclePresenceDetectionState")) return VEHICLE_PRESENCE_DETECTION_STATE;
        if (value.equals("volume")) return VOLUME;
        if (value.equals("waterAlarm")) return WATER_ALARM;
        throw new IOException("Cannot deserialize PurpleName");
    }
}