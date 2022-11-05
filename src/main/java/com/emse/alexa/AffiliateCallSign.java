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

@JsonDeserialize(using = AffiliateCallSign.Deserializer.class)
@JsonSerialize(using = AffiliateCallSign.Serializer.class)
public class AffiliateCallSign {
    public String stringValue;
    public TypeClass typeClassValue;

    static class Deserializer extends JsonDeserializer<AffiliateCallSign> {
        @Override
        public AffiliateCallSign deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
            AffiliateCallSign value = new AffiliateCallSign();
            switch (jsonParser.currentToken()) {
                case VALUE_NULL:
                    break;
                case VALUE_STRING:
                    value.stringValue = jsonParser.readValueAs(String.class);
                    break;
                case START_OBJECT:
                    value.typeClassValue = jsonParser.readValueAs(TypeClass.class);
                    break;
                default: throw new IOException("Cannot deserialize AffiliateCallSign");
            }
            return value;
        }
    }

    static class Serializer extends JsonSerializer<AffiliateCallSign> {
        @Override
        public void serialize(AffiliateCallSign obj, JsonGenerator jsonGenerator, SerializerProvider serializerProvider) throws IOException {
            if (obj.stringValue != null) {
                jsonGenerator.writeObject(obj.stringValue);
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