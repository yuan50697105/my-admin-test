package com.example.commons.db.mybatis.mapper.pagehelper.test.pojo;

import com.example.commons.db.mybatis.mapper.pagehelper.commons.pojo.CommonsEntity;
import com.example.commons.db.mybatis.mapper.pagehelper.test.constants.EnableConstants;
import lombok.*;

import javax.persistence.Column;
import javax.persistence.Table;
import java.io.Serializable;

/**
    * sys_permission
    */
@Data
@EqualsAndHashCode(callSuper=true)
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "sys_permission")
public class SysPermission extends CommonsEntity implements Serializable {
    /**
     * 权限名称
     */
    @Column(name = "`name`")
    private String name;

    /**
     * 全新编号
     */
    @Column(name = "code")
    private String code;

    /**
     * 启用状态 {@link EnableConstants}
     */
    @Column(name = "enabled")
    private String enabled;

    private static final long serialVersionUID = 1L;
}