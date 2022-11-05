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

@JsonDeserialize(using = UnitUnion.Deserializer.class)
@JsonSerialize(using = UnitUnion.Serializer.class)
public class UnitUnion {
    public TypeClass typeClassValue;
    public UnitUnit enumValue;

    static class Deserializer extends JsonDeserializer<UnitUnion> {
        @Override
        public UnitUnion deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
            UnitUnion value = new UnitUnion();
            switch (jsonParser.currentToken()) {
                case VALUE_NULL:
                    break;
                case VALUE_STRING:
                    String string = jsonParser.readValueAs(String.class);
                    try {
                        value.enumValue = UnitUnit.forValue(string);
                    } catch (Exception ex) {
                        // Ignored
                    }
                    break;
                case START_OBJECT:
                    value.typeClassValue = jsonParser.readValueAs(TypeClass.class);
                    break;
                default:
                    throw new IOException("Cannot deserialize UnitUnion");
            }
            return value;
        }
    }

    static class Serializer extends JsonSerializer<UnitUnion> {
        @Override
        public void serialize(UnitUnion obj, JsonGenerator jsonGenerator, SerializerProvider serializerProvider) throws IOException {
            if (obj.typeClassValue != null) {
                jsonGenerator.writeObject(obj.typeClassValue);
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
