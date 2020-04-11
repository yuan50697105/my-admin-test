package com.example.commons.db.mybatis.plus.sqlhelper.test.service;

import com.example.commons.db.mybatis.plus.sqlhelper.test.pojo.SysPermissionExample;
import java.util.List;
import com.example.commons.db.mybatis.plus.sqlhelper.test.pojo.SysPermission;
import com.baomidou.mybatisplus.extension.service.IService;
public interface SysPermissionService extends IService<SysPermission>{


    long countByExample(SysPermissionExample example);

    int deleteByExample(SysPermissionExample example);

    List<SysPermission> selectByExample(SysPermissionExample example);

    int updateByExampleSelective(SysPermission record,SysPermissionExample example);

    int updateByExample(SysPermission record,SysPermissionExample example);

    int updateBatch(List<SysPermission> list);

    int updateBatchSelective(List<SysPermission> list);

    int batchInsert(List<SysPermission> list);

}
