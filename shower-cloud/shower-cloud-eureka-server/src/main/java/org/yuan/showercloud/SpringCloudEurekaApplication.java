package org.yuan.showercloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;

/**
 * @program: shower-cloud
 * @description:
 * @author: yuane
 * @create: 2020-04-25 19:27
 */
@EnableEurekaServer
@EnableEurekaClient
@EnableDiscoveryClient
@EnableHystrix
@SpringBootApplication
public class SpringCloudEurekaApplication {
    public static void main(String[] args) {
        SpringApplication.run(SpringCloudEurekaApplication.class, args);
    }
}