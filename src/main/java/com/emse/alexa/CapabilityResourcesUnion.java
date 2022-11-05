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

@JsonDeserialize(using = CapabilityResourcesUnion.Deserializer.class)
@JsonSerialize(using = CapabilityResourcesUnion.Serializer.class)
public class CapabilityResourcesUnion {
    public CapabilityResourcesClass capabilityResourcesClassValue;
    public Double doubleValue;
    public Long integerValue;
    public Boolean boolValue;
    public List<Object> anythingArrayValue;
    public String stringValue;

    static class Deserializer extends JsonDeserializer<CapabilityResourcesUnion> {
        @Override
        public CapabilityResourcesUnion deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
            CapabilityResourcesUnion value = new CapabilityResourcesUnion();
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
                    value.capabilityResourcesClassValue = jsonParser.readValueAs(CapabilityResourcesClass.class);
                    break;
                default:
                    throw new IOException("Cannot deserialize CapabilityResourcesUnion");
            }
            return value;
        }
    }

    static class Serializer extends JsonSerializer<CapabilityResourcesUnion> {
        @Override
        public void serialize(CapabilityResourcesUnion obj, JsonGenerator jsonGenerator, SerializerProvider serializerProvider) throws IOException {
            if (obj.capabilityResourcesClassValue != null) {
                jsonGenerator.writeObject(obj.capabilityResourcesClassValue);
                return;
            }
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
            if (obj.anythingArrayValue != null) {
                jsonGenerator.writeObject(obj.anythingArrayValue);
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
