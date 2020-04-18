package com.example.application.admin.pojo.permission;

import com.example.commons.db.mybatis.jpa.base.sqlhelper.module.constants.PermissionConstants;
import com.example.commons.base.utils.validator.annotation.ConstantsValidater;
import lombok.Data;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

/**
 * @program: admin-demo-gradle
 * @description:
 * @author: yuane
 * @create: 2020-04-09 19:57
 */
@Data
public class AdminSysPermissionUpdateRequestBody {
    public static final String NAME_NOT_EMPTY = "name not empty";
    public static final String TYPE_NOT_EMPTY = "type not empty";
    public static final String ID_NOT_NULL = "id not null";
    @NotNull(message = ID_NOT_NULL)
    private Long id;
    @NotBlank(message = NAME_NOT_EMPTY)
    private String name;
    @ConstantsValidater(constants = PermissionConstants.class, message = TYPE_NOT_EMPTY)
    private String type;

}