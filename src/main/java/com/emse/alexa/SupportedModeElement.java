package com.emse.alexa;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

import java.io.IOException;

@JsonDeserialize(using = SupportedModeElement.Deserializer.class)
@JsonSerialize(using = SupportedModeElement.Serializer.class)
public class SupportedModeElement {
    public SupportedModeEnum enumValue;
    public SupportedModeClass supportedModeClassValue;

    static class Deserializer extends JsonDeserializer<SupportedModeElement> {
        @Override
        public SupportedModeElement deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
            SupportedModeElement value = new SupportedModeElement();
            switch (jsonParser.currentToken()) {
                case VALUE_STRING -> {
                    String string = jsonParser.readValueAs(String.class);
                    try {
                        value.enumValue = SupportedModeEnum.forValue(string);
                    } catch (Exception ex) {
                        // Ignored
                    }
                }
                case START_OBJECT -> value.supportedModeClassValue = jsonParser.readValueAs(SupportedModeClass.class);
                default -> throw new IOException("Cannot deserialize SupportedModeElement");
            }
            return value;
        }
    }

    static class Serializer extends JsonSerializer<SupportedModeElement> {
        @Override
        public void serialize(SupportedModeElement obj, JsonGenerator jsonGenerator, SerializerProvider serializerProvider) throws IOException {
            if (obj.enumValue != null) {
                jsonGenerator.writeObject(obj.enumValue);
                return;
            }
            if (obj.supportedModeClassValue != null) {
                jsonGenerator.writeObject(obj.supportedModeClassValue);
                return;
            }
            throw new IOException("SupportedModeElement must not be null");
        }
    }
}
