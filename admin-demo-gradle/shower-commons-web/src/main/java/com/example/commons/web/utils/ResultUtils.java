package com.example.commons.web.utils;

import com.example.commons.db.pojo.IPageResult;
import com.example.commons.web.pojo.Result;

import java.util.Collections;
import java.util.Map;

/**
 * @program: admin-demo
 * @description:
 * @author: yuane
 * @create: 2020-03-26 23:16
 */
public class ResultUtils {
    public static final int NOT_FOUND_ERROR_CODE = 201;
    public static final String NOT_FOUN_ERROR_MESSAGE = "用户不存在";
    private static final Integer OK_CODE = 0;
    private static final String OK_MESSAGE = "成功";
    private static final Integer EXCEPTION_ERROR_CODE = 101;
    private static final Integer VALIDATE_ERROR_CODE = 102;

    public static Result result(Integer code, String message) {
        return new Result(code, message);
    }

    public static Result result(Integer code, String message, Object data) {
        return new Result(code, message, data);
    }

    public static Result ok() {
        return result(OK_CODE, OK_MESSAGE);
    }

    public static Result ok(String message) {
        return result(OK_CODE, message);
    }

    public static <T> Result data(T data) {
        return result(OK_CODE, OK_MESSAGE, data);
    }

    public static <K, V, T extends Map<T, K>> Result data(T map) {
        return result(OK_CODE, OK_MESSAGE, map);
    }

    public static <K, V> Result data(K key, V value) {
        return data(Collections.singletonMap(key, value));
    }

    public static <E, T extends IPageResult<E>> Result data(T data) {
        return result(OK_CODE, OK_MESSAGE, data);
    }

    public static Result exceptionError(String message) {
        return result(EXCEPTION_ERROR_CODE, message);
    }

    public static Result validateError(String message) {
        return result(VALIDATE_ERROR_CODE, message);
    }

    public static Result userNotFoundError() {
        return result(NOT_FOUND_ERROR_CODE, NOT_FOUN_ERROR_MESSAGE);
    }
}