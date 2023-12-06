package com.liumou.homework2.Small4;

import com.liumou.homework2.MyException;

public class Number {

    private int n1;
    private int n2;

    public Number() {
    }

    public Number(int n1, int n2) {
        this.n1 = n1;
        this.n2 = n2;
    }

    public int getN1() {
        return n1;
    }

    public void setN1(int n1) {
        this.n1 = n1;
    }

    public int getN2() {
        return n2;
    }

    public void setN2(int n2) {
        this.n2 = n2;
    }

    //加法，返回值为加后结果
    public int addition() {
        return n1 + n2;
    }

    //减法，返回值为减后结果
    public int subtraction() {
        return n1 - n2;
    }

    //乘法，返回值为乘后结果
    public int multiplication() {
        return n1 * n2;
    }

    //除法，返回值为除后结果
    //因为除法可能会有小数部分，所以使用double类型强转，小精度转大精度不丢失信息
    public double division() {
        //需要判断除数是否为0
        if (n2 == 0) {
            try {
                throw new MyException("除数值为0，错误用法！");
            }catch (MyException e){
                System.out.println("捕获到自定义异常" + e.getMessage());
            }
        }
        return (double) n1 / n2;
    }
}

