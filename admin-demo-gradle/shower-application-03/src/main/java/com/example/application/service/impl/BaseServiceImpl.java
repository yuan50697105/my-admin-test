package com.example.application.service.impl;

import com.example.commons.web.pojo.Result;
import com.example.commons.web.utils.ResultUtils;

/**
 * @program: admin-demo-gradle
 * @description:
 * @author: yuane
 * @create: 2020-04-06 14:01
 */
public class BaseServiceImpl {
    public static final String UPDATE_SUCCESS = "修改成功";
    public static final String SAVE_SUCCESS = "保存成功";
    public static final String DELELE_SUCCESS = "删除成功";

    public Result saveSuccess() {
        return ResultUtils.ok(SAVE_SUCCESS);
    }

    public Result updateSuccess() {
        return ResultUtils.ok(UPDATE_SUCCESS);
    }

    public Result deleteSuccess() {
        return ResultUtils.ok(DELELE_SUCCESS);
    }
}