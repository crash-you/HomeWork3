package com.liumou.ModelHomework.model4;

import java.util.Random;

public class EquationFactory {

    private final Random random = new Random(); // 创建Random对象

    // 根据输入的类型返回相应的算式对象
    IEqualtion getEquation(String type) {
        if (type.equals("add")) {
            // 返回一个加法算式对象，操作数范围为0到100
            return new AddEquation((short) random.nextInt(101), (short) random.nextInt(101), '+');
        } else if (type.equals("sub")) {
            // 返回一个减法算式对象，操作数范围为0到100
            return new SubEquation((short) random.nextInt(101), (short) random.nextInt(101), '-');
        } else {
            // 如果输入类型不是"add"或"sub"，则随机返回加法或减法算式对象
            return getEquationRandom();
        }
    }

    // 随机返回加法或减法算式对象
    IEqualtion getEquationRandom() {
        int randomNum = random.nextInt(2);
        if (randomNum == 0) {
            // 随机返回一个加法算式对象，操作数范围为0到99
            return new AddEquation((short) random.nextInt(100), (short) random.nextInt(100), '+');
        } else {
            // 随机返回一个减法算式对象，操作数范围为0到99
            return new SubEquation((short) random.nextInt(100), (short) random.nextInt(100), '-');
        }
    }
}
