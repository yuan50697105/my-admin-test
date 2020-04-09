package com.example.commons.batch;

import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.batch.core.Job;
import org.springframework.batch.core.Step;
import org.springframework.batch.core.configuration.annotation.JobBuilderFactory;
import org.springframework.batch.core.configuration.annotation.StepBuilderFactory;
import org.springframework.batch.item.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.persistence.EntityManager;

/**
 * @program: admin-demo-gradle
 * @description:
 * @author: yuane
 * @create: 2020-04-04 21:20
 */
@Configuration
public class DbJobConfiguration {
    public static final String DB_STEP_01 = "dbStep01";
    public static final String DB_JOB = "dbJob";
    public static final String DB_STEP_011 = "dbStep01";
    public static final String READ_DB = "readDb";
    public static final String PROCESS_DB = "processDb";
    public static final String WRITE_DB = "writeDb";
    @Autowired
    private RabbitTemplate rabbitTemplate;
    @Autowired
    private JobBuilderFactory jobBuilderFactory;
    @Autowired
    private StepBuilderFactory stepBuilderFactory;
    @Autowired
    private EntityManager entityManager;
    @Autowired
    private AdminUserRepository adminUserRepository;

    @Bean(DB_JOB)
    public Job dbJob() {
        return jobBuilderFactory.get(DB_JOB + "_" + System.currentTimeMillis()).start(dbStep01()).build();
    }

    @Bean(DB_STEP_011)
    public Step dbStep01() {
        return stepBuilderFactory.get(DB_STEP_01).<AdminUser, AdminUser>chunk(10)
                .reader(readDb())
                .processor(processDb())
                .writer(writeDb()).build();
    }

    @Bean(WRITE_DB)
    ItemWriter<AdminUser> writeDb() {
        return items -> {
            items.forEach(object -> System.out.println("object = " + object));
        };

    }

    @Bean(READ_DB)
    ItemReader<AdminUser> readDb() {
        return new ItemReader<AdminUser>() {
            @Override
            public AdminUser read() throws Exception, UnexpectedInputException, ParseException, NonTransientResourceException {
                return adminUserRepository.getOne(1L);
            }
        };
    }

    @Bean(PROCESS_DB)
    public ItemProcessor<AdminUser, AdminUser> processDb() {
        return item -> {
            item.setUsername("aaa");
            return item;
        };
    }


}