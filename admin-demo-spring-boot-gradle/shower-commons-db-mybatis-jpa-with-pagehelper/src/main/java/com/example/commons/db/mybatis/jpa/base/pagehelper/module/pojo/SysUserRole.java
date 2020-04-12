package com.example.commons.db.mybatis.jpa.base.pagehelper.module.pojo;

import com.example.commons.db.mybatis.jpa.base.pagehelper.commons.pojo.CommonsEntity;
import lombok.*;

import javax.persistence.Entity;
import java.io.Serializable;

/**
    * sys_user_role
    */
@Data
@EqualsAndHashCode(callSuper=true)
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class SysUserRole extends CommonsEntity implements Serializable {
    /**
    * 用户ID
    */
    private Long userId;

    /**
    * 角色ID
    */
    private Long roleId;

    private static final long serialVersionUID = 1L;
}