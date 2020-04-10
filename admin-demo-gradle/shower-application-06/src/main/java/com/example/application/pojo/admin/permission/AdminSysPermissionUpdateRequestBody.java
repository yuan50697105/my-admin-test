package com.example.application.pojo.admin.permission;

import com.example.commons.db.mybatis.mapper.base.sqlhelper.test.constants.PermissionConstants;
import com.example.commons.pojo.BaseEntity;
import com.example.commons.utils.validator.annotation.ConstantsValidater;
import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

/**
 * @program: admin-demo-gradle
 * @description:
 * @author: yuane
 * @create: 2020-04-09 19:57
 */
@EqualsAndHashCode(callSuper = true)
@Data
public class AdminSysPermissionUpdateRequestBody extends BaseEntity {
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