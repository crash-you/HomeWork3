package com.liumou.examine.small3;

public class test {

    public static void main(String[] args) {
        Student stu = new Student("刘宏博",20,"华北水利水电大学");
        System.out.println(stu.talk());

        Person emp = new Employee("刘宏博", 20, "腾讯公司");
        System.out.println(emp.talk());
    }

}
