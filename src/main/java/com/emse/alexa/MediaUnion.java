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

@JsonDeserialize(using = MediaUnion.Deserializer.class)
@JsonSerialize(using = MediaUnion.Serializer.class)
public class MediaUnion {
    public List<MediaElement> mediaElementArrayValue;
    public PurpleMedia purpleMediaValue;

    static class Deserializer extends JsonDeserializer<MediaUnion> {
        @Override
        public MediaUnion deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
            MediaUnion value = new MediaUnion();
            switch (jsonParser.currentToken()) {
                case VALUE_NULL:
                    break;
                case START_ARRAY:
                    value.mediaElementArrayValue = jsonParser.readValueAs(new TypeReference<List<MediaElement>>() {
                    });
                    break;
                case START_OBJECT:
                    value.purpleMediaValue = jsonParser.readValueAs(PurpleMedia.class);
                    break;
                default:
                    throw new IOException("Cannot deserialize MediaUnion");
            }
            return value;
        }
    }

    static class Serializer extends JsonSerializer<MediaUnion> {
        @Override
        public void serialize(MediaUnion obj, JsonGenerator jsonGenerator, SerializerProvider serializerProvider) throws IOException {
            if (obj.mediaElementArrayValue != null) {
                jsonGenerator.writeObject(obj.mediaElementArrayValue);
                return;
            }
            if (obj.purpleMediaValue != null) {
                jsonGenerator.writeObject(obj.purpleMediaValue);
                return;
            }
            jsonGenerator.writeNull();
        }
    }
}
