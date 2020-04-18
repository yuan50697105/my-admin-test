package com.example.application.admin.pojo.user;

import com.example.commons.base.pojo.BaseEntity;
import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import java.util.List;

/**
 * @program: admin-demo-gradle
 * @description:
 * @author: yuane
 * @create: 2020-04-06 13:47
 */
@EqualsAndHashCode(callSuper = true)
@Data
public class AdminSysUserSaveRequestBody extends BaseEntity {
    public static final String USERNAME_NOT_BLANK = "username not blank";
    public static final String NAME_NOT_BLANK = "name not blank";
    public static final String PASSWORD_NOT_BLANK = "password not blank";
    public static final String ROLE_IDS_NOT_EMPTY = "roleIds not empty";
    /**
     * 账户
     */
    @NotBlank(message = USERNAME_NOT_BLANK)
    private String username;
    /**
     * 姓名
     */
    @NotBlank(message = NAME_NOT_BLANK)
    private String name;
    /**
     * 密码
     */
    @NotBlank(message = PASSWORD_NOT_BLANK)
    private String password;
    /**
     * 角色ID
     */
    @NotEmpty(message = ROLE_IDS_NOT_EMPTY)
    private List<Long> roleIds;
}