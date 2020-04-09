package com.example.commons.db.utils;

import cn.hutool.core.util.StrUtil;
import com.example.commons.db.utils.annotation.ConstantsName;

import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Map;

public class DictUtils {
    public static Map<String, String> getDictKeyValue(Class<?> type) throws IllegalAccessException {
        Field[] fields = type.getFields();
        HashMap<String, String> map = new HashMap<>(fields.length);
        for (Field field : fields) {
            String key = field.getName();
            String value = field.get(null).toString();
            ConstantsName constantsName = field.getAnnotation(ConstantsName.class);
            if (constantsName != null) {
                key = constantsName.name();
            }
            map.put(key, value);
        }
        return map;
    }

    public static String getDictCode(Class<?> type) {
        return StrUtil.toUnderlineCase(type.getSimpleName());
    }
}
