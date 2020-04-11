package com.example.commons.db.solr.dao.impl;

import com.example.commons.db.solr.dao.BaseSolrDao;
import com.example.commons.db.solr.repository.BaseSolrRespository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.solr.core.SolrTemplate;

import java.io.Serializable;

/**
 * @program: admin-demo-gradle
 * @description:
 * @author: yuane
 * @create: 2020-03-28 13:45
 */
public class BaseSolrDaoImpl<T, ID extends Serializable, R extends BaseSolrRespository<T, ID>> implements BaseSolrDao<T, ID> {
    @Autowired
    protected R baseRepository;
    @Autowired
    protected SolrTemplate solrTemplate;
}