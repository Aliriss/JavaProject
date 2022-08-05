package com.example.order.controller;

import com.example.order.service.IOrderService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

/**
 * @classDesc: 功能描述：order controller
 * @author: all
 * @date: 2022/7/28 10:04
 * @copyright: 北京众阳
 */
@RestController
@RequestMapping("/order")
@RefreshScope
public class OrderController {
    // @Resource
    // private RestTemplate restTemplate;
    @Resource
    private IOrderService orderService;

    @Value("${data:no data in order service}")
    private String data;

    @GetMapping
    public Object getAll(){
        // List<Orders> orders = orderService.findAll();
        // if(orders==null || orders.isEmpty()){
        //     return null;
        // }
        // List<OrderPeople> orderPeople = new ArrayList<>();
        // for(Orders order: orders){
        //     People people = restTemplate.getForObject("http://people-service/people/"+order.getPeopleId(), People.class);
        //     orderPeople.add(new OrderPeople(order,people));
        // }
        //
        // return orderPeople;
        return orderService.findAll();
    }

    @GetMapping("/data")
    public String getData(){
        return data;
    }

    // @GetMapping("/data/people")
    // public String getDataFromOrder(){
    //     return restTemplate.getForObject("http://people-service/people/data",String.class);
    // }

}
