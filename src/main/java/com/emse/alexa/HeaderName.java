package com.emse.alexa;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

import java.io.IOException;

public enum HeaderName {
    ACCEPT_GRANT_RESPONSE, ACTIVATION_STARTED, ADD_OR_UPDATE_REPORT, ANSWER_GENERATED_FOR_SESSION, ARM_RESPONSE, CHANGE_REPORT, DEACTIVATION_STARTED, DEFERRED_RESPONSE, DISCOVER_RESPONSE, DOORBELL_PRESS, ERROR_RESPONSE, GET_ALEXA_AUTOMATION_STATUS, GET_MEDIA_METADATA_RESPONSE, MEDIA_CREATED_OR_UPDATED, MEDIA_DELETED, RESPONSE, SESSION_CONNECTED, SESSION_DISCONNECTED, STATE_REPORT, WAKE_UP;

    @JsonValue
    public String toValue() {
        return switch (this) {
            case ACCEPT_GRANT_RESPONSE -> "AcceptGrant.Response";
            case ACTIVATION_STARTED -> "ActivationStarted";
            case ADD_OR_UPDATE_REPORT -> "AddOrUpdateReport";
            case ANSWER_GENERATED_FOR_SESSION -> "AnswerGeneratedForSession";
            case ARM_RESPONSE -> "Arm.Response";
            case CHANGE_REPORT -> "ChangeReport";
            case DEACTIVATION_STARTED -> "DeactivationStarted";
            case DEFERRED_RESPONSE -> "DeferredResponse";
            case DISCOVER_RESPONSE -> "Discover.Response";
            case DOORBELL_PRESS -> "DoorbellPress";
            case ERROR_RESPONSE -> "ErrorResponse";
            case GET_ALEXA_AUTOMATION_STATUS -> "GetAlexaAutomationStatus";
            case GET_MEDIA_METADATA_RESPONSE -> "GetMediaMetadata.Response";
            case MEDIA_CREATED_OR_UPDATED -> "MediaCreatedOrUpdated";
            case MEDIA_DELETED -> "MediaDeleted";
            case RESPONSE -> "Response";
            case SESSION_CONNECTED -> "SessionConnected";
            case SESSION_DISCONNECTED -> "SessionDisconnected";
            case STATE_REPORT -> "StateReport";
            case WAKE_UP -> "WakeUp";
        };
    }

    @JsonCreator
    public static HeaderName forValue(String value) throws IOException {
        if (value.equals("AcceptGrant.Response")) return ACCEPT_GRANT_RESPONSE;
        if (value.equals("ActivationStarted")) return ACTIVATION_STARTED;
        if (value.equals("AddOrUpdateReport")) return ADD_OR_UPDATE_REPORT;
        if (value.equals("AnswerGeneratedForSession")) return ANSWER_GENERATED_FOR_SESSION;
        if (value.equals("Arm.Response")) return ARM_RESPONSE;
        if (value.equals("ChangeReport")) return CHANGE_REPORT;
        if (value.equals("DeactivationStarted")) return DEACTIVATION_STARTED;
        if (value.equals("DeferredResponse")) return DEFERRED_RESPONSE;
        if (value.equals("Discover.Response")) return DISCOVER_RESPONSE;
        if (value.equals("DoorbellPress")) return DOORBELL_PRESS;
        if (value.equals("ErrorResponse")) return ERROR_RESPONSE;
        if (value.equals("GetAlexaAutomationStatus")) return GET_ALEXA_AUTOMATION_STATUS;
        if (value.equals("GetMediaMetadata.Response")) return GET_MEDIA_METADATA_RESPONSE;
        if (value.equals("MediaCreatedOrUpdated")) return MEDIA_CREATED_OR_UPDATED;
        if (value.equals("MediaDeleted")) return MEDIA_DELETED;
        if (value.equals("Response")) return RESPONSE;
        if (value.equals("SessionConnected")) return SESSION_CONNECTED;
        if (value.equals("SessionDisconnected")) return SESSION_DISCONNECTED;
        if (value.equals("StateReport")) return STATE_REPORT;
        if (value.equals("WakeUp")) return WAKE_UP;
        throw new IOException("Cannot deserialize HeaderName");
    }
}
