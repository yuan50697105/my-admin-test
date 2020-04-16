package com.example.commons.db.mybatis.base.pagehelper.module.service;

import com.example.commons.db.mybatis.base.pagehelper.module.pojo.SysDictExample;
import com.example.commons.db.mybatis.base.pagehelper.module.pojo.SysDict;
import java.util.List;
public interface SysDictService{


    long countByExample(SysDictExample example);

    int deleteByExample(SysDictExample example);

    int deleteByPrimaryKey(Long id);

    int insert(SysDict record);

    int insertSelective(SysDict record);

    List<SysDict> selectByExample(SysDictExample example);

    SysDict selectByPrimaryKey(Long id);

    int updateByExampleSelective(SysDict record,SysDictExample example);

    int updateByExample(SysDict record,SysDictExample example);

    int updateByPrimaryKeySelective(SysDict record);

    int updateByPrimaryKey(SysDict record);

    int updateBatch(List<SysDict> list);

    int updateBatchSelective(List<SysDict> list);

    int batchInsert(List<SysDict> list);

    List<SysDict> listByGroupId(Long groupId);
}
