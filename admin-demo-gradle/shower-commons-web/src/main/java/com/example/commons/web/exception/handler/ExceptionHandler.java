package com.example.commons.web.exception.handler;

import com.example.commons.web.exception.ResultExceptio;
import com.example.commons.web.exception.ResultRuntimeException;
import com.example.commons.web.pojo.Result;
import com.example.commons.web.utils.ResultUtils;
import org.springframework.web.bind.annotation.RestControllerAdvice;

/**
 * @program: admin-demo
 * @description:
 * @author: yuane
 * @create: 2020-03-26 23:23
 */
@RestControllerAdvice
public class ExceptionHandler {
    @org.springframework.web.bind.annotation.ExceptionHandler(Exception.class)
    public Result exception(Exception e) {
        return ResultUtils.exceptionError(e.getMessage());
    }

    @org.springframework.web.bind.annotation.ExceptionHandler(ResultExceptio.class)
    public Result result(ResultExceptio e) {
        return e.getResult();
    }

    @org.springframework.web.bind.annotation.ExceptionHandler(ResultRuntimeException.class)
    public Result result(ResultRuntimeException e) {
        return e.getResult();
    }


}