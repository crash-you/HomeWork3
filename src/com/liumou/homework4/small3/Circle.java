package com.liumou.homework4.small3;

public class Circle extends Shape {

    private double radius;

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    // 构造方法，初始化半径
    public Circle(double radius) {
        this.radius = radius;
    }
}
