package com.liumou.examine.small3;

public class Employee extends Person{

    // 添加employer属性
    private String employer;

    // 带三个参数的构造方法
    public Employee(String name, int age, String employer) {
        super(name, age);
        this.employer = employer;
    }

    // 复写talk方法
    @Override
    public String talk() {
        // 调用父类的talk方法
        return super.talk() + "，我在" + employer + "工作。";
    }

}
