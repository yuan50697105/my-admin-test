package com.example.application.pojo.admin.user;

import com.example.commons.pojo.BaseEntity;
import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

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
    public static final String ID_NOT_NULL = "id not null";
    public static final String NAME_NOT_BLANK = "name not blank";
    /**
     * 主键
     */
    @NotNull(message = ID_NOT_NULL)
    private Long id;
    /**
     * 姓名
     */
    @NotBlank(message = NAME_NOT_BLANK)
    private String name;
}