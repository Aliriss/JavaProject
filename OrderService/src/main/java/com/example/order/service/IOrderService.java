package com.example.order.service;

import com.example.feignapi.pojo.OrderPeople;

import java.util.List;

/**
 * @classDesc: 功能描述：order service interface
 * @author: all
 * @date: 2022/7/28 10:06
 * @copyright: 北京众阳
 */
public interface IOrderService {
    List<OrderPeople> findAll();
}
