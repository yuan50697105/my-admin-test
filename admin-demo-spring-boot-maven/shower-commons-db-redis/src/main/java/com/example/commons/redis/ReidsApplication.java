package com.example.commons.redis;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.redis.connection.RedisConnectionFactory;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.data.redis.listener.RedisMessageListenerContainer;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

/**
 * @program: admin-demo-spring-boot-gradle
 * @description:
 * @author: yuane
 * @create: 2020-04-16 22:16
 */
@SpringBootApplication
public class ReidsApplication {
    public static void main(String[] args) throws IOException {
        SpringApplication.run(ReidsApplication.class, args);
        System.in.read();
    }

    @Bean("commandLineRunner")
    public CommandLineRunner commandLineRunner(StringRedisTemplate stringRedisTemplate) {
        return new CommandLineRunner() {
            @Override
            public void run(String... args) throws Exception {
                stringRedisTemplate.opsForValue().set("Order:aaa", "aaa", 10, TimeUnit.SECONDS);
            }
        };
    }

    @Bean("redisMessageListenerContainer")
    public RedisMessageListenerContainer redisMessageListenerContainer(RedisConnectionFactory redisConnectionFactory) {
        RedisMessageListenerContainer redisMessageListenerContainer = new RedisMessageListenerContainer();
        redisMessageListenerContainer.setConnectionFactory(redisConnectionFactory);
        return redisMessageListenerContainer;
    }
}