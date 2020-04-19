package org.yuan.admin.commons.entity;

import lombok.Data;

/**
 * @program: my-admin-gradle
 * @description:
 * @author: yuane
 * @create: 2020-04-19 19:07
 */
@Data
public class ICommonsQuery {
    private Integer page = 1;
    private Integer size = 20;
}