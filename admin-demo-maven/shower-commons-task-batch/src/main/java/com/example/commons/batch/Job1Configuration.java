package com.example.commons.batch;

import cn.hutool.core.util.IdUtil;
import cn.hutool.json.JSONUtil;
import lombok.extern.slf4j.Slf4j;
import org.springframework.batch.core.Job;
import org.springframework.batch.core.JobExecution;
import org.springframework.batch.core.JobExecutionListener;
import org.springframework.batch.core.Step;
import org.springframework.batch.core.configuration.annotation.JobBuilderFactory;
import org.springframework.batch.core.configuration.annotation.StepBuilderFactory;
import org.springframework.batch.core.launch.support.RunIdIncrementer;
import org.springframework.batch.core.step.builder.SimpleStepBuilder;
import org.springframework.batch.core.step.builder.StepBuilder;
import org.springframework.batch.repeat.RepeatStatus;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.batch.api.chunk.listener.ItemReadListener;
import java.util.Date;

/**
 * @program: admin-demo-gradle
 * @description:
 * @author: yuane
 * @create: 2020-04-04 15:56
 */
@Configuration
@Slf4j
public class Job1Configuration {
    public static final String JOB_01 = "job_01";
    public static final String STEP_01 = "step_01";
    public static final String STEP_02 = "step_02";
    public static final String JOB_LISTENER = "jobListener";
    public static final String ITEM_READER = "itemReader";
    public static final String ITEM_PROCESSOR = "itemProcessor";
    @Autowired
    private JobBuilderFactory jobBuilderFactory;
    @Autowired
    private StepBuilderFactory stepBuilderFactory;

    @Bean(JOB_01)
    public Job job01() {
        return jobBuilderFactory.get(JOB_01 + "_" + IdUtil.getSnowflake(1, 1).nextId()).incrementer(new RunIdIncrementer()).listener(jobListener()).start(step01()).next(step02()).build();
    }

    public Step dataStep() {
        StepBuilderFactory factory = this.stepBuilderFactory;
        StepBuilder dataStep = factory.get("dataStep");
        SimpleStepBuilder<Object, Object> chunk = dataStep.chunk(10);
        chunk.listener(new ItemReadListener() {
            @Override
            public void beforeRead() throws Exception {

            }

            @Override
            public void afterRead(Object item) throws Exception {

            }

            @Override
            public void onReadError(Exception ex) throws Exception {
                log.info(ex.getLocalizedMessage());
            }
        });
        return chunk.build();

    }

    //
//
    @Bean(JOB_LISTENER)
    public JobExecutionListener jobListener() {
        return new JobExecutionListener() {
            @Override
            public void beforeJob(JobExecution jobExecution) {
                Date createTime = jobExecution.getCreateTime();
                log.info(createTime.toString());
            }

            @Override
            public void afterJob(JobExecution jobExecution) {
                log.info(jobExecution.getEndTime().toString());
            }
        };
    }

    @Bean(STEP_01)
    public Step step01() {
        return stepBuilderFactory.get(STEP_01).tasklet((contribution, chunkContext) -> {
            log.info("Hello Spring batch");
            log.info("Step 01");
            chunkContext.setAttribute("aaaa", "aaa");
            return RepeatStatus.FINISHED;
        }).build();
    }

    @Bean(STEP_02)
    public Step step02() {
        return stepBuilderFactory.get(STEP_02).tasklet((contribution, chunkContext) -> {
            log.info("Step 02");
            log.info(JSONUtil.toJsonPrettyStr(chunkContext.getStepContext().getJobParameters()));
            return RepeatStatus.FINISHED;
        }).build();
    }

}