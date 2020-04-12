package com.example.commons.web.base.utils;

import com.example.commons.web.base.pojo.Result;
import com.example.db.pojo.IPageResult;

import java.util.Collections;
import java.util.Map;

/**
 * @program: admin-demo
 * @description:
 * @author: yuane
 * @create: 2020-03-26 23:16
 */
public class ResultUtils {
    public static final int USER_NOT_FOUND_ERROR_CODE = 201;
    public static final String USER_NOT_FOUND_ERROR_MESSAGE = "用户不存在";
    public static final String SAVE_OK_MESSAGE = "保存成功";
    public static final String UPDATE_OK_MESSAGE = "修改成功";
    public static final String DELETE_OK_MESSAGE = "删除成功";
    private static final Integer OK_CODE = 0;
    private static final String OK_MESSAGE = "成功";

    private static final Integer EXCEPTION_ERROR_CODE = 101;
    private static final Integer VALIDATE_ERROR_CODE = 102;
    private static final Integer INFO_NOT_EXIST_CODE = 103;
    private static final String INFO_EXIST_MESSAGE = "信息不存在";
    /*
     * 额外内容
     * */
    private static final Integer USER_EXIST_ERROR_CODE = 202;
    private static final String USER_EXIST_ERROR_MESSAGE = "用户已存在";

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

    public static Result saveOk() {
        return result(OK_CODE, SAVE_OK_MESSAGE);
    }

    public static Result updateOk() {
        return result(OK_CODE, UPDATE_OK_MESSAGE);
    }

    public static Result deleteOk() {
        return result(OK_CODE, DELETE_OK_MESSAGE);
    }

    public static <T> Result data(T data) {
        return result(OK_CODE, OK_MESSAGE, data);
    }

    public static <K, V, T extends Map<K, V>> Result data(T map) {
        return result(OK_CODE, OK_MESSAGE, map);
    }

    public static <K, V> Result data(K key, V value) {
        return data(Collections.singletonMap(key, value));
    }

    public static <E, T extends Iterable<E>> Result data(T iterable) {
        return data("list", iterable);
    }

    public static <E, T extends IPageResult<E>> Result data(T data) {
        return result(OK_CODE, OK_MESSAGE, data);
    }

    public static Result exceptionError(String message) {
        return result(EXCEPTION_ERROR_CODE, message);
    }

    /*
     * 额外内容
     * */
    public static Result validateError(String message) {
        return result(VALIDATE_ERROR_CODE, message);
    }

    public static Result userNotFoundError() {
        return result(USER_NOT_FOUND_ERROR_CODE, USER_NOT_FOUND_ERROR_MESSAGE);
    }

    public static Result userExistError() {
        return result(USER_EXIST_ERROR_CODE, USER_EXIST_ERROR_MESSAGE);
    }

    public static Result infoNotExistError() {
        return result(INFO_NOT_EXIST_CODE, INFO_EXIST_MESSAGE);
    }
}