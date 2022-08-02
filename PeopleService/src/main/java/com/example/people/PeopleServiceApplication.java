package com.example.people;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

/**
 * @author all
 */
// @SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
@SpringBootApplication
@MapperScan("com.example.people.mapper")
public class PeopleServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(PeopleServiceApplication.class, args);
    }

}
