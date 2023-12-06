package com.liumou.homework4.small2;

public class Point {

    private double x;
    private double y;

    public Point() {
    }

    // 带参数的构造方法，用于初始化坐标点
    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public void print() {
        System.out.println("坐标点 (" + x + ", " + y + ")");
    }

    /**
     * 获取
     * @return x
     */
    public double getX() {
        return x;
    }

    /**
     * 设置
     * @param x
     */
    public void setX(double x) {
        this.x = x;
    }

    /**
     * 获取
     * @return y
     */
    public double getY() {
        return y;
    }

    /**
     * 设置
     * @param y
     */
    public void setY(double y) {
        this.y = y;
    }

    public String toString() {
        return "Point{x = " + x + ", y = " + y + "}";
    }
}
