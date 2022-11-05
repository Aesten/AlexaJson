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

@JsonDeserialize(using = FoodCategoryUnion.Deserializer.class)
@JsonSerialize(using = FoodCategoryUnion.Serializer.class)
public class FoodCategoryUnion {
    public TypeClass typeClassValue;
    public FoodCategoryEnum enumValue;

    static class Deserializer extends JsonDeserializer<FoodCategoryUnion> {
        @Override
        public FoodCategoryUnion deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
            FoodCategoryUnion value = new FoodCategoryUnion();
            switch (jsonParser.currentToken()) {
                case VALUE_NULL:
                    break;
                case VALUE_STRING:
                    String string = jsonParser.readValueAs(String.class);
                    try {
                        value.enumValue = FoodCategoryEnum.forValue(string);
                    } catch (Exception ex) {
                        // Ignored
                    }
                    break;
                case START_OBJECT:
                    value.typeClassValue = jsonParser.readValueAs(TypeClass.class);
                    break;
                default:
                    throw new IOException("Cannot deserialize FoodCategoryUnion");
            }
            return value;
        }
    }

    static class Serializer extends JsonSerializer<FoodCategoryUnion> {
        @Override
        public void serialize(FoodCategoryUnion obj, JsonGenerator jsonGenerator, SerializerProvider serializerProvider) throws IOException {
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
