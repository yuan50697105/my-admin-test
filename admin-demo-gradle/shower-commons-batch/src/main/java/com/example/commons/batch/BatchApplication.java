package com.example.commons.batch;

import cn.hutool.extra.spring.SpringUtil;
import org.springframework.batch.core.configuration.annotation.EnableBatchProcessing;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;

/**
 * @program: admin-demo-gradle
 * @description:
 * @author: yuane
 * @create: 2020-04-04 15:03
 */
@SpringBootApplication
@EnableBatchProcessing
@Import(SpringUtil.class)
public class BatchApplication {
    public static void main(String[] args) {

        SpringApplication.run(BatchApplication.class, args);

    }
}