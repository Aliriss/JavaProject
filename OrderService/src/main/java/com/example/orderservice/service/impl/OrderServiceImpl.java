package com.example.orderservice.service.impl;

import com.example.orderservice.mapper.OrderMapper;
import com.example.orderservice.pojo.Orders;
import com.example.orderservice.service.IOrderService;
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
        return orderMapper.findAll();
    }
}
