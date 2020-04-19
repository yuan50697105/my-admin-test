package com.example.commons.base.pojo;

import cn.hutool.core.bean.BeanUtil;
import cn.hutool.core.bean.copier.CopyOptions;
import lombok.Data;

/**
 * @program: admin-demo
 * @description:
 * @author: yuane
 * @create: 2020-03-26 23:29
 */
@Data
public abstract class AbstractCommonsEntity {
    public void copyFrom(Object object, String... ignoreProperties) {
        BeanUtil.copyProperties(object, this, ignoreProperties);
    }

    public void copyFromIgnoreNull(Object object, String... ignoreProperties) {
        BeanUtil.copyProperties(object, this, CopyOptions.create().ignoreNullValue().setIgnoreProperties(ignoreProperties));
    }
}