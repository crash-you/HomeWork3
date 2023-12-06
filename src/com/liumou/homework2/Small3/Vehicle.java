package com.liumou.homework2.Small3;

public class Vehicle {
    private int speed;
    private int size;

    //空参构造，给予每个变量初值
    public Vehicle() {
        speed = 0;
        size = 0;
    }

    public Vehicle(int speed, int size) {
        this.speed = speed;
        this.size = size;
    }

    /**
     * 获取
     *
     * @return speed
     */
    public int getSpeed() {
        return speed;
    }

    /**
     * 设置
     *
     * @param speed
     */
    public void setSpeed(int speed) {
        this.speed = speed;
    }

    /**
     * 获取
     *
     * @return size
     */
    public int getSize() {
        return size;
    }

    /**
     * 设置
     *
     * @param size
     */
    public void setSize(int size) {
        this.size = size;
    }

    public void inition() {
        System.out.println("Vehicle{speed = " + speed + ", size = " + size + "}");
    }

    //移动
    public void move() {
        System.out.println("交通工具正在移动，速度：" + speed + " km/h，体积：" + size + " m³");
    }

    //加速
    public void speedUp() {
        System.out.println("速度＋10码");
        speed += 10;
        System.out.println("此时速度为：" + speed);
    }

    //减速
    public void speedDown() {
        if (speed <= 5) {
            System.out.println("当前已为最低速度，无法衰减！");
        } else {
            System.out.println("速度-5码");
            speed -= 5;
            System.out.println("当前速度为：" + speed);
        }

    }
}
