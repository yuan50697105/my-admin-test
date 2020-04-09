package com.example.commons.web.utils;

import com.example.commons.web.pojo.Result;

/**
 * @program: admin-demo
 * @description:
 * @author: yuane
 * @create: 2020-03-26 23:16
 */
public class ResultUtils {
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

    public static Result data(Object data) {
        return result(OK_CODE, OK_MESSAGE, data);
    }

    public static Result exceptionError(String message) {
        return result(EXCEPTION_ERROR_CODE, message);
    }

    public static Result validateError(String message) {
        return result(VALIDATE_ERROR_CODE, message);
    }
}