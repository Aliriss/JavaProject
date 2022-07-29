package com.example.peopleservice.mapper;

import com.example.peopleservice.pojo.People;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @classDesc: 功能描述：people mapper
 * @author: all
 * @date: 2022/7/25 17:01
 * @copyright: 北京众阳
 */
@Mapper
public interface PeopleMapper {
    @Select("Select * from people")
    public List<People> list();

    @Select("select * from people where id=${id}")
    People getById(Integer id);
}
