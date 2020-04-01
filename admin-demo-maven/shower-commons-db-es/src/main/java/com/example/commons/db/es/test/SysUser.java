package com.example.commons.db.es.test;

import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;
import org.springframework.data.elasticsearch.annotations.Field;
import org.springframework.data.elasticsearch.annotations.FieldType;

@Document(indexName = "sys_user", type = "article")
public class SysUser {
    @Id
    @Field(type = FieldType.Long, index = true, store = true)//index 默认为true，可以不写
    private long id;

    @Field(type = FieldType.Text, index = true, store = true, analyzer = "ik_smart", searchAnalyzer = "ik_max_word")
    private String title;

    @Field(type = FieldType.Text, index = true, store = true, analyzer = "ik_smart", searchAnalyzer = "ik_max_word")
    private String content;
}
