package com.liumou.examine.small3;

public class Student extends Person {

    // 添加school属性
    private String school;

    // 带三个参数的构造方法
    public Student(String name, int age, String school) {
        super(name, age);
        this.school = school;
    }

    // 复写talk方法
    @Override
    public String talk() {
        // 调用父类的talk方法
        return super.talk() + "，我在" + school + "上学。";
    }
}
