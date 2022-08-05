package com.example.people.service;

import com.example.feignapi.pojo.People;

import java.util.List;
// @FeignClient(value = "people-service")
public interface IPeopleService {
    List<People> findAll();

    People getById(Integer id);
}
