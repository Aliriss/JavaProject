package com.example.people.service.impl;

import com.example.feignapi.pojo.People;
import com.example.people.mapper.PeopleMapper;
import com.example.people.service.IPeopleService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @classDesc: 功能描述：people service
 * @author: all
 * @date: 2022/7/25 17:03
 * @copyright: 北京众阳
 */
@Service
@Slf4j
public class PeopleService implements IPeopleService {
    @Resource
    private PeopleMapper peopleMapper;
    @Override
    public List<People> findAll() {
        // List<People> peoples = new ArrayList<>();
        // peoples.add(new People(1,"zhangsan"));
        // return peoples;

        return peopleMapper.list();
    }

    @Override
    public People getById(Integer id) {
        return peopleMapper.getById(id);
    }
}
