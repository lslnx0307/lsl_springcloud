package com.lsl.springcloud_ribbon.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @program: lsl_springcloud
 * @description:
 * @author: v-jasperli
 * @create: 2019-04-25 20:17
 **/
@RestController
public class MyController {

    @GetMapping("/home")
    public String home() {
        System.out.println("home_8002");
        return "home_8002";
    }
}
