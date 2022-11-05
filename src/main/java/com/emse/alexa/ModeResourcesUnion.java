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

@JsonDeserialize(using = ModeResourcesUnion.Deserializer.class)
@JsonSerialize(using = ModeResourcesUnion.Serializer.class)
public class ModeResourcesUnion {
    public Double doubleValue;
    public Long integerValue;
    public Boolean boolValue;
    public String stringValue;
    public List<Object> anythingArrayValue;
    public ModeResourcesClass modeResourcesClassValue;

    static class Deserializer extends JsonDeserializer<ModeResourcesUnion> {
        @Override
        public ModeResourcesUnion deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
            ModeResourcesUnion value = new ModeResourcesUnion();
            switch (jsonParser.currentToken()) {
                case VALUE_NULL:
                    break;
                case VALUE_NUMBER_INT:
                    value.integerValue = jsonParser.readValueAs(Long.class);
                    break;
                case VALUE_NUMBER_FLOAT:
                    value.doubleValue = jsonParser.readValueAs(Double.class);
                    break;
                case VALUE_TRUE:
                case VALUE_FALSE:
                    value.boolValue = jsonParser.readValueAs(Boolean.class);
                    break;
                case VALUE_STRING:
                    value.stringValue = jsonParser.readValueAs(String.class);
                    break;
                case START_ARRAY:
                    value.anythingArrayValue = jsonParser.readValueAs(new TypeReference<List<Object>>() {
                    });
                    break;
                case START_OBJECT:
                    value.modeResourcesClassValue = jsonParser.readValueAs(ModeResourcesClass.class);
                    break;
                default:
                    throw new IOException("Cannot deserialize ModeResourcesUnion");
            }
            return value;
        }
    }

    static class Serializer extends JsonSerializer<ModeResourcesUnion> {
        @Override
        public void serialize(ModeResourcesUnion obj, JsonGenerator jsonGenerator, SerializerProvider serializerProvider) throws IOException {
            if (obj.doubleValue != null) {
                jsonGenerator.writeObject(obj.doubleValue);
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
            if (obj.stringValue != null) {
                jsonGenerator.writeObject(obj.stringValue);
                return;
            }
            if (obj.anythingArrayValue != null) {
                jsonGenerator.writeObject(obj.anythingArrayValue);
                return;
            }
            if (obj.modeResourcesClassValue != null) {
                jsonGenerator.writeObject(obj.modeResourcesClassValue);
                return;
            }
            jsonGenerator.writeNull();
        }
    }
}
