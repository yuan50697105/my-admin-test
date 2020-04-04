package com.example.commons.batch;

import lombok.extern.slf4j.Slf4j;
import org.springframework.batch.core.configuration.annotation.EnableBatchProcessing;
import org.springframework.batch.core.launch.support.RunIdIncrementer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @program: admin-demo-gradle
 * @description:
 * @author: yuane
 * @create: 2020-04-04 14:00
 */
@Configuration
@EnableBatchProcessing
@Slf4j
public class JobConfiguration {

    public static final String RUN_ID_INCREMENTER = "runIdIncrementer";


    @Bean(RUN_ID_INCREMENTER)
    public RunIdIncrementer runIdIncrementer() {
        return new RunIdIncrementer();
    }

}