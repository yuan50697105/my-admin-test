package com.example.commons.base.pojo;

import cn.hutool.core.bean.BeanUtil;
import cn.hutool.core.bean.copier.CopyOptions;

/**
 * @program: admin-demo-spring-boot-maven
 * @description:
 * @author: yuane
 * @create: 2020-04-18 21:59
 */
public class BaseEntity {
    public void copyFrom(Object object, String... ignoreProperties) {
        BeanUtil.copyProperties(object, this, CopyOptions.create().setIgnoreProperties(ignoreProperties));
    }

    public void copyFromIgnoreNull(Object object, String... ignoreProperties) {
        BeanUtil.copyProperties(object, this, CopyOptions.create().ignoreNullValue().setIgnoreProperties(ignoreProperties));
    }
}