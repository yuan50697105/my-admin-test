package com.example.modules.webmvc.exception.handler;

import com.example.modules.webmvc.pojo.ResponseResult;
import com.example.modules.webmvc.utils.ResponseResultUtils;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

/**
 * @program: admin-demo-spring-boot-maven
 * @description:
 * @author: yuane
 * @create: 2020-04-19 13:56
 */
@RestControllerAdvice
@ControllerAdvice
public class GlobalExceptionHandler {
    @ExceptionHandler(Exception.class)
    public ResponseResult<?> handler(Exception e) {
        e.printStackTrace();
        return ResponseResultUtils.error(e.getMessage());
    }

}