package com.example.commons.batch;

import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.batch.core.Job;
import org.springframework.batch.core.Step;
import org.springframework.batch.core.configuration.annotation.JobBuilderFactory;
import org.springframework.batch.core.configuration.annotation.StepBuilderFactory;
import org.springframework.batch.item.ItemProcessor;
import org.springframework.batch.item.ItemReader;
import org.springframework.batch.item.ItemWriter;
import org.springframework.batch.item.amqp.AmqpItemReader;
import org.springframework.batch.item.amqp.AmqpItemWriter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @program: admin-demo-gradle
 * @description:
 * @author: yuane
 * @create: 2020-04-04 21:20
 */
@Configuration
public class AmqpJobConfiguration {
    @Autowired
    private RabbitTemplate rabbitTemplate;
    @Autowired
    private JobBuilderFactory jobBuilderFactory;
    @Autowired
    private StepBuilderFactory stepBuilderFactory;

    @Bean
    public Job job() {
        return jobBuilderFactory.get("job").start(step()).build();
    }

    @Bean
    public ItemReader<User> itemReader() {
        AmqpItemReader<User> itemReader = new AmqpItemReader<>(rabbitTemplate);
        return itemReader;
    }

    public ItemWriter<User> itemWriter() {
        AmqpItemWriter<User> itemWriter = new AmqpItemWriter<>(rabbitTemplate);
        return itemWriter;
    }

    @Bean
    public ItemProcessor<User, User> itemProcessor() {
        return item -> item;
    }

    public Step step() {
        return stepBuilderFactory.get("aaa").<User,User>chunk(10).reader(itemReader())
                .processor(itemProcessor())
                .writer(itemWriter()).build();
    }
}