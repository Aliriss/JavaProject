package com.example.people.controller;

import com.example.people.pojo.People;
import com.example.people.service.IOrderService;
import com.example.people.pojo.Orders;
import com.example.people.service.IPeopleService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * @classDesc: 功能描述：test controller in db1 and db2
 * @author: all
 * @date: 2022/8/1 13:53
 * @copyright: 北京众阳
 */
@RestController
@RequestMapping("/test")
public class TestController {

    @Resource
    private IPeopleService peopleService;
    @Resource
    private IOrderService orderService;

    @GetMapping("/d1")
    public List<Orders> testD1(){
        return orderService.findAll();
    }

    @GetMapping("/d2")
    public List<People> testD2(){
        return peopleService.findAll();
    }
}
