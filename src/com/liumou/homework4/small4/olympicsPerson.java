package com.liumou.homework4.small4;

// 抽象类，表示运动员和教练的基类
public abstract class olympicsPerson {

    private String name;
    private int age;

    public olympicsPerson(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    // 抽象方法，描述打运动
    public abstract void playSports();

}
