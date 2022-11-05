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

@JsonDeserialize(using = Version.Deserializer.class)
@JsonSerialize(using = Version.Serializer.class)
public class Version {
    public Double doubleValue;
    public String stringValue;

    static class Deserializer extends JsonDeserializer<Version> {
        @Override
        public Version deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
            Version value = new Version();
            switch (jsonParser.currentToken()) {
                case VALUE_NUMBER_INT, VALUE_NUMBER_FLOAT -> value.doubleValue = jsonParser.readValueAs(Double.class);
                case VALUE_STRING -> value.stringValue = jsonParser.readValueAs(String.class);
                default -> throw new IOException("Cannot deserialize Version");
            }
            return value;
        }
    }

    static class Serializer extends JsonSerializer<Version> {
        @Override
        public void serialize(Version obj, JsonGenerator jsonGenerator, SerializerProvider serializerProvider) throws IOException {
            if (obj.doubleValue != null) {
                jsonGenerator.writeObject(obj.doubleValue);
                return;
            }
            if (obj.stringValue != null) {
                jsonGenerator.writeObject(obj.stringValue);
                return;
            }
            throw new IOException("Version must not be null");
        }
    }
}
