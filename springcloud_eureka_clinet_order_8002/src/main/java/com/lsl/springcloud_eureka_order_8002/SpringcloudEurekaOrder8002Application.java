package com.lsl.springcloud_eureka_order_8002;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class SpringcloudEurekaOrder8002Application {

    public static void main(String[] args) {
        SpringApplication.run(SpringcloudEurekaOrder8002Application.class,args);
    }

}
