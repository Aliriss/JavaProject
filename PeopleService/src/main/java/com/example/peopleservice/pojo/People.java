package com.example.peopleservice.pojo;

import lombok.Data;

/**
 * @classDesc: 功能描述：people class
 * @author: all
 * @date: 2022/7/25 17:00
 * @copyright: 北京众阳
 */
@Data
public class People {

    private Integer id;
    private String name;
    private Integer gender;
    private Integer age;

    public People() {
    }



}
