package com.example.commons.db.mybatis.mapper.base.pagehelper.test.mapper;

import com.example.commons.db.mybatis.mapper.base.pagehelper.test.pojo.SysRole;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface SysRoleMapper extends tk.mybatis.mapper.common.Mapper<SysRole> {
    int updateBatch(List<SysRole> list);

    int updateBatchSelective(List<SysRole> list);

    int batchInsert(@Param("list") List<SysRole> list);
}