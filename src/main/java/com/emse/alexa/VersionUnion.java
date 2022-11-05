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

@JsonDeserialize(using = VersionUnion.Deserializer.class)
@JsonSerialize(using = VersionUnion.Serializer.class)
public class VersionUnion {
    public Long integerValue;
    public VersionEnum enumValue;

    static class Deserializer extends JsonDeserializer<VersionUnion> {
        @Override
        public VersionUnion deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
            VersionUnion value = new VersionUnion();
            switch (jsonParser.currentToken()) {
                case VALUE_NUMBER_INT -> value.integerValue = jsonParser.readValueAs(Long.class);
                case VALUE_STRING -> {
                    String string = jsonParser.readValueAs(String.class);
                    try {
                        value.enumValue = VersionEnum.forValue(string);
                    } catch (Exception ex) {
                        // Ignored
                    }
                }
                default -> throw new IOException("Cannot deserialize VersionUnion");
            }
            return value;
        }
    }

    static class Serializer extends JsonSerializer<VersionUnion> {
        @Override
        public void serialize(VersionUnion obj, JsonGenerator jsonGenerator, SerializerProvider serializerProvider) throws IOException {
            if (obj.integerValue != null) {
                jsonGenerator.writeObject(obj.integerValue);
                return;
            }
            if (obj.enumValue != null) {
                jsonGenerator.writeObject(obj.enumValue);
                return;
            }
            throw new IOException("VersionUnion must not be null");
        }
    }
}
