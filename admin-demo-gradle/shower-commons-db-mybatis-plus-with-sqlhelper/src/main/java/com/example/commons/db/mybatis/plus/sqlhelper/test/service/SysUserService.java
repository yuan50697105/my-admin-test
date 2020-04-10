package com.example.commons.db.mybatis.plus.sqlhelper.test.service;

import java.util.List;
import com.example.commons.db.mybatis.plus.sqlhelper.test.pojo.SysUser;
import com.example.commons.db.mybatis.plus.sqlhelper.test.pojo.SysUserExample;
import com.baomidou.mybatisplus.extension.service.IService;
public interface SysUserService extends IService<SysUser>{


    long countByExample(SysUserExample example);

    int deleteByExample(SysUserExample example);

    List<SysUser> selectByExample(SysUserExample example);

    int updateByExampleSelective(SysUser record,SysUserExample example);

    int updateByExample(SysUser record,SysUserExample example);

    int updateBatch(List<SysUser> list);

    int updateBatchSelective(List<SysUser> list);

    int batchInsert(List<SysUser> list);

}
