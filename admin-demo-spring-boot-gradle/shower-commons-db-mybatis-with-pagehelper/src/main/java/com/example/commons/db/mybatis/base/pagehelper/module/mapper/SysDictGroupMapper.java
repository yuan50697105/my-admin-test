package com.example.commons.db.mybatis.base.pagehelper.module.mapper;

import com.example.commons.db.mybatis.base.pagehelper.module.pojo.SysDictGroup;
import com.example.commons.db.mybatis.base.pagehelper.module.pojo.SysDictGroupExample;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface SysDictGroupMapper {
    long countByExample(SysDictGroupExample example);

    int deleteByExample(SysDictGroupExample example);

    int deleteByPrimaryKey(Long id);

    int insert(SysDictGroup record);

    int insertSelective(SysDictGroup record);

    List<SysDictGroup> selectByExample(SysDictGroupExample example);

    SysDictGroup selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") SysDictGroup record, @Param("example") SysDictGroupExample example);

    int updateByExample(@Param("record") SysDictGroup record, @Param("example") SysDictGroupExample example);

    int updateByPrimaryKeySelective(SysDictGroup record);

    int updateByPrimaryKey(SysDictGroup record);

    int updateBatch(List<SysDictGroup> list);

    int updateBatchSelective(List<SysDictGroup> list);

    int batchInsert(@Param("list") List<SysDictGroup> list);
}