package com.example.commons.web.base.exception.handler;

import com.example.commons.web.base.exception.ResultException;
import com.example.commons.web.base.exception.ResultRuntimeException;
import com.example.commons.web.base.pojo.Result;
import com.example.commons.web.base.utils.ResultUtils;
import com.example.commons.web.base.utils.ValidatorUtils;
import org.springframework.web.bind.MethodArgumentNotValidException;
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
    public Result result(Exception e) {
        return ResultUtils.exceptionError(e.getMessage());
    }

    @org.springframework.web.bind.annotation.ExceptionHandler(ResultException.class)
    public Result result(ResultException e) {
        return e.getResult();
    }

    @org.springframework.web.bind.annotation.ExceptionHandler(ResultRuntimeException.class)
    public Result result(ResultRuntimeException e) {
        return e.getResult();
    }

    @org.springframework.web.bind.annotation.ExceptionHandler(MethodArgumentNotValidException.class)
    public void result(MethodArgumentNotValidException e) {
        ValidatorUtils.validate(e.getBindingResult());
    }


}