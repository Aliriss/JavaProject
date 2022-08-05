package com.example.order.mapper;

import com.example.feignapi.pojo.Orders;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @classDesc: 功能描述：order mapper
 * @author: all
 * @date: 2022/7/28 10:07
 * @copyright: 北京众阳
 */
@Mapper
public interface OrderMapper {
    @Select("select * from orders")
    List<Orders> findAll();
}
