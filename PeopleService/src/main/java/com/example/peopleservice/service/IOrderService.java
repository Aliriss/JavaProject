package com.example.peopleservice.service;


import com.example.peopleservice.pojo.Orders;

import java.util.List;

/**
 * @classDesc: 功能描述：order service interface
 * @author: all
 * @date: 2022/7/28 10:06
 * @copyright: 北京众阳
 */
public interface IOrderService {
    List<Orders> findAll();
}
