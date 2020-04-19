package com.example.commons;

import org.springframework.batch.core.configuration.annotation.EnableBatchProcessing;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

/**
 * @program: admin-demo-gradle
 * @description:
 * @author: yuane
 * @create: 2020-04-04 15:03
 */
@SpringBootApplication
@EnableBatchProcessing
@EnableScheduling
public class QuartzBatchApplication {
    public static void main(String[] args) {
        SpringApplication.run(QuartzBatchApplication.class, args);
    }
}