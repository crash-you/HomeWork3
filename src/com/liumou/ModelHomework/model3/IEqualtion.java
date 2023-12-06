package com.liumou.ModelHomework.model3;

// 定义算式接口IEqualtion
public interface  IEqualtion {
    // 获取操作数1
    short getOperand1();
    // 获取操作数2
    short getOperand2();
    // 获取操作符
    char getOperator();
    // 设置操作数1
    void setOperand1(short operand1);
    // 设置操作数2
    void setOperand2(short operand2);
    // 设置操作符
    void setOperator(char operator);
    // 计算算式的结果
    int calculate();
}
