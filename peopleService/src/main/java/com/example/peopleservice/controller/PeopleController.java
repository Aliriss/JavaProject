package com.example.peopleservice.controller;

import com.example.peopleservice.pojo.People;
import com.example.peopleservice.service.IPeopleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

/**
 * @classDesc: 功能描述：people controller
 * @author: all
 * @date: 2022/7/25 16:23
 * @copyright: 北京众阳
 */
@RestController
@RequestMapping("/people")
@RefreshScope
public class PeopleController {

    @Resource
    private RestTemplate restTemplate;

    @Resource
    private IPeopleService peopleService;

    // @Value("${people}")
    // private People people;

    @Value("${hello:hello in controller}")
    private String hello;

    @GetMapping
    public List<People> getIndex() {
        return peopleService.findAll();
    }
    @GetMapping("/getyml")
    public String getYml(){
        return hello;
    }

    @GetMapping("/get")
    public String getPeoples() {
        // return hello;
        return restTemplate.getForObject("http://people-server-1/people1",String.class)+"In people service 0";

    }
}
