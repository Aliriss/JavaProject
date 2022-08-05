package com.example.feignapi.client;

import com.example.feignapi.pojo.People;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

/**
 * @classDesc: 功能描述：
 * @author: all
 * @date: 2022/8/5 15:04
 * @copyright: 北京众阳
 */
@FeignClient("people-service")
public interface PeopleClient {
    @GetMapping("/d2")
    List<People> findAll();
    @GetMapping("/people/{id}")
    People getById(@PathVariable("id") Integer id);
}
