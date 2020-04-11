package com.example.commons.db.es.repository;

import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import org.springframework.data.repository.NoRepositoryBean;

/**
 * @program: admin-demo-gradle
 * @description:
 * @author: yuane
 * @create: 2020-03-28 13:44
 */
@NoRepositoryBean
public interface BaseEsRespository<T,ID> extends ElasticsearchRepository<T,ID> {
}