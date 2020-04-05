package com.example.commons.quartz.batch;


import org.quartz.*;
import org.springframework.batch.core.JobExecution;
import org.springframework.batch.core.JobParameters;
import org.springframework.batch.core.configuration.JobLocator;
import org.springframework.batch.core.launch.JobLauncher;
import org.springframework.scheduling.quartz.QuartzJobBean;
import org.springframework.stereotype.Component;

/**
 * @program: admin-demo-gradle
 * @description:
 * @author: yuane
 * @create: 2020-04-05 18:24
 */
@DisallowConcurrentExecution
@Component
public class QuartzJobLauncher extends QuartzJobBean {

    @Override
    protected void executeInternal(JobExecutionContext context) throws JobExecutionException {
        /*方式二*/
        JobDetail jobDetail = context.getJobDetail();
        JobDataMap jobDataMap = jobDetail.getJobDataMap();
        String jobName = jobDataMap.getString("jobName");
        JobLauncher jobLauncher = (JobLauncher) jobDataMap.get("jobLauncher");
        JobLocator jobLocator = (JobLocator) jobDataMap.get("jobLocator");
        System.out.println("jobName : " + jobName);
        System.out.println("jobLauncher : " + jobLauncher);
        System.out.println("jobLocator : " + jobLocator);
        JobKey key = context.getJobDetail().getKey();
        System.out.println(key.getName() + " : " + key.getGroup());

        try {
            org.springframework.batch.core.Job job = jobLocator.getJob(jobName);
            /*启动spring batch的job*/
            JobExecution jobExecution = jobLauncher.run(job, new JobParameters());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}