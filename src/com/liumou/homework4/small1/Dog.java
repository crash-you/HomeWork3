package com.liumou.homework4.small1;

// 狗类，继承自宠物类
public class Dog extends Pet {

    public Dog(String name) {
        super(name);
    }

    // 重写抽象方法，描述狗啃骨头的行为
    @Override
    public void eat() {
        System.out.println(super.getName() + "正在吃骨头");
    }
}
