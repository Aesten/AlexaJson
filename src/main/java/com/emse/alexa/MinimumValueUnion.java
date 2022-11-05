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

@JsonDeserialize(using = MinimumValueUnion.Deserializer.class)
@JsonSerialize(using = MinimumValueUnion.Serializer.class)
public class MinimumValueUnion {
    public Double doubleValue;
    public MinimumValueClass minimumValueClassValue;

    static class Deserializer extends JsonDeserializer<MinimumValueUnion> {
        @Override
        public MinimumValueUnion deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
            MinimumValueUnion value = new MinimumValueUnion();
            switch (jsonParser.currentToken()) {
                case VALUE_NULL:
                    break;
                case VALUE_NUMBER_INT:
                case VALUE_NUMBER_FLOAT:
                    value.doubleValue = jsonParser.readValueAs(Double.class);
                    break;
                case START_OBJECT:
                    value.minimumValueClassValue = jsonParser.readValueAs(MinimumValueClass.class);
                    break;
                default:
                    throw new IOException("Cannot deserialize MinimumValueUnion");
            }
            return value;
        }
    }

    static class Serializer extends JsonSerializer<MinimumValueUnion> {
        @Override
        public void serialize(MinimumValueUnion obj, JsonGenerator jsonGenerator, SerializerProvider serializerProvider) throws IOException {
            if (obj.doubleValue != null) {
                jsonGenerator.writeObject(obj.doubleValue);
                return;
            }
            if (obj.minimumValueClassValue != null) {
                jsonGenerator.writeObject(obj.minimumValueClassValue);
                return;
            }
            jsonGenerator.writeNull();
        }
    }
}
