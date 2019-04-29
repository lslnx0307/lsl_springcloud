package com.lsl.springcloud_eureka_server_9001;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class SpringcloudEurekaServer9001Application {

    public static void main(String[] args) {
        SpringApplication.run(SpringcloudEurekaServer9001Application.class,args);
    }

}
