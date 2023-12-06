package com.liumou.homework4.small4;

public class TableTennisPlayer extends olympicsPerson{

    public TableTennisPlayer(String name, int age) {
        super(name, age);
    }

    @Override
    public void playSports() {
        System.out.println(getName() + "正在打乒乓球");
    }
}
