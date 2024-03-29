package com.mall.Concurrency.pojo;

import lombok.Data;

import java.util.Date;

/**
 * @Auther: xianzilei
 * @Date: 2019/6/25 18:36
 * @Description: 测试对象
 */
@Data
public class Person {
    String name;
    public volatile int age;
    long id;
    Date birthDay;
}
