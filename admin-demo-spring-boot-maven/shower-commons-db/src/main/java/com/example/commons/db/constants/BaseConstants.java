package com.example.commons.db.constants;

import com.example.commons.utils.DictUtils;

import java.util.Map;

/**
 * @program: admin-demo-gradle
 * @description:
 * @author: yuane
 * @create: 2020-04-09 20:00
 */
public class BaseConstants {
    public Map<String, Map<String, String>> dict() {
        try {
            return DictUtils.getDict(this.getClass());
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
        return null;
    }
}