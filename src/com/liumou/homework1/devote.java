package com.liumou.homework1;

import java.util.Scanner;

public class devote {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] votes = new int[10]; // 用于存储每位候选人的得票数

        System.out.println("请输入候选人编号 [0-9]，输入-1表示结束：");
        while (true) {
            int candidate = scanner.nextInt();

            if (candidate == -1) {
                break; // 输入-1表示结束
            }

            if (candidate >= 0 && candidate <= 9) {
                // 候选人编号在合法范围内
                votes[candidate]++;
            } else {
                System.out.println("无效的候选人编号，请重新输入 [0-9]：");
            }
        }
        System.out.println("候选人得票统计：");
        for (int i = 0; i < 10; i++) {
            System.out.println("候选人 " + i + " 得票数：" + votes[i]);
        }
        scanner.close();
    }
}

