package com.example.commons.web.validator;

import cn.hutool.core.util.ObjectUtil;
import com.example.commons.utils.RegexUtils;
import com.example.commons.web.validator.annotation.ConstantsValidater;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class ConstantsValidateFactory implements ConstraintValidator<ConstantsValidater, Object> {
    private Class<?> type;

    @Override
    public void initialize(ConstantsValidater constraintAnnotation) {
        type = constraintAnnotation.constants();
    }

    @Override
    public boolean isValid(Object value, ConstraintValidatorContext context) {
        if (ObjectUtil.isEmpty(value)) {
            return false;
        } else {
            String regex = RegexUtils.regex(type);
            return value.toString().matches(regex);
        }
    }
}
