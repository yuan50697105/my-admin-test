package com.example.commons.utils;

import com.example.commons.utils.annotation.Constants;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DictUtils {

    public static Map<String, List<Map<String, String>>> getDictList(Class<?> type) {
        HashMap<String, List<Map<String, String>>> map = new HashMap<>();
        String dictGroup = getDictGroupName(type);
        List<Map<String, String>> dictListValue = getDictListValue(type);
        map.put(dictGroup, dictListValue);
        return map;
    }

    private static List<Map<String, String>> getDictListValue(Class<?> type) {
        ArrayList<Map<String, String>> maps = new ArrayList<>();
        for (Field field : type.getFields()) {
            HashMap<String, String> map = new HashMap<>();
            String key;
            String value;
            Constants annotation = type.getAnnotation(Constants.class);
            if (annotation != null) {
                key = annotation.name();
                value = annotation.value();
            } else {
                key = field.getName();
                try {
                    value = field.get(null).toString();
                } catch (IllegalAccessException e) {
                    e.printStackTrace();
                    value = "";
                }
            }
            map.put(key, value);
            maps.add(map);
        }
        return maps;
    }

    private static String getDictGroupName(Class<?> type) {
        return type.getSimpleName();
    }


}
