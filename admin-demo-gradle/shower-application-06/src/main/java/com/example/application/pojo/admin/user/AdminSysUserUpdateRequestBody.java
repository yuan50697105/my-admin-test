package com.example.application.pojo.admin.user;

import com.example.commons.pojo.BaseEntity;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 修改用户信息使用实体
 *
 * @program: admin-demo-gradle
 * @description:
 * @author: yuane
 * @create: 2020-04-06 13:55
 */
@EqualsAndHashCode(callSuper = true)
@Data
public class AdminSysUserUpdateRequestBody extends BaseEntity {
    /**
     * 主键
     */
    private Long id;
    /**
     * 姓名
     */
    private String name;
}