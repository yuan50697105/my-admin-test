package org.example.test.test01;

import java.lang.reflect.Field;
import java.util.StringJoiner;

public class Client {
    public static void main(String[] args) {
        String constants = getConstants(Constants.class);
        String regex = "^" + constants.replace(",", "|") + "$";
        String a = "enabled";
        System.out.println("a.matches(regex) = " + a.matches(regex));
    }

    public static String getConstants(Class<?> type) {
        StringJoiner joiner = new StringJoiner(",");
        Field[] fields = type.getFields();
        for (Field field : fields) {
            try {
                joiner.add(field.get(null).toString());
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            }
        }
        return joiner.toString();
    }

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

    public static class Constants {
        public static final String ENABLED = "enabled";
        public static final String DISABLED = "disabled";
    }

}
