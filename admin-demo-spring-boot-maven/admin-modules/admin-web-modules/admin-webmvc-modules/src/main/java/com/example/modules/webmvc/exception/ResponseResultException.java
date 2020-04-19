package com.example.modules.webmvc.exception;

import com.example.modules.webmvc.pojo.ResponseResult;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * @program: admin-demo-spring-boot-maven
 * @description:
 * @author: yuane
 * @create: 2020-04-19 13:49
 */
@EqualsAndHashCode(callSuper = true)
@Data
public class ResponseResultException extends Exception {
    private ResponseResult<?> result;

    public ResponseResultException(ResponseResult<?> result) {
        this.result = result;
    }

    public static ResponseResultException exception(ResponseResult<?> result) {
        return new ResponseResultException(result);
    }
}