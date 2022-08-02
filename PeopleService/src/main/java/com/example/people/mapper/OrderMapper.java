package com.example.people.mapper;

import com.baomidou.dynamic.datasource.annotation.DS;
import com.example.people.pojo.Orders;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Property;
import org.springframework.core.annotation.Order;

import java.util.List;

/**
 * @classDesc: 功能描述：order mapper
 * @author: all
 * @date: 2022/7/28 10:07
 * @copyright: 北京众阳
 */
@Mapper
public interface OrderMapper {
    /**
     * list order list
     * @return
     */
    @DS("db1")
    List<Orders> list();
}
