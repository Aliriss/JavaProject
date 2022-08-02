package com.example.people.mapper;

import com.baomidou.dynamic.datasource.annotation.DS;
import com.example.people.pojo.People;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @classDesc: 功能描述：people mapper
 * @author: all
 * @date: 2022/7/25 17:01
 * @copyright: 北京众阳
 */
// @Mapper
public interface PeopleMapper {
    /**
     * 列出所有用户
     * @return
     */
    @DS("db2")
    // @Select("Select * from people")
    List<People> list();
    @DS("db2")
    // @Select("select * from people where id=${id}")
    People getById(Integer id);

}
