package com.liumou.homework4.small4;

// 具体类，羽毛球运动员
public class BadmintonPlayer extends olympicsPerson
        implements LanguageLearner {

    public BadmintonPlayer(String name, int age) {
        super(name, age);
    }

    @Override
    public void learnLanguage() {
        System.out.println(getName() + "正在学习英语");
    }

    @Override
    public void playSports() {
        System.out.println(getName() + "正在打羽毛球");
    }
}
