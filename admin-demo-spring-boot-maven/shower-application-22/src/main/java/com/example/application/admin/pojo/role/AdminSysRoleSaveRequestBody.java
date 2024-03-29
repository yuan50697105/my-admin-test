package com.example.application.admin.pojo.role;

import com.example.commons.db.mybatis.plus.sqlhelper.module.constants.EnableConstants;
import com.example.commons.base.utils.validator.annotation.ConstantsValidater;
import lombok.Data;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import java.util.List;

/**
 * 角色保存实体
 *
 * @program: admin-demo-gradle
 * @description:
 * @author: yuane
 * @create: 2020-04-06 14:43
 */
@Data
public class AdminSysRoleSaveRequestBody {
    public static final String CODE_NOT_BLANK = "code not blank";
    public static final String NAME_NOT_BLANK = "name not blank";
    public static final String PERMISSION_IDS_NOT_EMPTY = "permissionIds not empty";
    @ConstantsValidater(constants = EnableConstants.class, message = "aaa")
    public String enabled;
    /**
     * 角色编号
     */
    @NotBlank(message = CODE_NOT_BLANK)
    private String code;
    /**
     * 角色名称
     */
    @NotBlank(message = NAME_NOT_BLANK)
    private String name;
    /**
     * 权限ID列表
     */
    @NotEmpty(message = PERMISSION_IDS_NOT_EMPTY)
    private List<Long> permissionIds;
}