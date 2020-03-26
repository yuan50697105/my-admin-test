package com.example.commons.web.controller;

import com.example.commons.web.exception.ResultRuntimeException;
import com.example.commons.web.pojo.Result;
import com.example.commons.web.utils.ResultUtils;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;

import java.util.List;
import java.util.StringJoiner;

/**
 * @program: admin-demo
 * @description:
 * @author: yuane
 * @create: 2020-03-26 23:26
 */
public class BaseController {
    public void validate(BindingResult result) throws ResultRuntimeException {
        if (result.hasErrors()) {
            StringJoiner joiner = new StringJoiner(",");
            List<FieldError> errors = result.getFieldErrors();
            for (FieldError error : errors) {
                joiner.add(error.getDefaultMessage());
            }
            throw new ResultRuntimeException(ResultUtils.validateError(joiner.toString()));
        }

    }
}