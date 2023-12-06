package com.liumou.ModelHomework.Model2;

/**
 * AddEquation 类是 Equation 的子类，用于表示加法运算的算式。
 */
public class AddEquation extends Equation {

    /**
     * 带参数的构造函数，用于初始化 AddEquation 对象
     *
     * @param s1       第一个操作数
     * @param s2       第二个操作数
     * @param Operator 操作符
     */
    public AddEquation(short s1, short s2, char Operator) {
        super(s1, s2, Operator);
    }

    /**
     * 无参构造函数
     */
    public AddEquation() {
    }

    /**
     * 计算并返回加法运算的结果
     *
     * @return 加法运算的结果
     */
    @Override
    int calculate() {
        return getS1() + getS2();
    }
}
