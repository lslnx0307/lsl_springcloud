package com.lsl.springcloud_eureka_client_user_8001;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableDiscoveryClient
public class SpringcloudEurekaClientUser8001Application {

    public static void main(String[] args) {
        SpringApplication.run(SpringcloudEurekaClientUser8001Application.class, args);
    }

}
