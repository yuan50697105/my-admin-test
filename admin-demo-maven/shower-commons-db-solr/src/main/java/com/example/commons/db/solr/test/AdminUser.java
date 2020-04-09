package com.example.commons.db.solr.test;

import com.example.commons.db.solr.pojo.BaseDbSolrEntity;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.springframework.data.annotation.Id;

/**
 * @program: admin-demo-gradle
 * @description:
 * @author: yuane
 * @create: 2020-04-05 13:12
 */
@EqualsAndHashCode(callSuper = true)
@Data
public class AdminUser extends BaseDbSolrEntity {
    @Id
    private Long id;
}