package com.liumou.ModelHomework.model3;

import java.util.*;

public class EquationGenerator {

    private static Random random = new Random();

    static List<IEqualtion> generate(int n, EquationChecker checker) {
        // 定义算式列表
        List<IEqualtion> list = new ArrayList<>();
        // 定义算式集合，用于去重
        Set<IEqualtion> set = new HashSet<>();
        // 循环产生n个算式
        while (list.size() < n) {
            // 随机产生操作数1
            short op1 = (short) random.nextInt(101);
            // 随机产生操作数2
            short op2 = (short) random.nextInt(101);
            // 随机产生加减法算式
            //  random.nextBoolean()返回下一个伪随机数，从该随机数生成器的序列中均匀分布 boolean值。
            IEqualtion eq = random.nextBoolean() ? new AddEquation(op1, op2) : new SubEquation(op1, op2);
            // 检查算式是否满足约束条件
            if (checker.check(eq)) {
                // 检查算式是否重复
                if (set.add(eq)) {
                    // 将算式添加到列表中
                    list.add(eq);
                }
            }
        }
        // 返回算式列表
        return list;
    }
}

