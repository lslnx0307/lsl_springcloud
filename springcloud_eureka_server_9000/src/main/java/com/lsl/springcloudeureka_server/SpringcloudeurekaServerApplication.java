package com.lsl.springcloudeureka_server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class SpringcloudeurekaServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringcloudeurekaServerApplication.class, args);
    }

}
