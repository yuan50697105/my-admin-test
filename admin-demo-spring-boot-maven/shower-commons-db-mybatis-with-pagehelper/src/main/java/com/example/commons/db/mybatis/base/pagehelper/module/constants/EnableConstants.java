package com.example.commons.db.mybatis.base.pagehelper.module.constants;

import com.example.commons.base.constants.BaseConstants;
import com.example.commons.base.utils.annotation.Constants;

/**
 * @program: admin-demo-gradle
 * @description: 启用状态
 * @author: yuane
 * @create: 2020-04-06 02:47
 */

public class EnableConstants extends BaseConstants {
    @Constants(name = "启用", value = EnableConstants.ENABLED)
    public static final String ENABLED = "ENABLED";
    @Constants(name = "停用", value = EnableConstants.DISABLED)
    public static final String DISABLED = "DISABLED";
}