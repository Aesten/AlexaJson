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
import java.util.Map;

@JsonDeserialize(using = SupportedUnion.Deserializer.class)
@JsonSerialize(using = SupportedUnion.Serializer.class)
public class SupportedUnion {
    public Map<String, Object> anythingMapValue;
    public List<SupportedSupported> supportedSupportedArrayValue;

    static class Deserializer extends JsonDeserializer<SupportedUnion> {
        @Override
        public SupportedUnion deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
            SupportedUnion value = new SupportedUnion();
            switch (jsonParser.currentToken()) {
                case VALUE_NULL:
                    break;
                case START_ARRAY:
                    value.supportedSupportedArrayValue = jsonParser.readValueAs(new TypeReference<List<SupportedSupported>>() {
                    });
                    break;
                case START_OBJECT:
                    value.anythingMapValue = jsonParser.readValueAs(Map.class);
                    break;
                default:
                    throw new IOException("Cannot deserialize SupportedUnion");
            }
            return value;
        }
    }

    static class Serializer extends JsonSerializer<SupportedUnion> {
        @Override
        public void serialize(SupportedUnion obj, JsonGenerator jsonGenerator, SerializerProvider serializerProvider) throws IOException {
            if (obj.anythingMapValue != null) {
                jsonGenerator.writeObject(obj.anythingMapValue);
                return;
            }
            if (obj.supportedSupportedArrayValue != null) {
                jsonGenerator.writeObject(obj.supportedSupportedArrayValue);
                return;
            }
            jsonGenerator.writeNull();
        }
    }
}
