package com.example.commons.db.mybatis.plus.sqlhelper.test.service;

import java.util.List;
import com.example.commons.db.mybatis.plus.sqlhelper.test.pojo.SysRoleExample;
import com.example.commons.db.mybatis.plus.sqlhelper.test.pojo.SysRole;
import com.baomidou.mybatisplus.extension.service.IService;
public interface SysRoleService extends IService<SysRole>{


    long countByExample(SysRoleExample example);

    int deleteByExample(SysRoleExample example);

    List<SysRole> selectByExample(SysRoleExample example);

    int updateByExampleSelective(SysRole record,SysRoleExample example);

    int updateByExample(SysRole record,SysRoleExample example);

    int updateBatch(List<SysRole> list);

    int updateBatchSelective(List<SysRole> list);

    int batchInsert(List<SysRole> list);

}
