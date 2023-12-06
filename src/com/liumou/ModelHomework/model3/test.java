package com.liumou.ModelHomework.model3;

import java.util.List;
import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        // 读入数目n
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入要产生的算式数目：");
        int n = scanner.nextInt();
        // 产生n个加减法算式，操作数介于0到50之间
        List<IEqualtion> list = EquationGenerator.generate(n, new EquationCheckerOfRange(0, 100));
        // 遍历算式，并在终端输出算式
        for (IEqualtion eq : list) {
            System.out.print(eq);
            System.out.println(eq.calculate());
        }
    }
}

