package com.example.commons.db.es.test;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;
import org.springframework.data.elasticsearch.annotations.Field;
import org.springframework.data.elasticsearch.annotations.FieldType;

@Document(indexName = "sys_user1", type = "article", useServerConfiguration = true)
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class SysUser {
    @Id
    @Field(index = true, store = true)//index 默认为true，可以不写
    private long id;

    @Field(type = FieldType.Text, index = true, store = true, analyzer = "ik_pinyin_analyzer", searchAnalyzer = "ik_pinyin_analyzer")
    private String title;

    @Field(type = FieldType.Text, index = true, store = true, analyzer = "ik_pinyin_analyzer", searchAnalyzer = "ik_pinyin_analyzer")
    private String content;
}