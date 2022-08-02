package com.example.people.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.annotation.sql.DataSourceDefinition;

/**
 * @classDesc: 功能描述：people class
 * @author: all
 * @date: 2022/7/25 17:00
 * @copyright: 北京众阳
 */
@Data
// @NoArgsConstructor
// @AllArgsConstructor
public class People {

    private Integer id;
    private String name;
    private String gender;
    private Integer age;

}
