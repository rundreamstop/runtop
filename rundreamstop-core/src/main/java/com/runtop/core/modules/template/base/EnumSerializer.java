package com.runtop.core.modules.template.base;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;

import java.io.IOException;

/**
 * 追忆寻梦
 * rundreams.net
 *
 * @Author:zzh rundreams@yeah.net  @Time:2017/8/29
 */
@SuppressWarnings("rawtypes")
public class EnumSerializer extends JsonSerializer<BaseEnum> {

    @Override
    public void serialize(BaseEnum value, JsonGenerator jgen, SerializerProvider provider) throws IOException, JsonProcessingException {
        if (null != value) {
            jgen.writeStartObject();
            jgen.writeFieldName("value");
            jgen.writeObject(value.getValue());
            jgen.writeFieldName("displayName");
            jgen.writeString(value.getDisplayName());
            jgen.writeEndObject();
        } else {
            jgen.writeNull();
        }
    }

}
