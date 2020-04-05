//package com.example.commons.batch;
//
//import lombok.extern.slf4j.Slf4j;
//import org.springframework.batch.core.*;
//import org.springframework.batch.core.configuration.annotation.JobBuilderFactory;
//import org.springframework.batch.core.configuration.annotation.StepBuilderFactory;
//import org.springframework.batch.core.jsr.JobListenerAdapter;
//import org.springframework.batch.core.repository.JobExecutionAlreadyRunningException;
//import org.springframework.batch.core.repository.JobInstanceAlreadyCompleteException;
//import org.springframework.batch.core.repository.JobRepository;
//import org.springframework.batch.core.repository.JobRestartException;
//import org.springframework.batch.core.repository.support.JobRepositoryFactoryBean;
//import org.springframework.batch.core.repository.support.SimpleJobRepository;
//import org.springframework.batch.core.scope.context.StepContext;
//import org.springframework.batch.core.step.builder.StepBuilder;
//import org.springframework.batch.core.step.tasklet.Tasklet;
//import org.springframework.batch.repeat.RepeatStatus;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//
//import javax.batch.api.listener.JobListener;
//import java.util.Collection;
//import java.util.Map;
//
///**
// * @program: admin-demo-gradle
// * @description:
// * @author: yuane
// * @create: 2020-04-04 14:00
// */
//@Configuration
//@Slf4j
//public class JobConfiguration {
//    public static final String BASE_JOB = "baseJob";
//    public static final String STEP_01 = "step01";
//    public static final String STEP_02 = "step02";
//    public static final String TASKLET_01 = "tasklet01";
//    public static final String TASKLET_02 = "tasklet02";
//    public static final String LISTENER = "listener";
//    @Autowired
//    private JobBuilderFactory jobBuilderFactory;
//    @Autowired
//    private StepBuilderFactory stepBuilderFactory;
//
//    @Bean(BASE_JOB)
//    public Job baseJob() {
//        return jobBuilderFactory.get(BASE_JOB + "_" + System.currentTimeMillis())
//                .listener(listener())
//                .start(step01())
//                .next(step02())
//                .build();
//    }
//
//
//    @Bean(LISTENER)
//    public JobListenerAdapter listener() {
//        return new JobListenerAdapter(new JobListener() {
//            @Override
//            public void beforeJob() throws Exception {
//                log.info("job start");
//            }
//
//            @Override
//            public void afterJob() throws Exception {
//                log.info("job end");
//            }
//        });
//    }
//
//    @Bean(STEP_01)
//    public Step step01() {
//        StepBuilder stepBuilder = stepBuilderFactory.get(STEP_01);
//        return stepBuilder.tasklet(tasklet01()).build();
//    }
//
//    @Bean(STEP_02)
//    public Step step02() {
//        return stepBuilderFactory.get(STEP_02).tasklet(tasklet02()).build();
//    }
//
//    @Bean(TASKLET_01)
//    public Tasklet tasklet01() {
//        return (contribution, chunkContext) -> {
//            log.info(TASKLET_01);
//            chunkContext.setAttribute("aaa","aaa");
//            return RepeatStatus.FINISHED;
//        };
//    }
//
//    @Bean(TASKLET_02)
//    public Tasklet tasklet02() {
//        return (contribution, chunkContext) -> {
//            log.info(TASKLET_02);
//            Object aaa = chunkContext.getAttribute("aaa");
//            System.out.println("aaa = " + aaa);
//            return RepeatStatus.FINISHED;
//        };
//    }
//}