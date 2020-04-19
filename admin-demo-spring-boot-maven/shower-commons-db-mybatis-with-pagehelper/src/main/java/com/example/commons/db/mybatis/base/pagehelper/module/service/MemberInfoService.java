package com.example.commons.db.mybatis.base.pagehelper.module.service;

import java.util.List;
import com.example.commons.db.mybatis.base.pagehelper.module.pojo.MemberInfo;
import com.example.commons.db.mybatis.base.pagehelper.module.pojo.MemberInfoExample;
public interface MemberInfoService{


    long countByExample(MemberInfoExample example);

    int deleteByExample(MemberInfoExample example);

    int deleteByPrimaryKey(Long id);

    int insert(MemberInfo record);

    int insertSelective(MemberInfo record);

    List<MemberInfo> selectByExample(MemberInfoExample example);

    MemberInfo selectByPrimaryKey(Long id);

    int updateByExampleSelective(MemberInfo record,MemberInfoExample example);

    int updateByExample(MemberInfo record,MemberInfoExample example);

    int updateByPrimaryKeySelective(MemberInfo record);

    int updateByPrimaryKey(MemberInfo record);

    int updateBatch(List<MemberInfo> list);

    int updateBatchSelective(List<MemberInfo> list);

    int batchInsert(List<MemberInfo> list);

}
