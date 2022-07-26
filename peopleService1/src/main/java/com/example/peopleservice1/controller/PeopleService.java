package com.example.peopleservice1.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @classDesc: 功能描述：people service
 * @author: all
 * @date: 2022/7/25 16:42
 * @copyright: 北京众阳
 */
@RestController
@RequestMapping("/people1")
public class PeopleService {
    @GetMapping
    public String getIndex(){
        return "People 1";
    }
}
