package org.yuan.admin.web.exception.handler;

import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.client.HttpStatusCodeException;
import org.yuan.admin.web.entity.Result;
import org.yuan.admin.web.utils.ResultUtils;

/**
 * @program: my-admin-gradle
 * @description:
 * @author: yuane
 * @create: 2020-04-19 19:34
 */
@RestControllerAdvice
public class GlobelExceptionHandler {
    @ExceptionHandler(Exception.class)
    public Result<?> result(Exception e) {
        return ResultUtils.exceptionError(e.getMessage());
    }

    @ExceptionHandler(HttpStatusCodeException.class)
    public Result<?> result(HttpStatusCodeException e) {
        return ResultUtils.httpError(e.getStatusCode().value(), e.getStatusCode().getReasonPhrase());
    }

    @ExceptionHandler(MethodArgumentNotValidException.class)
    public Result<?> result(MethodArgumentNotValidException e) {
        return ResultUtils.methodArgumentNotValidExceptionError(e.getBindingResult());
    }
}