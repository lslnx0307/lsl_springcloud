package com.lsl.springcloud_feign_8000.api;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @program: lsl_springcloud
 * @description:
 * @author: v-jasperli
 * @create: 2019-04-29 16:00
 **/
@FeignClient(name = "ms-provider-order")
public interface OrderApi {

    @GetMapping("/home")
    public String home();
}
