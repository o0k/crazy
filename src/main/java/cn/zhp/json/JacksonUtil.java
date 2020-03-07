package cn.zhp.json;

import cn.zhp.json.deserializer.EnumCustomerSerialize;
import cn.zhp.json.deserializer.EnumDeserializationHandler;
import cn.zhp.json.exception.ZhpException;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.databind.module.SimpleModule;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.util.StringUtils;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * jackson 序列化反序列化工具方法, 不用于框架内部
 *
 * @author zhp
 */
public class JacksonUtil {
    private static Logger logger = LoggerFactory.getLogger(JacksonUtil.class);
    private static ObjectMapper objectMapper = new ObjectMapper();

    static {
        SimpleModule module = new SimpleModule();
        module.addSerializer(Enum.class, new EnumCustomerSerialize());
        objectMapper.registerModule(module);
        objectMapper.addHandler(new EnumDeserializationHandler());
        objectMapper.configure(DeserializationFeature.FAIL_ON_IGNORED_PROPERTIES, false);
        objectMapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        objectMapper.configure(DeserializationFeature.ACCEPT_SINGLE_VALUE_AS_ARRAY, true);
        objectMapper.configure(DeserializationFeature.ACCEPT_EMPTY_ARRAY_AS_NULL_OBJECT, true);
        objectMapper.configure(MapperFeature.ACCEPT_CASE_INSENSITIVE_PROPERTIES, true);
        // 允许用单引号代替双引号
        objectMapper.configure(JsonParser.Feature.ALLOW_SINGLE_QUOTES, true);
        // 转json,null字段不包含
        objectMapper.setSerializationInclusion(JsonInclude.Include.NON_NULL);
    }

    /**
     * 把对象转成json字符串
     */
    public static String obj2json(Object obj) {
        if (obj == null) {
            return null;
        }
        try {
            String json = objectMapper.writeValueAsString(obj);
            return json;
        } catch (JsonProcessingException e) {
            logger.info("obj2json fail, obj={}", obj, e);
        }
        return null;
    }

    /**
     * 把一个类对象通过Jackson转成clsName类型的对象, 最常用是把map转成对象
     */
    public static Object obj2Object(Object obj, String clsName) {
        String json = obj2json(obj);
        // todo
        return json2Object(json, clsName);
    }

    /**
     * 把一个类通过jackson转成cls类型的对象, 最常用是把map转成对象
     */
    public static <T> T obj2Object(Object obj, Class<T> cls) {
        String json = obj2json(obj);
        return json2Object(json, cls);
    }

    /**
     * 把json字符串转换成clsName指定的对象
     */
    public static Object json2Object(String json, String clsName) {
        if (!StringUtils.hasText(clsName)) {
            return null;
        }
        Class<?> cls = null;
        try {
            cls = Class.forName(clsName);
        } catch (ClassNotFoundException e) {
            logger.info("obj2json fail, clsName={}", clsName, e);
        }
        return json2Object(json, cls);
    }

    /**
     * 把json字符串转成cls指定的对象
     */
    public static <T> T json2Object(String json, Class<T> cls) {
        if (!StringUtils.hasText(json)) {
            return null;
        }
        if (cls == null) {
            return null;
        }
        Object req;
        try {
            req = objectMapper.readValue(json, cls);
            return (T) req;
        } catch (IOException e) {
            e.printStackTrace();
            logger.info("json2Object fail, cls={}, json={}", cls, json, e);
            System.out.println("OcpException");
            //            throw new OcpException()
            throw new ZhpException();
        }
    }

    /**
     * 转换json为类型cls的数组
     */
    public static <T> List<T> json2List(String json, Class<T> cls) {
        JavaType type = objectMapper.getTypeFactory().constructParametricType(List.class, cls);
        try {
            return objectMapper.readValue(json, type);
        } catch (JsonParseException e) {
            logger.info("json2List fail, cls={}, json={}", cls, json, e);
        } catch (JsonMappingException e) {
            logger.info("json2List fail, cls={}, json={}", cls, json, e);
        } catch (IOException e) {
            logger.info("json2List fail, cls={}, json={}", cls, json, e);
        }
        return new ArrayList<T>();
    }

    /**
     * 把json转换成map, 主键类型是String
     */
    public static <T> Map<String, T> json2Map(String json, Class<T> valueClass) {
        JavaType type = objectMapper.getTypeFactory().constructParametricType(Map.class, String.class, valueClass);
        try {
            return objectMapper.readValue(json, type);
        } catch (JsonParseException e) {
            logger.info("json2Map fail, valueClass={}, json={}", valueClass, json, e);
        } catch (JsonMappingException e) {
            logger.info("json2Map fail, valueClass={}, json={}", valueClass, json, e);
        } catch (IOException e) {
            logger.info("json2Map fail, valueClass={}, json={}", valueClass, json, e);
        }
        return new HashMap<>();
    }

    /**
     * 把json转换成map, 主键类型是keyClass, 值类型valueClass
     */
    public static <T> Map<Object, T> json2Map(String json, Class<?> keyClass, Class<T> valueClass) {
        JavaType type = objectMapper.getTypeFactory().constructParametricType(Map.class, keyClass, valueClass);
        try {
            return objectMapper.readValue(json, type);
        } catch (JsonParseException e) {
            logger.info("json2Map fail, keyClass={}, valueClass={}, json={}", keyClass, valueClass, json, e);
        } catch (JsonMappingException e) {
            logger.info("json2Map fail, keyClass={}, valueClass={}, json={}", keyClass, valueClass, json, e);
        } catch (IOException e) {
            logger.info("json2Map fail, keyClass={}, valueClass={}, json={}", keyClass, valueClass, json, e);
        }
        return new HashMap<>();
    }
}
