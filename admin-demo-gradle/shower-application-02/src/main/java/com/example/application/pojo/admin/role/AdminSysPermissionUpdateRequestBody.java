package com.example.application.pojo.admin.role;

import com.example.commons.pojo.BaseEntity;
import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import java.util.List;

/**
 * 角色修改实体
 * @program: admin-demo-gradle
 * @description:
 * @author: yuane
 * @create: 2020-04-06 14:45
 */
@EqualsAndHashCode(callSuper = true)
@Data
public class AdminSysPermissionUpdateRequestBody extends BaseEntity {
    public static final String ID_NOT_EMPTY = "id not empty";
    public static final String PERMISSION_IDS_NOT_EMPTY = "permissionIds not empty";
    /**
     * 主键
     */
    @NotBlank(message = ID_NOT_EMPTY)
    private Long id;
    /**
     * 角色名称
     */
    @NotEmpty(message = PERMISSION_IDS_NOT_EMPTY)
    private List<Long> permissionIds;
}