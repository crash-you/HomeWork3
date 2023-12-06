package com.liumou.homework4.small2;

public class Line extends Point {

    private double x1;
    private double y1;

    // 构造方法，初始化线段的起始点和终止点坐标
    public Line(double x, double y, double x1, double y1) {
        super(x, y);
        this.x1 = x1;
        this.y1 = y1;
    }

    // 计算线段长度的方法
    public double getLen() {
        double length = Math.sqrt(Math.pow(getX() - x1, 2) + Math.pow(getY() - y1, 2));
        return length;
    }
}
