package com.example.commons.batch;

import lombok.extern.slf4j.Slf4j;
import org.springframework.batch.core.Job;
import org.springframework.batch.core.JobExecution;
import org.springframework.batch.core.Step;
import org.springframework.batch.core.StepExecution;
import org.springframework.batch.core.configuration.annotation.JobBuilderFactory;
import org.springframework.batch.core.configuration.annotation.StepBuilderFactory;
import org.springframework.batch.core.job.builder.FlowBuilder;
import org.springframework.batch.core.job.flow.Flow;
import org.springframework.batch.core.job.flow.FlowExecutionStatus;
import org.springframework.batch.core.job.flow.JobExecutionDecider;
import org.springframework.batch.repeat.RepeatStatus;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @program: admin-demo-gradle
 * @description:
 * @author: yuane
 * @create: 2020-04-04 15:55
 */
@Configuration
@Slf4j
public class Job2Configuration {
    public static final String JOB_02 = "job_02";
    public static final String JOB_02_STEP_01 = "job_02_step_01";
    @Autowired
    private JobBuilderFactory jobBuilderFactory;
    @Autowired
    private StepBuilderFactory stepBuilderFactory;

    @Bean(JOB_02)
    public Job job02() {
        return jobBuilderFactory.get(JOB_02).start(flow()).build().build();
    }

    public Flow flow() {
        FlowBuilder<Flow> flow_01 = new FlowBuilder<>("flow_01");
        flow_01.start(job02Step01());
        flow_01.from(flowDecider()).on(FlowExecutionStatus.COMPLETED.getName());
        return flow_01.build();
    }

    private JobExecutionDecider flowDecider() {
        return new JobExecutionDecider() {
            @Override
            public FlowExecutionStatus decide(JobExecution jobExecution, StepExecution stepExecution) {
                return FlowExecutionStatus.COMPLETED;
            }
        };
    }

    @Bean(JOB_02_STEP_01)
    public Step job02Step01() {
        return stepBuilderFactory.get(JOB_02_STEP_01).tasklet((contribution, chunkContext) -> {
            chunkContext.setAttribute("abc", "abc");
            log.info("aaaaaaaaaa");
            return RepeatStatus.FINISHED;
        }).build();
    }


}