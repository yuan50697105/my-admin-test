package com.example.commons.web.validator.annotation;

import com.example.commons.web.validator.ConstantsValidateFactory;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.*;

@Target( { ElementType.METHOD, ElementType.FIELD, ElementType.ANNOTATION_TYPE })
@Retention(RetentionPolicy.RUNTIME)
@Constraint(validatedBy = ConstantsValidateFactory.class)
@Documented
public @interface ConstantsValidater {
    /*
     * 用于验证的注解下列这三个方法必须要，这是Hibernate Validation框架要求的，否则程序再在调用的时候会报错
     * default用于对属性给定默认值
     *  如果不给定默认值，则在使用注解的时候必须给属性指定属性值，否则报错
     *  给定默认值时，在使用注解的时候可以不用指定属性值
     */
    String message() default "不符合正则！";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};

    // 没加default给定默认值，使用注解的时候该属性必须赋值，否则报错
    String regex() default "";
    // value属性，加上了default "mercy" 使得该属性在使用注解的时候可以不用输入也不会报错
    String value() default "mercy";

    Class<?> constants();
}
