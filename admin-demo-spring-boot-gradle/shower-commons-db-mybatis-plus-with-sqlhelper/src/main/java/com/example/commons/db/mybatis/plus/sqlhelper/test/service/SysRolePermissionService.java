package com.example.commons.db.mybatis.plus.sqlhelper.test.service;

import java.util.List;
import com.example.commons.db.mybatis.plus.sqlhelper.test.pojo.SysRolePermission;
import com.example.commons.db.mybatis.plus.sqlhelper.test.pojo.SysRolePermissionExample;
import com.baomidou.mybatisplus.extension.service.IService;
public interface SysRolePermissionService extends IService<SysRolePermission>{


    long countByExample(SysRolePermissionExample example);

    int deleteByExample(SysRolePermissionExample example);

    List<SysRolePermission> selectByExample(SysRolePermissionExample example);

    int updateByExampleSelective(SysRolePermission record,SysRolePermissionExample example);

    int updateByExample(SysRolePermission record,SysRolePermissionExample example);

    int updateBatch(List<SysRolePermission> list);

    int updateBatchSelective(List<SysRolePermission> list);

    int batchInsert(List<SysRolePermission> list);

}
