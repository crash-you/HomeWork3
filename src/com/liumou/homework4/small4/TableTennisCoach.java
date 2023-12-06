package com.liumou.homework4.small4;

public class TableTennisCoach extends olympicsPerson{
    public TableTennisCoach(String name, int age) {
        super(name, age);
    }

    @Override
    public void playSports() {
        System.out.println(getName() + "正在教乒乓球");
    }
}
