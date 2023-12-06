package com.liumou.ModelHomework.Model2;

/**
 * Printer 类用于打印 Exercise 中的算式及其计算结果，并按照指定的列数进行排列打印。
 */
public class Printer {

    /**
     * 打印 Exercise 中的算式及其计算结果，并按照指定的列数进行排列打印
     *
     * @param exercise 要打印的 Exercise 对象，包含算式集合
     * @param columns  指定的列数，每行打印的算式数量
     */
    public static void printExercise(Exercise exercise, int columns) {
        int count = 0;
        for (Equation equation : exercise.getHashSet()) {
            // 打印算式和计算结果
            System.out.printf(equation.getS1() + String.valueOf(equation.getOperator()) + equation.getS2() + " = ");
            System.out.printf(String.valueOf(equation.calculate()) + " ; ");
            count++;
            // 每达到指定列数就换行
            if (count % columns == 0) {
                System.out.println();
            }
        }
    }
}
