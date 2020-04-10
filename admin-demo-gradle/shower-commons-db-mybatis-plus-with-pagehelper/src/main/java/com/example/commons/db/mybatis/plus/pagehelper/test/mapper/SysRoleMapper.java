package com.example.commons.db.mybatis.plus.pagehelper.test.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.commons.db.mybatis.plus.pagehelper.test.pojo.SysRole;
import com.example.commons.db.mybatis.plus.pagehelper.test.pojo.SysRoleExample;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface SysRoleMapper extends BaseMapper<SysRole> {
    long countByExample(SysRoleExample example);

    int deleteByExample(SysRoleExample example);

    List<SysRole> selectByExample(SysRoleExample example);

    int updateByExampleSelective(@Param("record") SysRole record, @Param("example") SysRoleExample example);

    int updateByExample(@Param("record") SysRole record, @Param("example") SysRoleExample example);

    int updateBatch(List<SysRole> list);

    int updateBatchSelective(List<SysRole> list);

    int batchInsert(@Param("list") List<SysRole> list);
}