package com.example.commons.db.mybatis.base.pagehelper.test.constants;

import com.example.commons.db.utils.annotation.Constants;

/**
 * @program: admin-demo-gradle
 * @description: 启用状态
 * @author: yuane
 * @create: 2020-04-06 02:47
 */

public class EnableConstants {
    @Constants(name = "启用", value = EnableConstants.ENABLED)
    public static final String ENABLED = "ENABLED";
    @Constants(name = "停用", value = EnableConstants.DISABLED)
    public static final String DISABLED = "DISABLED";
}