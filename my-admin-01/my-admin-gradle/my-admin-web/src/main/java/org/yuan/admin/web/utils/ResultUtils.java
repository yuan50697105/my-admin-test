package org.yuan.admin.web.utils;

import org.springframework.validation.BindingResult;
import org.yuan.admin.web.entity.Result;

import java.util.Collections;
import java.util.Map;
import java.util.Optional;

/**
 * @program: my-admin-gradle
 * @description:
 * @author: yuane
 * @create: 2020-04-19 19:27
 */
public class ResultUtils {
    public static final int METHOD_ARGUMENT_NOT_VALID_EXCEPTION_ERROR = 3;
    public static final String METHOD_ARGUMENT_NOT_VALID_EXCEPTION_ERROR_MESSAGE = "参数验证错误";
    private static final Integer OK = 0;
    private static final Integer EXCEPTION_ERROR = 1;

    public static Result<?> success(String message) {
        return new Result<>(OK, message);
    }

    public static <T> Result<T> success(String message, T data) {
        return new Result<>(OK, message, data);
    }

    public static Result<Map<String, Object>> success(String message, Map<String, Object> data) {
        return new Result<>(OK, message, data);
    }

    public static Result<Map<String, Object>> success(String message, String key, Object data) {
        return new Result<>(OK, message, Collections.singletonMap(key, Optional.ofNullable(data).orElse(new Object())));
    }

    public static Result<?> error(Integer code, String message) {
        return new Result<>(code, message);
    }

    public static <T> Result<T> error(Integer code, String message, T data) {
        return new Result<>(code, message, data);
    }


    public static Result<?> exceptionError(String message) {
        return new Result<>(EXCEPTION_ERROR, message);
    }

    public static Result<?> httpError(int value, String reasonPhrase) {
        return new Result<>(value, reasonPhrase);
    }

    public static Result<?> methodArgumentNotValidExceptionError(BindingResult bindingResult) {
        return new Result<>(METHOD_ARGUMENT_NOT_VALID_EXCEPTION_ERROR, METHOD_ARGUMENT_NOT_VALID_EXCEPTION_ERROR_MESSAGE, bindingResult);
    }
}