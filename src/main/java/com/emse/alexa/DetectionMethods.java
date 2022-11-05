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

@JsonDeserialize(using = DetectionMethods.Deserializer.class)
@JsonSerialize(using = DetectionMethods.Serializer.class)
public class DetectionMethods {
    public List<DetectionMethod> enumArrayValue;
    public TypeClass typeClassValue;

    static class Deserializer extends JsonDeserializer<DetectionMethods> {
        @Override
        public DetectionMethods deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
            DetectionMethods value = new DetectionMethods();
            switch (jsonParser.currentToken()) {
                case VALUE_NULL:
                    break;
                case START_ARRAY:
                    value.enumArrayValue = jsonParser.readValueAs(new TypeReference<List<DetectionMethod>>() {
                    });
                    break;
                case START_OBJECT:
                    value.typeClassValue = jsonParser.readValueAs(TypeClass.class);
                    break;
                default:
                    throw new IOException("Cannot deserialize DetectionMethods");
            }
            return value;
        }
    }

    static class Serializer extends JsonSerializer<DetectionMethods> {
        @Override
        public void serialize(DetectionMethods obj, JsonGenerator jsonGenerator, SerializerProvider serializerProvider) throws IOException {
            if (obj.enumArrayValue != null) {
                jsonGenerator.writeObject(obj.enumArrayValue);
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
