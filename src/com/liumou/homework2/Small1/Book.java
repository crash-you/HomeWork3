package com.liumou.homework2.Small1;

import com.liumou.homework2.MyException;

public class Book {
    //属性
    private String title;
    private int pageNum;

    //无参构造
    public Book() {
    }

    //有参构造
    public Book(String title, int pageNum) {
        this.title = title;
        judge(pageNum);         //判断pageNum是否大于600，抽象为一个方法被公用
//        this.pageNum = pageNum;   //初始时错误，应该直接在judge内部赋值
    }

    //获取
    public String getTitle() {
        return title;
    }

    //设置
    public void setTitle(String title) {
        this.title = title;
    }

    public int getPageNum() {
        return pageNum;
    }

    public void setPageNum(int pageNum) {
        judge(pageNum);
//        this.pageNum = pageNum;
    }

    //判断是否大于600页数
    private void judge(int pageNum) {

        if (pageNum >= 600) {
            //捕获异常
            try {
                throw new MyException("x的值大于600,给予默认值600");
                //MyException为自定义异常类
            } catch (MyException e) {
                System.out.println("捕获到自定义异常" + e.getMessage());
            } finally {
                //如果>600,都会执行
                this.pageNum = 600;
            }
        } else {
            this.pageNum = pageNum;
        }
    }

    //输出页数和名称
    public void info() {
        System.out.println("Book{title = " + title + ", pageNum = " + pageNum + "}");
    }
}
