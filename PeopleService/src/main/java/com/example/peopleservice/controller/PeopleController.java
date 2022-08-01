package com.example.peopleservice.controller;

import com.example.peopleservice.pojo.People;
import com.example.peopleservice.service.IPeopleService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;
import java.util.List;

/**
 * @classDesc: 功能描述：people controller
 * @author: all
 * @date: 2022/7/25 16:23
 * @copyright: 北京众阳
 */
@RestController
@RequestMapping("/people")
// @RefreshScope
public class PeopleController {

    // @Resource
    // private RestTemplate restTemplate;

    @Resource
    private IPeopleService peopleService;

    @Value("${data:no data in people service}")
    private String data;

    @GetMapping
    public List<People> getAll(){
        return peopleService.findAll();
    }
    @GetMapping("/{id}")
    public People getById(@PathVariable Integer id){
        return peopleService.getById(id);
    }

    @GetMapping("/data")
    public String getData(){
        return data;
    }

    // @GetMapping("/data/order")
    // public String getDataFromOrder(){
    //     return restTemplate.getForObject("http://order-service/order/data",String.class);
    // }
}
