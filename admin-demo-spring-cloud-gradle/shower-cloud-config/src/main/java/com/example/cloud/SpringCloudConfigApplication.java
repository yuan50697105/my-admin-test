package com.example.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * @program: admin-demo-spring-cloud-gradle
 * @description:
 * @author: yuane
 * @create: 2020-04-18 12:56
 */
@EnableConfigServer
@SpringCloudApplication
public class SpringCloudConfigApplication {
    public static void main(String[] args) {
        SpringApplication.run(SpringCloudConfigApplication.class, args);
    }
}