package com.lsl.springcloud_eureka_client_user_8001.common;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class MainConfig {

    /**
     * 注意配置负载均衡的时候一定要加@loadbalanced 否则则会抛出java.net.UnknownHostException
     * @loadbalanced 轮询
     * @return
     */
    @Bean
    @LoadBalanced
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }

    @Bean
    public IRule lslRule() {
        return new RandomRule();
    }
}
