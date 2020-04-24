package org.yuan.adminbase.commons.utils;

import org.yuan.adminbase.commons.entity.ResponseResult;

import java.util.Collections;
import java.util.Map;

/**
 * @program: admin-base
 * @description: 控制器与服务层相应结果工具类
 * @author: yuane
 * @create: 2020-04-24 21:57
 */
public class ResponseResultUtils {

    private static final int OK_CODE = 0;
    private static final Integer ERROR_CODE = 1;


    public static <T> ResponseResult<T> result(Integer code, String message, T data) {
        return new ResponseResult<>(code, message, data);
    }

    public static <T> ResponseResult<T> ok(String message) {
        return new ResponseResult<>(OK_CODE, message);
    }

    public static <T> ResponseResult<T> ok(String message, T data) {
        return new ResponseResult<>(OK_CODE, message, data);
    }

    public static ResponseResult<Map<String, Object>> ok(String message, Map<String, Object> map) {
        return new ResponseResult<>(OK_CODE, message, map);
    }

    public static ResponseResult<Map<String, Object>> ok(String message, String key, Object data) {
        return new ResponseResult<>(OK_CODE, message, Collections.singletonMap(key, data));
    }

    public static <T> ResponseResult<T> error(String message) {
        return new ResponseResult<>(ERROR_CODE, message);
    }

    public static <T> ResponseResult<T> error(String message, T data) {
        return new ResponseResult<>(ERROR_CODE, message, data);
    }

    public static ResponseResult<Map<String, Object>> error(String message, Map<String, Object> map) {
        return new ResponseResult<>(ERROR_CODE, message, map);
    }

    public static ResponseResult<Map<String, Object>> error(String message, String key, Object data) {
        return new ResponseResult<>(ERROR_CODE, message, Collections.singletonMap(key, data));
    }

}