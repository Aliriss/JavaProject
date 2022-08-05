package com.example.feignapi.pojo;

import lombok.Data;

/**
 * @classDesc: 功能描述：order and people
 * @author: all
 * @date: 2022/7/28 11:29
 * @copyright: 北京众阳
 */
@Data
public class OrderPeople {
    private Orders order;
    private People people;

    public OrderPeople() {
    }

    public OrderPeople(Orders order, People people) {
        this.order = order;
        this.people = people;
    }


}
