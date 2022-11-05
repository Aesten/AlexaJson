package com.emse.alexa;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

import java.io.IOException;
import java.util.List;

@JsonDeserialize(using = PropertyValue.Deserializer.class)
@JsonSerialize(using = PropertyValue.Serializer.class)
public class PropertyValue {
    public PurpleValue purpleValueValue;
    public Long integerValue;
    public Boolean boolValue;
    public List<ValueElement> valueElementArrayValue;
    public Double doubleValue;
    public String stringValue;

    static class Deserializer extends JsonDeserializer<PropertyValue> {
        @Override
        public PropertyValue deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
            PropertyValue value = new PropertyValue();
            switch (jsonParser.currentToken()) {
                case VALUE_NUMBER_INT -> value.integerValue = jsonParser.readValueAs(Long.class);
                case VALUE_NUMBER_FLOAT -> value.doubleValue = jsonParser.readValueAs(Double.class);
                case VALUE_TRUE, VALUE_FALSE -> value.boolValue = jsonParser.readValueAs(Boolean.class);
                case VALUE_STRING -> value.stringValue = jsonParser.readValueAs(String.class);
                case START_ARRAY ->
                        value.valueElementArrayValue = jsonParser.readValueAs(new TypeReference<List<ValueElement>>() {
                        });
                case START_OBJECT -> value.purpleValueValue = jsonParser.readValueAs(PurpleValue.class);
                default -> throw new IOException("Cannot deserialize PropertyValue");
            }
            return value;
        }
    }

    static class Serializer extends JsonSerializer<PropertyValue> {
        @Override
        public void serialize(PropertyValue obj, JsonGenerator jsonGenerator, SerializerProvider serializerProvider) throws IOException {
            if (obj.purpleValueValue != null) {
                jsonGenerator.writeObject(obj.purpleValueValue);
                return;
            }
            if (obj.integerValue != null) {
                jsonGenerator.writeObject(obj.integerValue);
                return;
            }
            if (obj.boolValue != null) {
                jsonGenerator.writeObject(obj.boolValue);
                return;
            }
            if (obj.valueElementArrayValue != null) {
                jsonGenerator.writeObject(obj.valueElementArrayValue);
                return;
            }
            if (obj.doubleValue != null) {
                jsonGenerator.writeObject(obj.doubleValue);
                return;
            }
            if (obj.stringValue != null) {
                jsonGenerator.writeObject(obj.stringValue);
                return;
            }
            throw new IOException("PropertyValue must not be null");
        }
    }
}