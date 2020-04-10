package com.example.commons.db.mybatis.plus.sqlhelper.test.service;

import java.util.List;
import com.example.commons.db.mybatis.plus.sqlhelper.test.pojo.SysUserRole;
import com.example.commons.db.mybatis.plus.sqlhelper.test.pojo.SysUserRoleExample;
import com.baomidou.mybatisplus.extension.service.IService;
public interface SysUserRoleService extends IService<SysUserRole>{


    long countByExample(SysUserRoleExample example);

    int deleteByExample(SysUserRoleExample example);

    List<SysUserRole> selectByExample(SysUserRoleExample example);

    int updateByExampleSelective(SysUserRole record,SysUserRoleExample example);

    int updateByExample(SysUserRole record,SysUserRoleExample example);

    int updateBatch(List<SysUserRole> list);

    int updateBatchSelective(List<SysUserRole> list);

    int batchInsert(List<SysUserRole> list);

}
