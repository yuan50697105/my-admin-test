package com.example.commons.utils;

import java.lang.reflect.Field;
import java.util.StringJoiner;

public class RegexUtils {
    public static String regex(Class<?> type) {
        StringJoiner joiner = new StringJoiner("|");
        Field[] fields = type.getFields();
        for (Field field : fields) {
            try {
                joiner.add(field.get(null).toString());
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            }
        }
        String string = joiner.toString();
        string = "^" + string + "&";
        return string;

    }
}
