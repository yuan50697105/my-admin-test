package com.example.commons.db.es.dao.impl;

import com.example.commons.db.es.dao.BaseEsDao;
import com.example.commons.db.es.repository.BaseEsRespository;
import com.github.vanroy.springdata.jest.JestElasticsearchTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.elasticsearch.core.ElasticsearchRestTemplate;
import org.springframework.data.elasticsearch.core.ElasticsearchTemplate;

/**
 * @program: admin-demo-gradle
 * @description:
 * @author: yuane
 * @create: 2020-03-28 13:45
 */
public class BaseEsDaoImpl<T, ID, R extends BaseEsRespository<T, ID>> implements BaseEsDao<T, ID> {
    @Autowired
    protected R baseRepository;
    @Autowired
    protected ElasticsearchTemplate elasticsearchTemplate;
    @Autowired
    protected ElasticsearchRestTemplate elasticsearchRestTemplate;
    @Autowired
    protected JestElasticsearchTemplate jestElasticsearchTemplate;

}