package com.liumou.homework3.BookSystem;

public class OrderItem {
    private Book book;
    private int num;

    // 有参构造方法
    public OrderItem(Book book, int num) {
        this.book = book;
        this.num = num;
    }

    public OrderItem() {
    }

    // 获取图书对象
    public Book getBook() {
        return book;
    }

    // 获取订购图书数量
    public int getNum() {
        return num;
    }

    /**
     * 设置
     * @param book
     */
    public void setBook(Book book) {
        this.book = book;
    }

    /**
     * 设置
     * @param num
     */
    public void setNum(int num) {
        this.num = num;
    }

    public String toString() {
        return "OrderItem{book = " + book + ", num = " + num + "}";
    }
}
