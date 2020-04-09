package com.example.commons.db.mybatis.mapper.base.pagehelper.test.pojo;

import com.example.commons.db.mybatis.mapper.base.pagehelper.commons.pojo.CommonsEntity;
import lombok.*;

import javax.persistence.Column;
import javax.persistence.Table;
import java.io.Serializable;

/**
    * sys_role
    */
@Data
@EqualsAndHashCode(callSuper=true)
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "sys_role")
public class SysRole extends CommonsEntity implements Serializable {
    /**
     * 角色编号
     */
    @Column(name = "code")
    private String code;

    /**
     * 角色名称
     */
    @Column(name = "`name`")
    private String name;

    /**
     * 启用状态
     */
    @Column(name = "enabled")
    private String enabled;

    private static final long serialVersionUID = 1L;
}