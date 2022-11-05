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

@JsonDeserialize(using = MaximumValueUnion.Deserializer.class)
@JsonSerialize(using = MaximumValueUnion.Serializer.class)
public class MaximumValueUnion {
    public Double doubleValue;
    public MaximumValueClass maximumValueClassValue;

    static class Deserializer extends JsonDeserializer<MaximumValueUnion> {
        @Override
        public MaximumValueUnion deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
            MaximumValueUnion value = new MaximumValueUnion();
            switch (jsonParser.currentToken()) {
                case VALUE_NULL:
                    break;
                case VALUE_NUMBER_INT:
                case VALUE_NUMBER_FLOAT:
                    value.doubleValue = jsonParser.readValueAs(Double.class);
                    break;
                case START_OBJECT:
                    value.maximumValueClassValue = jsonParser.readValueAs(MaximumValueClass.class);
                    break;
                default:
                    throw new IOException("Cannot deserialize MaximumValueUnion");
            }
            return value;
        }
    }

    static class Serializer extends JsonSerializer<MaximumValueUnion> {
        @Override
        public void serialize(MaximumValueUnion obj, JsonGenerator jsonGenerator, SerializerProvider serializerProvider) throws IOException {
            if (obj.doubleValue != null) {
                jsonGenerator.writeObject(obj.doubleValue);
                return;
            }
            if (obj.maximumValueClassValue != null) {
                jsonGenerator.writeObject(obj.maximumValueClassValue);
                return;
            }
            jsonGenerator.writeNull();
        }
    }
}
