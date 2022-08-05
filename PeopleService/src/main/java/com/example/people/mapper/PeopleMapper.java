package com.example.people.mapper;

import com.example.feignapi.pojo.People;
import com.example.people.annotion.RoutingWith;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @classDesc: 功能描述：people mapper
 * @author: all
 * @date: 2022/7/25 17:01
 * @copyright: 北京众阳
 */
@Mapper

public interface PeopleMapper {
    /**
     * 列出所有用户
     * @return
     */
    @RoutingWith("db2")
    List<People> list();

    /**
     * 通过id查找用户
     * @param id
     * @return
     */
    @RoutingWith("db2")
    People getById(Integer id);

}
