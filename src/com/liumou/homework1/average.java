package com.liumou.homework1;

import java.util.Scanner;

public class average {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int sum = 0;       // 用于计算总和
        int count = 0;     // 用于计算输入数字的个数
        // 循环读取正整数，直到输入-1为止
        while (true) {
            System.out.print("请输入一个正整数（输入-1结束）：");
            int num = scanner.nextInt();
            if (num == -1) {
                break;  // 输入-1表示结束输入
            }
            // 检查输入是否为正整数
            if (num <= 0) {
                System.out.println("请输入一个正整数！");
                continue;  // 跳过非正整数
            }
            sum += num;
            count++;
        }
        // 计算平均值
        double average = (double) sum / count;
        // 输出结果
        System.out.println("输入数字的个数为：" + count);
        System.out.println("输入数字的平均值为：" + average);
        // 关闭输入流
        scanner.close();
    }
}
