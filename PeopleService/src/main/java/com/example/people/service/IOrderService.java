package com.example.people.service;


import com.example.feignapi.pojo.Orders;

import java.util.List;

/**
 * @classDesc: 功能描述：order service interface
 * @author: all
 * @date: 2022/7/28 10:06
 * @copyright: 北京众阳
 */
// @FeignClient(value = "test-people-service-order")
public interface IOrderService {
    List<Orders> findAll();
}
