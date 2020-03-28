package com.example.commons.db.es.repository;

import org.springframework.data.repository.NoRepositoryBean;
import org.springframework.data.solr.repository.SolrRepository;

import java.io.Serializable;

/**
 * @program: admin-demo-gradle
 * @description:
 * @author: yuane
 * @create: 2020-03-28 13:44
 */
@NoRepositoryBean
public interface BaseSolrRespository<T, ID extends Serializable> extends SolrRepository<T, ID> {
}