package com.example.commons.db.mybatis.mapper.base.pagehelper.test.mapper;

import com.example.commons.db.mybatis.mapper.base.pagehelper.test.pojo.SysUserRole;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface SysUserRoleMapper extends tk.mybatis.mapper.common.Mapper<SysUserRole> {
    int updateBatch(List<SysUserRole> list);

    int updateBatchSelective(List<SysUserRole> list);

    int batchInsert(@Param("list") List<SysUserRole> list);
}