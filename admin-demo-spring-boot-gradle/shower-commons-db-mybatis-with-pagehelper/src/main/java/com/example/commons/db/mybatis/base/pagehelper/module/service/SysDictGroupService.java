package com.example.commons.db.mybatis.base.pagehelper.module.service;

import com.example.commons.db.mybatis.base.pagehelper.module.pojo.SysDictGroup;
import com.example.commons.db.mybatis.base.pagehelper.module.pojo.SysDictGroupExample;

import java.util.List;
public interface SysDictGroupService{


    long countByExample(SysDictGroupExample example);

    int deleteByExample(SysDictGroupExample example);

    int deleteByPrimaryKey(Long id);

    int insert(SysDictGroup record);

    int insertSelective(SysDictGroup record);

    List<SysDictGroup> selectByExample(SysDictGroupExample example);

    SysDictGroup selectByPrimaryKey(Long id);

    int updateByExampleSelective(SysDictGroup record,SysDictGroupExample example);

    int updateByExample(SysDictGroup record,SysDictGroupExample example);

    int updateByPrimaryKeySelective(SysDictGroup record);

    int updateByPrimaryKey(SysDictGroup record);

    int updateBatch(List<SysDictGroup> list);

    int updateBatchSelective(List<SysDictGroup> list);

    int batchInsert(List<SysDictGroup> list);

    SysDictGroup getByKey(String group);
}
