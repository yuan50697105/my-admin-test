package com.example.commons.web.base.controller;

import com.example.commons.web.base.exception.ResultRuntimeException;
import com.example.commons.web.base.utils.ValidatorUtils;
import org.springframework.validation.BindingResult;

/**
 * @program: admin-demo
 * @description:
 * @author: yuane
 * @create: 2020-03-26 23:26
 */
public class BaseController {
    public void validate(BindingResult result) throws ResultRuntimeException {
        ValidatorUtils.validate(result);
    }

}