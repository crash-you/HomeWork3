package com.liumou.ModelHomework.Model1;

import java.util.Random;

public class small {
    public static void main(String[] args) {
        displayProgramInfo();
        generateAndDisplayExpressions();
    }

    // 程序功能提示
    private static void displayProgramInfo() {
        System.out.println("欢迎使用算术式生成程序！");
        System.out.println("约束条件：操作数不为负且不超过100，减法结果不为负，加法结果不超过100。");
        System.out.println("===============================================");
    }

    // 产生10个随机算术式并显示
    private static void generateAndDisplayExpressions() {
        System.out.println("生成的算术式如下：");
        for (int i = 0; i < 10; i++) {
            int operand1 = generateRandomOperand();
            int operand2 = generateRandomOperand();
            char operator = generateRandomOperator();

            int result = calculateResult(operand1, operand2, operator);

            System.out.println(operand1 + " " + operator + " " + operand2 + " = " + result);
        }
    }

    // 生成随机操作数（不为负且不超过100）
    private static int generateRandomOperand() {
        Random random = new Random();
        return random.nextInt(101); // 生成0到100之间的随机数
    }

    // 生成随机运算符（+或-）
    private static char generateRandomOperator() {
        Random random = new Random();
        return random.nextBoolean() ? '+' : '-'; // 随机选择+或-
    }

    // 计算算术式的结果
    private static int calculateResult(int operand1, int operand2, char operator) {
        switch (operator) {
            case '+' -> {
                int sum = operand1 + operand2;
                if (sum >= 100){
                    System.out.print("加法和超出100，自动转化为100:");
                }
                return Math.min(operand1 + operand2, 100);
            }
            case '-' -> {
                int minus = operand1 - operand2;
                if (minus <= 0){
                    System.out.print("减后小于0，自动转化为0:");
                }
                // 约束减法结果不为负
                return Math.max(operand1 - operand2, 0);
            }
            default -> throw new IllegalArgumentException("无效的运算符：" + operator);
        }
    }
}
