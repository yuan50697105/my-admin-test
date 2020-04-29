package org.yuan.showercloud.modules.user;

import org.springframework.boot.SpringApplication;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @program: shower-cloud
 * @description:
 * @author: yuane
 * @create: 2020-04-29 20:33
 */
@SpringCloudApplication
@EnableFeignClients
@EnableHystrix
@EnableCircuitBreaker
@EnableEurekaClient
public class ShowerCloudUserProviderApplication {
    public static void main(String[] args) {
        SpringApplication.run(ShowerCloudUserProviderApplication.class,args);
    }
}