package com.example.peopleservice.service;

import com.example.peopleservice.pojo.People;

import java.util.List;

public interface IPeopleService {
    List<People> findAll();

    People getById(Integer id);
}
