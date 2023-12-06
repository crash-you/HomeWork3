package com.liumou.ModelHomework.model4;

public class SubEquation extends AbstractEquation{
    public SubEquation(short operand1, short operand2, char operator) {
        super(operand1, operand2, '-');
    }

    public static class SubEquationBuilder{
        private short operand1;
        private short operand2;

        public SubEquationBuilder build(){
            return new SubEquationBuilder(operand1,operand2);
        }

        public SubEquationBuilder(short operand1, short operand2) {
            this.operand1 = operand1;
            this.operand2 = operand2;
        }

        public SubEquationBuilder setSubEquationBuilderOperand1(short operand1) {
            this.operand1 = operand1;
            return this;
        }

        public SubEquationBuilder setSubEquationBuilderOperand2(short operand2) {
            this.operand2 = operand2;
            return this;
        }
    }

    @Override
    public int calculate() {
        return getOperand1() - getOperand2();
    }
}
