
package com.example.people.nacosdiscovery;

import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @author <a href="mailto:chenxilzx1@gmail.com">theonefx</a>
 */
@EnableDiscoveryClient
@Configuration
public class NacosDiscoveryConfiguration {
    // @LoadBalanced
    // @Bean
    // public RestTemplate restTemplate(){
    //     return new RestTemplate();
    // }
}
