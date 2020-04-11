package com.example.commons.db.es.base.service.impl;

import com.example.commons.db.es.base.repository.BaseEsRespository;
import com.example.commons.db.es.base.service.BaseEsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.elasticsearch.core.ElasticsearchRestTemplate;
import org.springframework.data.elasticsearch.core.ElasticsearchTemplate;
import org.springframework.data.elasticsearch.core.ReactiveElasticsearchTemplate;

/**
 * @program: admin-demo-gradle
 * @description:
 * @author: yuane
 * @create: 2020-03-28 13:45
 */
public class BaseEsServiceImpl<T, ID, R extends BaseEsRespository<T, ID>> implements BaseEsService<T, ID> {
    @Autowired
    protected R baseRepository;
    @Autowired
    protected ElasticsearchTemplate elasticsearchTemplate;
    @Autowired
    private ElasticsearchRestTemplate elasticsearchRestTemplate;
    @Autowired
    private ReactiveElasticsearchTemplate reactiveElasticsearchTemplate;


}