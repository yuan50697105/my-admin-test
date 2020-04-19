package com.example.modules.webmvc.exception;

import com.example.modules.webmvc.pojo.ResponseResult;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * @program: admin-demo-spring-boot-maven
 * @description:
 * @author: yuane
 * @create: 2020-04-19 13:51
 */
@EqualsAndHashCode(callSuper = true)
@Data
public class ResponseResultRuntimeException extends RuntimeException {
    private ResponseResult<?> result;

    public ResponseResultRuntimeException(ResponseResult<?> result) {
        this.result = result;
    }

    public ResponseResultRuntimeException(ResponseResultException exception) {
        this(exception.getResult());
    }

    public static ResponseResultRuntimeException exception(ResponseResult<?> result) {
        return new ResponseResultRuntimeException(result);
    }

    public static ResponseResultRuntimeException exception(ResponseResultException e) {
        return new ResponseResultRuntimeException(e);
    }
    
}