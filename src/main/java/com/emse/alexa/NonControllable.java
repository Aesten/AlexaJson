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

@JsonDeserialize(using = NonControllable.Deserializer.class)
@JsonSerialize(using = NonControllable.Serializer.class)
public class NonControllable {
    public Boolean boolValue;
    public Long integerValue;
    public SupportsDeactivationEnum enumValue;

    static class Deserializer extends JsonDeserializer<NonControllable> {
        @Override
        public NonControllable deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
            NonControllable value = new NonControllable();
            switch (jsonParser.currentToken()) {
                case VALUE_NULL:
                    break;
                case VALUE_NUMBER_INT:
                    value.integerValue = jsonParser.readValueAs(Long.class);
                    break;
                case VALUE_TRUE:
                case VALUE_FALSE:
                    value.boolValue = jsonParser.readValueAs(Boolean.class);
                    break;
                case VALUE_STRING:
                    String string = jsonParser.readValueAs(String.class);
                    try {
                        value.enumValue = SupportsDeactivationEnum.forValue(string);
                    } catch (Exception ex) {
                        // Ignored
                    }
                    break;
                default:
                    throw new IOException("Cannot deserialize NonControllable");
            }
            return value;
        }
    }

    static class Serializer extends JsonSerializer<NonControllable> {
        @Override
        public void serialize(NonControllable obj, JsonGenerator jsonGenerator, SerializerProvider serializerProvider) throws IOException {
            if (obj.boolValue != null) {
                jsonGenerator.writeObject(obj.boolValue);
                return;
            }
            if (obj.integerValue != null) {
                jsonGenerator.writeObject(obj.integerValue);
                return;
            }
            if (obj.enumValue != null) {
                jsonGenerator.writeObject(obj.enumValue);
                return;
            }
            jsonGenerator.writeNull();
        }
    }
}
