package com.example.commons.db.mybatis.base.pagehelper.test.constants;

import com.example.commons.db.utils.DictUtils;
import com.example.commons.db.utils.annotation.ConstantsName;

import java.util.Map;

/**
 * @program: admin-demo-gradle
 * @description: 启用状态
 * @author: yuane
 * @create: 2020-04-06 02:47
 */

public class EnableConstants {
    @ConstantsName(name = "启用")
    public static final String ENABLED = "ENABLED";
    @ConstantsName(name = "停用")
    public static final String DISABLED = "DISABLED";
}