package com.example.commons.db.mybatis.base.pageable.module.constants;

import com.example.commons.base.constants.BaseConstants;
import com.example.commons.base.utils.annotation.Constants;

/**
 * @program: admin-demo-gradle
 * @description:
 * @author: yuane
 * @create: 2020-04-09 19:57
 */
public class PermissionConstants extends BaseConstants {

    public static class PermissionType {
        @Constants(name = "链接", value = PermissionType.URL)
        public static final String URL = "url";
        @Constants(name = "按钮", value = PermissionType.BUTTON)
        public static final String BUTTON = "button";
        @Constants(name = "数据", value = PermissionType.DATA)
        public static final String DATA = "data";
    }


}