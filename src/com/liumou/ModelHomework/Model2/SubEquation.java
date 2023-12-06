package com.liumou.ModelHomework.Model2;

/**
 * SubEquation 类是 Equation 的子类，用于表示减法运算的算式。
 */
public class SubEquation extends Equation {

    /**
     * 无参构造函数
     */
    public SubEquation() {
    }

    /**
     * 带参数的构造函数，用于初始化 SubEquation 对象
     *
     * @param s1       第一个操作数
     * @param s2       第二个操作数
     * @param Operator 操作符
     */
    public SubEquation(short s1, short s2, char Operator) {
        super(s1, s2, Operator);
    }

    /**
     * 计算并返回减法运算的结果
     *
     * @return 减法运算的结果
     */
    @Override
    int calculate() {
        return getS1() - getS2();
    }
}
