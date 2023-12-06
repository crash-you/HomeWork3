package com.liumou.homework2;

import com.liumou.homework2.Small1.Book;
import com.liumou.homework2.Small2.Account;
import com.liumou.homework2.Small3.Vehicle;
import com.liumou.homework2.Small4.Number;
import com.liumou.homework2.Small5.com.ncwu.mainapp.CStudent;
import com.liumou.homework2.Small5.com.ncwu.userdefinelib.CDate;
import org.junit.jupiter.api.Test;

public class AllTest {

    //测试类
    @Test
    public void test1(){
        //测试有参构造
        Book book = new Book("三体",601);
        book.info();

        //测试无参构造
        Book book1 = new Book();
        book1.setTitle("平凡世界");
        book1.setPageNum(102);
        book1.info();
    }

    //测试类
    @Test
    public void test2(){
        //账户初始信息
        Account account = new Account("理想","20210035",5000.0,1.35);
        System.out.println("账户信息：");
        System.out.println("账户名称："+ account.getName());
        System.out.println("账户ID：" + account.getAccountId());
        System.out.println("当前余额：" + account.getBalance() + "元");
        System.out.println("年利率：" + account.getAnnualInterestRate());

        //测试方法
        account.deposit(500.0);
        account.withdraw(2000.0);
        account.withdraw(4000.0);
    }

    @Test
    public void test3(){
        //实例化Vehicle对象
        Vehicle vehicle = new Vehicle(100,50);
        vehicle.inition();

        //调用方法
        vehicle.move();
        vehicle.speedUp();
        vehicle.speedDown();
    }

    @Test
    public void test4(){
        //测试正常情况
        Number num = new Number(10,5);
        System.out.println("Addition: " + num.addition());
        System.out.println("Subtraction: " + num.subtraction());
        System.out.println("Multiplication: " + num.multiplication());
        System.out.println("Division: " + num.division());

        //测试除数为0情况
        Number num1 = new Number(10,0);
        System.out.println("Addition: " + num1.addition());
        System.out.println("Subtraction: " + num1.subtraction());
        System.out.println("Multiplication: " + num1.multiplication());
        System.out.println("Division: " + num1.division());
    }

    @Test
    public void test5(){
        //创建单个学生对象
        CDate cDate = new CDate(2003,10,8);
        CStudent cStudent =new CStudent("202126308","理想",cDate);

        //创建多个学生对象
        CStudent[] cStudents = new CStudent[3];
        cStudents[0] = new CStudent("1","梦想",new CDate(2003,10,5));
        cStudents[1] = new CStudent("2","想象",new CDate(2002,10,5));
        cStudents[2] = new CStudent("3","实现",new CDate(2001,10,5));

        //最后，使用类名.count而不是对象名是因为count为静态对象，属于整个对象而不是某个对象的实例！！
        // 测试学生类中的变量 count
        int studentCount = CStudent.getCount();
        System.out.println("学生对象的个数: " + studentCount);
    }
}
