package com.example.people.service.impl;

import com.example.feignapi.pojo.Orders;
import com.example.people.service.IOrderService;
import com.example.people.mapper.OrderMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
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
    @Override
    public List<Orders> findAll() {
        return orderMapper.list();
    }
}
