package com.example.commons.batch;

import cn.hutool.extra.spring.SpringUtil;
import org.springframework.batch.core.Job;
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
@Import(SpringUtil.class)
public class BatchApplication {
    public static void main(String[] args) {
        Job job = SpringUtil.getBean(Job1Configuration.JOB_01, Job.class);

        SpringApplication.run(BatchApplication.class, args);
    }
}