package com.example.application.pojo.admin.role;

import com.example.commons.db.mybatis.base.pagehelper.test.constants.EnableConstants;
import com.example.commons.pojo.BaseEntity;
import com.example.commons.utils.RegexUtils;
import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;

import static com.example.commons.utils.RegexUtils.regex;

/**
 * 角色保存实体
 *
 * @program: admin-demo-gradle
 * @description:
 * @author: yuane
 * @create: 2020-04-06 14:43
 */
@EqualsAndHashCode(callSuper = true)
@Data
public class AdminSysRoleSaveRequestBody extends BaseEntity {
    public static final String CODE_NOT_BLANK = "code not blank";
    public static final String NAME_NOT_BLANK = "name not blank";
    public static final String REGEX = RegexUtils.regex(EnableConstants.class);
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

}