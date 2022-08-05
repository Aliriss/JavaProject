package com.example.order.service.impl;

import com.example.feignapi.client.PeopleClient;
import com.example.feignapi.pojo.OrderPeople;
import com.example.feignapi.pojo.Orders;
import com.example.order.mapper.OrderMapper;
import com.example.order.service.IOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

/**
 * @classDesc: 功能描述：order service implement
 * @author: all
 * @date: 2022/7/28 10:08
 * @copyright: 北京众阳
 */
@Service
public class OrderServiceImpl implements IOrderService {

    @Resource
    private OrderMapper orderMapper;
    @Autowired
    private PeopleClient peopleClient;
    @Override
    public List<OrderPeople> findAll() {
        List<Orders> orders = orderMapper.findAll();
        List<OrderPeople> res = new ArrayList<>();
        for(Orders order:orders){
            res.add(new OrderPeople(order,peopleClient.getById(order.getPeopleId())));
        }

        return res;
    }
}
