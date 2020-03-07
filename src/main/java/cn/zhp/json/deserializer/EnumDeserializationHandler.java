package cn.zhp.json.deserializer;

import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.deser.DeserializationProblemHandler;

import java.io.IOException;

public class EnumDeserializationHandler extends DeserializationProblemHandler {
    public Object handleWeirdStringValue(DeserializationContext ctxt,Class<?> targetType,String valueToConvert,String failureMsg) throws IOException {
        Object[] objs = ((Class<?>) targetType).getEnumConstants();
        if (objs == null) {
            return null;
        }
        for (Object obj : objs) {
            if (obj == null) {
                continue;
            }
            if (obj.toString().equals(valueToConvert)) {
                return obj;
            }
        }
        return null;
    }
}