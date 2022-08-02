package com.example.people.service;

import com.example.people.pojo.People;

import java.util.List;

public interface IPeopleService {
    List<People> findAll();

    People getById(Integer id);
}
