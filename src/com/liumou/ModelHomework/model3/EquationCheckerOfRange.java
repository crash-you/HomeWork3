package com.liumou.ModelHomework.model3;

public class EquationCheckerOfRange implements EquationChecker {
    // 定义操作数及结果的最小值
    private int min;
    // 定义操作数及结果的最大值
    private int max;

    EquationCheckerOfRange(int min, int max) {
        this.min = min;
        this.max = max;
    }

    // 实现check方法，限定操作数及结果的范围
    @Override
    public boolean check(IEqualtion equation) {
        // 获取操作数1
        int op1 = equation.getOperand1();
        // 获取操作数2
        int op2 = equation.getOperand2();
        // 获取算式的结果
        int result = equation.calculate();
        // 判断操作数和结果是否在最小值和最大值之间
        return op1 >= min && op1 <= max && op2 >= min && op2 <= max && result >= min && result <= max;
    }
}

