package com.example.commons.db.utils;

/**
 * @program: admin-demo-gradle
 * @description:
 * @author: yuane
 * @create: 2020-04-06 13:22
 */
public class DbUtils {
    public static String likeContains(String value) {
        return "%" + value + "%";
    }
}