package com.example.commons.pojo;

import cn.hutool.core.bean.BeanUtil;
import lombok.Data;

/**
 * @program: admin-demo
 * @description:
 * @author: yuane
 * @create: 2020-03-26 23:29
 */
@Data
public class BaseEntity {
    public void copyFrom(Object object, String... ignoreProperties) {
        BeanUtil.copyProperties(object, this, ignoreProperties);
    }
}