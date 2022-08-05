package com.example.people;

import com.example.feignapi.DefaultFeignConf;
import lombok.extern.slf4j.Slf4j;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * @author all
 */
@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
// @SpringBootApplication
@EnableAspectJAutoProxy
@Slf4j
@MapperScan("com.example.people.mapper")
@EnableFeignClients(value = "com.example.people", defaultConfiguration = DefaultFeignConf.class)
public class PeopleServiceApplication {
    public static void main(String[] args) {
        SpringApplication.run(PeopleServiceApplication.class, args);
    }
}
