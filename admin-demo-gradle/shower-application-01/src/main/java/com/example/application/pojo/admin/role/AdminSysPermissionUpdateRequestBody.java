package com.example.application.pojo.admin.role;

import lombok.Data;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import java.util.List;

/**
 * 角色修改实体
 *
 * @program: admin-demo-gradle
 * @description:
 * @author: yuane
 * @create: 2020-04-06 14:45
 */
@Data
public class AdminSysPermissionUpdateRequestBody {
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