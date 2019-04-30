package com.lsl.springcloud_hystrix_command.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @program: lsl_springcloud
 * @description:
 * @author: v-jasperli
 * @create: 2019-04-30 14:09
 **/
@RestController
public class MyController {

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/hello")
    public String hello() {
        LslHystrixCommand lslHystrixCommand = new LslHystrixCommand("orderGroupKey", restTemplate);
        String execute = lslHystrixCommand.execute();
        return execute;
    }
}
