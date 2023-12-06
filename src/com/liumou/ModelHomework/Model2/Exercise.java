package com.liumou.ModelHomework.Model2;

import java.util.HashSet;
import java.util.Random;

/**
 * Exercise 类用于生成指定数量的算式，并将其存储在 HashSet 中。
 */
public class Exercise {

    HashSet<Equation> hashSet; // 用于存储算式的 HashSet

    /**
     * 无参构造函数，初始化 HashSet
     */
    public Exercise() {
        this.hashSet = new HashSet<>();
    }

    /**
     * 生成指定数量的算式
     *
     * @param m 要生成的算式数量
     */
    public void generateEquations(int m) {
        Random random = new Random();
        while (hashSet.size() < m) {
            short s1 = (short) random.nextInt(101);
            short s2 = (short) random.nextInt(101);
            char[] operators = {'+', '-'};
            char operator = operators[random.nextInt(2)];

            Equation equation;
            if (operator == '+') {
                equation = new AddEquation(s1, s2, operator);
            } else {
                equation = new SubEquation(s1, s2, operator);
            }
            hashSet.add(equation);
        }
    }

    /**
     * 获取存储算式的 HashSet
     *
     * @return 存储算式的 HashSet
     */
    public HashSet<Equation> getHashSet() {
        return hashSet;
    }
}
