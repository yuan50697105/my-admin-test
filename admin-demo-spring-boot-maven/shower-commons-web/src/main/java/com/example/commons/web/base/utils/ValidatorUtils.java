package com.example.commons.web.base.utils;

import com.example.commons.web.base.exception.ResultRuntimeException;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;

import java.util.List;
import java.util.StringJoiner;

public class ValidatorUtils {

    public static void validate(BindingResult result) {
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
