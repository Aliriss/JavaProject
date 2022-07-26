package com.example.peopleservice.nacosdiscovery;

import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @classDesc: 功能描述：
 * @author: all
 * @date: 2022/7/26 11:23
 * @copyright: 北京众阳
 */
@EnableDiscoveryClient
@Configuration
public class NacosDiscovery {
    @LoadBalanced
    @Bean
    public RestTemplate restTemplate(){
        return new RestTemplate();
    }


}
