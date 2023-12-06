package com.liumou.ModelHomework.model4;

import com.liumou.ModelHomework.model4.IEqualtion;

public class EquationCheckerOfRange implements EquationChecker {

    private int min;
    private int max;

    EquationCheckerOfRange(int min, int max) {
        this.max = max;
        this.min = min;
    }

    @Override
    public boolean check(IEqualtion equation) {
        int o1 = equation.getOperand1();
        int o2 = equation.getOperand2();
        int result = equation.calculate();
        return o1 >= min && o1 <= max && o2 >= min && o2 <= max && result >= min && result <= max;
    }
}
