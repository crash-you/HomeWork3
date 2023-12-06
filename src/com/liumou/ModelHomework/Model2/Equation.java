package com.liumou.ModelHomework.Model2;

import java.util.Objects;

/**
 * 抽象类 Equation 表示一个具有两个 short 类型操作数和一个 char 类型操作符的算式。
 */
public abstract class Equation {

    private short s1; // 第一个操作数
    private short s2; // 第二个操作数
    private char operator; // 操作符

    /**
     * 无参构造函数
     */
    public Equation() {
    }

    /**
     * 带参数的构造函数，用于初始化 Equation 对象
     *
     * @param s1       第一个操作数
     * @param s2       第二个操作数
     * @param Operator 操作符
     */
    public Equation(short s1, short s2, char Operator) {
        this.s1 = s1;
        this.s2 = s2;
        this.operator = Operator;
    }

    /**
     * 判断两个 Equation 对象是否相等
     *
     * @param obj 要比较的对象
     * @return 如果两个对象相等则返回 true，否则返回 false
     */
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Equation equation = (Equation) obj;
        return s1 == equation.s1 && s2 == equation.s2 && operator == equation.operator;
    }

    /**
     * 获取 Equation 对象的哈希码
     *
     * @return 对象的哈希码
     */
    @Override
    public int hashCode() {
        return Objects.hash(s1, s2, operator);
    }

//    abstract void printer();


    /**
     * 获取第一个操作数
     *
     * @return 第一个操作数
     */
    public short getS1() {
        return s1;
    }

    /**
     * 设置第一个操作数
     *
     * @param s1 第一个操作数
     */
    public void setS1(short s1) {
        this.s1 = s1;
    }

    /**
     * 获取第二个操作数
     *
     * @return 第二个操作数
     */
    public short getS2() {
        return s2;
    }

    /**
     * 设置第二个操作数
     *
     * @param s2 第二个操作数
     */
    public void setS2(short s2) {
        this.s2 = s2;
    }

    /**
     * 获取操作符
     *
     * @return 操作符
     */
    public char getOperator() {
        return operator;
    }

    /**
     * 将 Equation 对象转换为字符串表示形式
     *
     * @return Equation 对象的字符串表示形式
     */
    public String toString() {
        return "Equation{s1 = " + s1 + ", s2 = " + s2 + ", Operator = " + operator + "}";
    }

    /**
     * 计算并返回算式的结果（子类必须实现该方法）
     *
     * @return 算式的计算结果
     */
    abstract int calculate();
}
