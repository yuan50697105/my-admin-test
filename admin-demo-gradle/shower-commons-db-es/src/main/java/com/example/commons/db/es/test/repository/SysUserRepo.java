package com.example.commons.db.es.test.repository;

import com.example.commons.db.es.base.repository.BaseEsRespository;
import com.example.commons.db.es.test.pojo.SysUser;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SysUserRepo extends BaseEsRespository<SysUser, Long> {
    List<SysUser> findAllByContentLike(String content);

}