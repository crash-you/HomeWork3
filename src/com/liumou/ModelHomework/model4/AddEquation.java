package com.liumou.ModelHomework.model4;

public class AddEquation extends AbstractEquation{
    public AddEquation(short operand1, short operand2, char operator) {
        super(operand1, operand2, '+');
    }

    public static class AddEquationBuilder{
        private short operand1;
        private short operand2;

        public AddEquationBuilder build() {
            return new AddEquationBuilder(operand1,operand2);
        }

        public AddEquationBuilder(short operand1, short operand2) {
            this.operand1 = operand1;
            this.operand2 = operand2;
        }

        public AddEquationBuilder setAddEquationBuilderOperand1(short operand1) {
            this.operand1 = operand1;
            return this;
        }

        public AddEquationBuilder setAddEquationBuilderOperand2(short operand2) {
            this.operand2 = operand2;
            return this;
        }
    }

    @Override
    public int calculate() {
        return getOperand1() + getOperand2();
    }
}
