package com.example.commons.utils;

import cn.hutool.core.util.StrUtil;
import com.example.commons.utils.annotation.Constants;

import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Map;

public class DictUtils {
    public static Map<String, Map<String, String>> getDict(Class<?> type) throws IllegalAccessException {
        HashMap<String, Map<String, String>> map = new HashMap<>();
        map.put(getDictCode(type), getDictKeyValue(type));
        return map;
    }

    public static Map<String, String> getDictKeyValue(Class<?> type) throws IllegalAccessException {
        Field[] fields = type.getFields();
        HashMap<String, String> map = new HashMap<>(fields.length);
        for (Field field : fields) {
            field.setAccessible(true);
            String key;
            String value;
            Constants constants = field.getAnnotation(Constants.class);
            if (constants != null) {
                key = constants.name();
                value = constants.value();
            } else {
                key = field.getName();
                value = field.get(null).toString();
            }
            map.put(key, value);
        }
        return map;
    }

    public static String getDictCode(Class<?> type) {
        return StrUtil.toUnderlineCase(type.getSimpleName());
    }
}
