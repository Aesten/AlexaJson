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

@JsonDeserialize(using = FoodStateUnion.Deserializer.class)
@JsonSerialize(using = FoodStateUnion.Serializer.class)
public class FoodStateUnion {
    public TypeClass typeClassValue;
    public FoodStateEnum enumValue;

    static class Deserializer extends JsonDeserializer<FoodStateUnion> {
        @Override
        public FoodStateUnion deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
            FoodStateUnion value = new FoodStateUnion();
            switch (jsonParser.currentToken()) {
                case VALUE_NULL:
                    break;
                case VALUE_STRING:
                    String string = jsonParser.readValueAs(String.class);
                    try {
                        value.enumValue = FoodStateEnum.forValue(string);
                    } catch (Exception ex) {
                        // Ignored
                    }
                    break;
                case START_OBJECT:
                    value.typeClassValue = jsonParser.readValueAs(TypeClass.class);
                    break;
                default:
                    throw new IOException("Cannot deserialize FoodStateUnion");
            }
            return value;
        }
    }

    static class Serializer extends JsonSerializer<FoodStateUnion> {
        @Override
        public void serialize(FoodStateUnion obj, JsonGenerator jsonGenerator, SerializerProvider serializerProvider) throws IOException {
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
