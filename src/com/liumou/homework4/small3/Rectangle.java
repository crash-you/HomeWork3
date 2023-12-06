package com.liumou.homework4.small3;

// 子类Rectangle
public class Rectangle extends Shape {

    private double length;
    private double width;

    @Override
    public double getArea() {
        return length * width;
    }

    // 构造方法，初始化长和宽
    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }


}
