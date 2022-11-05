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

@JsonDeserialize(using = CustomName.Deserializer.class)
@JsonSerialize(using = CustomName.Serializer.class)
public class CustomName {
    public TypeClass typeClassValue;
    public String stringValue;

    static class Deserializer extends JsonDeserializer<CustomName> {
        @Override
        public CustomName deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
            CustomName value = new CustomName();
            switch (jsonParser.currentToken()) {
                case VALUE_NULL:
                    break;
                case VALUE_STRING:
                    value.stringValue = jsonParser.readValueAs(String.class);
                    break;
                case START_OBJECT:
                    value.typeClassValue = jsonParser.readValueAs(TypeClass.class);
                    break;
                default: throw new IOException("Cannot deserialize CustomName");
            }
            return value;
        }
    }

    static class Serializer extends JsonSerializer<CustomName> {
        @Override
        public void serialize(CustomName obj, JsonGenerator jsonGenerator, SerializerProvider serializerProvider) throws IOException {
            if (obj.typeClassValue != null) {
                jsonGenerator.writeObject(obj.typeClassValue);
                return;
            }
            if (obj.stringValue != null) {
                jsonGenerator.writeObject(obj.stringValue);
                return;
            }
            jsonGenerator.writeNull();
        }
    }
}
