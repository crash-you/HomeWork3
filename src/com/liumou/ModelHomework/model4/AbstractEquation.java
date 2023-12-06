package com.liumou.ModelHomework.model4;

public abstract class AbstractEquation implements IEqualtion{

    // 定义操作数1
    private short operand1;
    // 定义操作数2
    private short operand2;
    // 定义操作符
    private char operator;

    // 定义三个参数的构造方法
    public AbstractEquation(short operand1, short operand2, char operator) {
        this.operand1 = operand1;
        this.operand2 = operand2;
        this.operator = operator;
    }

    // 实现getter方法
    @Override
    public short getOperand1() {
        return operand1;
    }

    @Override
    public short getOperand2() {
        return operand2;
    }

    @Override
    public char getOperator() {
        return operator;
    }

    // 实现setter方法
    @Override
    public void setOperand1(short operand1) {
        this.operand1 = operand1;
    }

    @Override
    public void setOperand2(short operand2) {
        this.operand2 = operand2;
    }

    @Override
    public void setOperator(char operator) {
        this.operator = operator;
    }

    // 覆写equals方法，判断两个算式是否相等
    @Override
    public boolean equals(Object obj) {
        if (obj instanceof com.liumou.ModelHomework.model3.IEqualtion) {
            com.liumou.ModelHomework.model3.IEqualtion eq = (com.liumou.ModelHomework.model3.IEqualtion) obj;
            return this.operand1 == eq.getOperand1() && this.operand2 == eq.getOperand2() && this.operator == eq.getOperator();
        }
        return false;
    }

    // 覆写hashCode方法，根据算式的内容生成哈希值
    @Override
    public int hashCode() {
        return 3 * (3 * operand1 + operand2) + operator;
    }

    // 覆写toString方法，返回算式的字符串表示
    @Override
    public String toString() {
        return operand1 + " " + operator + " " + operand2 + " = ";
    }

}
