package com.emse.alexa;

import com.fasterxml.jackson.annotation.*;
import com.google.gson.Gson;

/**
 * A JSON message sent from a skill to Alexa, either proactively or as a response to a
 * directive
 *
 * A Response message for Alexa
 *
 * A Response message for Alexa.SceneController
 *
 * A Response message for Alexa.RTCSessionController
 *
 * A Response message for Alexa.SecurityPanelController
 *
 * A Response message for Alexa.WakeOnLANController
 *
 * A Response message for Alexa.SeekController
 *
 * A Response message for Alexa.MediaMetadata
 *
 * A Response message for Alexa.CameraStreamController
 *
 * A Response message for Alexa.Authorization
 *
 * A State Report message for Alexa
 *
 * An ErrorResponse message for Alexa
 *
 * An ErrorResponse message for Alexa.ThermostatController
 *
 * An ErrorResponse message for Alexa.SecurityPanelController
 *
 * An ErrorResponse message for Alexa.Cooking
 *
 * An ErrorResponse message for Alexa.Authorization
 *
 * A ChangeReport message for Alexa
 *
 * A DeferredResponse message for Alexa
 *
 * A proactive event message for Alexa.DoorbellEventSource
 *
 * A proactive event message for Alexa.AutomationManagement
 *
 * A proactive event message for Alexa.MediaMetadata
 *
 * A Discover.Response message for Alexa.Discovery
 *
 * An AddOrUpdateReport message for Alexa.Discovery
 */
public class Coordinate {
    private Context context;
    private Event event;

    @JsonProperty("context")
    public Context getContext() { return context; }
    @JsonProperty("context")
    public void setContext(Context value) { this.context = value; }

    @JsonProperty("event")
    public Event getEvent() { return event; }
    @JsonProperty("event")
    public void setEvent(Event value) { this.event = value; }
}