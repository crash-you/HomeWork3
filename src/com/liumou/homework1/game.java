package com.liumou;

import java.util.Scanner;

public class game {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberToGuess = (int) (Math.random() * 100) + 1; // 生成1到100之间的随机整数
        int numberOfTries = 0;                              // 记录猜数的次数

        System.out.println("欢迎来到猜数字游戏！");

        while (true) {
            System.out.print("请猜一个1到100之间的整数：");
            int userGuess = scanner.nextInt();
            numberOfTries++;                                // 每次猜数都增加猜数的次数
            if (userGuess > numberToGuess) {
                System.out.println("大了！");
            } else if (userGuess < numberToGuess) {
                System.out.println("小了！");
            } else {
                System.out.println("恭喜你猜对了！答案是 " + numberToGuess);
                System.out.println("你一共猜了 " + numberOfTries + " 次。");
                break;                                          // 用户猜对了，结束游戏
            }
        }
        scanner.close();                                            // 关闭输入流
    }
}
