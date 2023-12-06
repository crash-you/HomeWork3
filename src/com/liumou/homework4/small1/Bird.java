package com.liumou.homework4.small1;

// 鸟类，继承自宠物类
public class Bird extends Pet{

    public Bird(String name) {
        super(name);
    }

    // 重写抽象方法，描述鸟吃虫子的行为
    @Override
    public void eat() {
        System.out.println(super.getName() + "正在吃虫子");
    }
}
