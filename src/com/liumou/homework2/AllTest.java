package com.liumou.homework2.Small1;

import org.junit.jupiter.api.Test;

public class BookTest {

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

}
