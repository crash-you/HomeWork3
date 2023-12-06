package com.liumou.ModelHomework.model3;

public class SubEquation extends AbstractEquation{

    public SubEquation(short operand1, short operand2) {
        super(operand1, operand2, '-');
    }

    @Override
    public int calculate() {
        return getOperand1() - getOperand2();
    }
}
