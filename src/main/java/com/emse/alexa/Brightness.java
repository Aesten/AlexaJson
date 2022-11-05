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

@JsonDeserialize(using = Brightness.Deserializer.class)
@JsonSerialize(using = Brightness.Serializer.class)
public class Brightness {
    public Double doubleValue;
    public TypeClass typeClassValue;

    static class Deserializer extends JsonDeserializer<Brightness> {
        @Override
        public Brightness deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
            Brightness value = new Brightness();
            switch (jsonParser.currentToken()) {
                case VALUE_NULL:
                    break;
                case VALUE_NUMBER_INT:
                case VALUE_NUMBER_FLOAT:
                    value.doubleValue = jsonParser.readValueAs(Double.class);
                    break;
                case START_OBJECT:
                    value.typeClassValue = jsonParser.readValueAs(TypeClass.class);
                    break;
                default: throw new IOException("Cannot deserialize Brightness");
            }
            return value;
        }
    }

    static class Serializer extends JsonSerializer<Brightness> {
        @Override
        public void serialize(Brightness obj, JsonGenerator jsonGenerator, SerializerProvider serializerProvider) throws IOException {
            if (obj.doubleValue != null) {
                jsonGenerator.writeObject(obj.doubleValue);
                return;
            }
            if (obj.typeClassValue != null) {
                jsonGenerator.writeObject(obj.typeClassValue);
                return;
            }
            jsonGenerator.writeNull();
        }
    }
}