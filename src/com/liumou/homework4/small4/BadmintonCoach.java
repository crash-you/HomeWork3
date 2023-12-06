package com.liumou.homework4.small4;

public class BadmintonCoach extends olympicsPerson
        implements LanguageLearner{

    public BadmintonCoach(String name, int age) {
        super(name, age);
    }

    @Override
    public void playSports() {
        System.out.println(getName() + "正在教羽毛球");
    }

    @Override
    public void learnLanguage() {
        System.out.println(getName() + "正在学习英语");
    }
}
