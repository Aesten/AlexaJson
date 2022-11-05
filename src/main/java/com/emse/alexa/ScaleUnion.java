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

@JsonDeserialize(using = ScaleUnion.Deserializer.class)
@JsonSerialize(using = ScaleUnion.Serializer.class)
public class ScaleUnion {
    public TypeClass typeClassValue;
    public ScaleEnum enumValue;

    static class Deserializer extends JsonDeserializer<ScaleUnion> {
        @Override
        public ScaleUnion deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
            ScaleUnion value = new ScaleUnion();
            switch (jsonParser.currentToken()) {
                case VALUE_NULL:
                    break;
                case VALUE_STRING:
                    String string = jsonParser.readValueAs(String.class);
                    try {
                        value.enumValue = ScaleEnum.forValue(string);
                    } catch (Exception ex) {
                        // Ignored
                    }
                    break;
                case START_OBJECT:
                    value.typeClassValue = jsonParser.readValueAs(TypeClass.class);
                    break;
                default:
                    throw new IOException("Cannot deserialize ScaleUnion");
            }
            return value;
        }
    }

    static class Serializer extends JsonSerializer<ScaleUnion> {
        @Override
        public void serialize(ScaleUnion obj, JsonGenerator jsonGenerator, SerializerProvider serializerProvider) throws IOException {
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
