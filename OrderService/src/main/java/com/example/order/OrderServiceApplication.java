package com.example.order;

import com.example.feignapi.DefaultFeignConf;
import com.example.feignapi.client.PeopleClient;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @author all
 */
@SpringBootApplication
@EnableFeignClients(clients = {PeopleClient.class}, defaultConfiguration = DefaultFeignConf.class)

public class OrderServiceApplication {
    public static void main(String[] args) {
        SpringApplication.run(OrderServiceApplication.class, args);
    }

}
