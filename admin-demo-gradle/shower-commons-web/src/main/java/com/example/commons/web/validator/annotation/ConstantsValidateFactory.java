package com.example.commons.web.validator.annotation;

import cn.hutool.core.util.ObjectUtil;
import com.example.commons.utils.RegexUtils;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class ConstantsValidateFactory implements ConstraintValidator<ConstantsValidater, Object> {
    private Class<?> type;

    @Override
    public void initialize(ConstantsValidater constraintAnnotation) {
        type = constraintAnnotation.regex();
    }

    @Override
    public boolean isValid(Object value, ConstraintValidatorContext context) {
        if (ObjectUtil.isEmpty(value)) {
            return false;
        } else {
            return value.toString().matches(RegexUtils.regex(type));
        }
    }
}
