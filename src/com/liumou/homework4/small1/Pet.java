package com.liumou.homework4.small1;

// 宠物抽象类，表示所有宠物的基类
public abstract class Pet {

    private String name;

    public String getName() {
        return name;
    }

    public Pet(String name) {
        this.name = name;
    }

    // 抽象方法，用于描述宠物的吃的行为
    public abstract void eat();
}
