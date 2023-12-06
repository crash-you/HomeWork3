package com.liumou.ModelHomework.model4;

import java.util.Iterator;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {

        // 创建Scanner对象，用于接收用户输入
        Scanner sc = new Scanner(System.in);
        System.out.print("请输入要生成的算式数:");
        int n = sc.nextInt(); // 从控制台读取用户输入的整数n，表示要生成的算式数量

        // 创建EquationCheckerOfRange对象，定义操作数范围为0到100
        EquationCheckerOfRange ec = new EquationCheckerOfRange(0, 100);

        // 创建EquationCollection对象用于存储生成的算式
        EquationCollection eq = new EquationCollection();

        // 生成n个算式，并添加到EquationCollection对象中
        eq.generate(n, ec);

        // 获取EquationCollection的迭代器，遍历并输出算式
        Iterator<IEqualtion> iterator = eq.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next()); // 输出每个算式到控制台
        }

        // 关闭Scanner
        sc.close();
    }
}
