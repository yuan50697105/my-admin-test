package com.example.commons.db.mybatis.jpa.base.pagehelper.module.repository;

import com.example.commons.db.mybatis.jpa.base.pagehelper.base.repository.BaseRepository;
import com.example.commons.db.mybatis.jpa.base.pagehelper.module.pojo.SysRole;
import org.springframework.stereotype.Repository;

/**
 * @program: admin-demo-spring-boot-gradle
 * @description:
 * @author: yuane
 * @create: 2020-04-12 14:58
 */
@Repository
public interface SysRoleRepository extends BaseRepository<SysRole, Long> {
}
