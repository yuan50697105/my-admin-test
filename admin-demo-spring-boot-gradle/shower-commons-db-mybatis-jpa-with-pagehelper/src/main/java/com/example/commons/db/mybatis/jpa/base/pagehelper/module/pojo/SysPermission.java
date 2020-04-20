package com.example.commons.db.mybatis.jpa.base.pagehelper.module.pojo;

import com.example.commons.db.mybatis.jpa.base.pagehelper.commons.pojo.CommonsEntity;
import com.example.commons.db.mybatis.jpa.base.pagehelper.module.constants.EnableConstants;
import com.example.commons.db.mybatis.jpa.base.pagehelper.module.constants.PermissionConstants;
import lombok.*;

import javax.persistence.Entity;
import java.io.Serializable;

/**
    * sys_permission
    */
@Data
@EqualsAndHashCode(callSuper=true)
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class SysPermission extends CommonsEntity implements Serializable {
    /**
    * 权限名称
    */
    private String name;

    /**
    * 全新编号
    */
    private String code;

    /**
    * 类型 {@link PermissionConstants}
    */
    private String type;

    /**
    * 启用状态 {@link EnableConstants}
    */
    private String enabled;

    private static final long serialVersionUID = 1L;
}