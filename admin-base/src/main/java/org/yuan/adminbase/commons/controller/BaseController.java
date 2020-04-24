package org.yuan.adminbase.commons.controller;

import org.yuan.adminbase.commons.entity.ResponseResult;
import org.yuan.adminbase.commons.utils.ResponseResultUtils;

/**
 * @program: admin-base
 * @description: 基础控制器
 * @author: yuane
 * @create: 2020-04-24 21:46
 */
public class BaseController {

    public ResponseResult<?> ok(String message) {
        return ResponseResultUtils.ok(message);
    }

    public <T> ResponseResult<T> ok(String message, T data) {
        return ResponseResultUtils.ok(message, data);
    }

    public ResponseResult<?> error(String message) {
        return ResponseResultUtils.error(message);
    }

    public <T> ResponseResult<T> error(String message, T data) {
        return ResponseResultUtils.error(message, data);
    }
}