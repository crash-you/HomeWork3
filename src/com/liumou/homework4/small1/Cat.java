package com.liumou.homework4.small1;

// 猫类，继承自宠物类
public class Cat extends Pet {

    public Cat(String name) {
        super(name);
    }

    // 重写抽象方法，描述猫吃鱼的行为
    @Override
    public void eat() {
        System.out.println(super.getName() + "正在吃鱼");
    }
}
