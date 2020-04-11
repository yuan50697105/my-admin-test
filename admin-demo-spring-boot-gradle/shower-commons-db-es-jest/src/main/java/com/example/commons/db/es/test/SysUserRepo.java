package com.example.commons.db.es.test;

import com.example.commons.db.es.repository.BaseEsRespository;
import org.springframework.stereotype.Repository;

@Repository
public interface SysUserRepo extends BaseEsRespository<SysUser, Long> {

}