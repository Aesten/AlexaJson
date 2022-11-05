package com.emse.alexa;

import java.io.IOException;
import com.fasterxml.jackson.core.*;
import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.databind.annotation.*;

@JsonDeserialize(using = SupportsDeactivationUnion.Deserializer.class)
@JsonSerialize(using = SupportsDeactivationUnion.Serializer.class)
public class SupportsDeactivationUnion {
    public Boolean boolValue;
    public SupportsDeactivationEnum enumValue;

    static class Deserializer extends JsonDeserializer<SupportsDeactivationUnion> {
        @Override
        public SupportsDeactivationUnion deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
            SupportsDeactivationUnion value = new SupportsDeactivationUnion();
            switch (jsonParser.currentToken()) {
                case VALUE_NULL:
                    break;
                case VALUE_TRUE:
                case VALUE_FALSE:
                    value.boolValue = jsonParser.readValueAs(Boolean.class);
                    break;
                case VALUE_STRING:
                    String string = jsonParser.readValueAs(String.class);
                    try {
                        value.enumValue = SupportsDeactivationEnum.forValue(string);
                    } catch (Exception ex) {
                        // Ignored
                    }
                    break;
                default: throw new IOException("Cannot deserialize SupportsDeactivationUnion");
            }
            return value;
        }
    }

    static class Serializer extends JsonSerializer<SupportsDeactivationUnion> {
        @Override
        public void serialize(SupportsDeactivationUnion obj, JsonGenerator jsonGenerator, SerializerProvider serializerProvider) throws IOException {
            if (obj.boolValue != null) {
                jsonGenerator.writeObject(obj.boolValue);
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
