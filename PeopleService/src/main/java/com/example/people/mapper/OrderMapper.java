package com.example.people.mapper;

import com.example.feignapi.pojo.Orders;
import com.example.people.annotion.RoutingWith;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @classDesc: 功能描述：order mapper
 * @author: all
 * @date: 2022/7/28 10:07
 * @copyright: 北京众阳
 */
@Mapper
@RoutingWith
public interface OrderMapper {
    /**
     * list order list
     * @return
     */
    @RoutingWith()
    List<Orders> list();
}
