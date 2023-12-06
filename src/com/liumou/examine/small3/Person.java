package com.liumou.examine.small3;

public class Person {

    // 声明name与age两个属性
    protected String name;
    protected int age;

    // 构造方法
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // talk方法返回姓名和年龄信息
    public String talk() {
        return "我是：" + name + "，今年：" + age + "岁";
    }

}
