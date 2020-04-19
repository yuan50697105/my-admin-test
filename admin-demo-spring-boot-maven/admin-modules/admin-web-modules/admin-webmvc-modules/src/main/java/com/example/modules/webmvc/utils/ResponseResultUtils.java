package com.example.modules.webmvc.utils;

import com.example.modules.webmvc.pojo.ResponseResult;

/**
 * @program: admin-demo-spring-boot-maven
 * @description:
 * @author: yuane
 * @create: 2020-04-19 13:53
 */
public class ResponseResultUtils {
    private static final Integer SUCCESS = 0;
    private static final Integer ERROR = 1;

    public static ResponseResult<?> success(String message) {
        return new ResponseResult<>(SUCCESS, message);
    }

    public static <T> ResponseResult<T> success(String message, T data) {
        return new ResponseResult<>(SUCCESS, message, data);
    }


    public static ResponseResult<?> error(String message) {
        return new ResponseResult<>(ERROR, message);
    }

    public static <T> ResponseResult<T> error(String message, T data) {
        return new ResponseResult<>(ERROR, message, data);
    }
}