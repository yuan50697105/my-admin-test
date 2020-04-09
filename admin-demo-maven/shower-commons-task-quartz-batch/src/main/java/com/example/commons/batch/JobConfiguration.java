package com.example.commons.batch;

import lombok.extern.slf4j.Slf4j;
import org.springframework.batch.core.Job;
import org.springframework.batch.core.Step;
import org.springframework.batch.core.configuration.annotation.EnableBatchProcessing;
import org.springframework.batch.core.configuration.annotation.JobBuilderFactory;
import org.springframework.batch.core.configuration.annotation.StepBuilderFactory;
import org.springframework.batch.core.launch.support.RunIdIncrementer;
import org.springframework.batch.repeat.RepeatStatus;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Map;

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

    public static final String JOB_01 = "job_01";
    public static final String STEP_01 = "step_01";
    public static final String RUN_ID_INCREMENTER = "runIdIncrementer";
    @Autowired
    private JobBuilderFactory jobBuilderFactory;
    @Autowired
    private StepBuilderFactory stepBuilderFactory;

    @Bean(JOB_01)
    public Job job01() {
        return jobBuilderFactory.get(JOB_01).start(step01()).build();
    }


    @Bean(STEP_01)
    public Step step01() {
        return stepBuilderFactory.get(STEP_01).tasklet((contribution, chunkContext) -> {
            log.info("Hello Spring batch");
            Map<String, Object> jobParameters = chunkContext.getStepContext().getJobParameters();
            return RepeatStatus.FINISHED;
        }).build();
    }

    @Bean(RUN_ID_INCREMENTER)
    public RunIdIncrementer runIdIncrementer() {
        return new RunIdIncrementer();
    }
}