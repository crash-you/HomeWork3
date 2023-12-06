package com.liumou.homework1;

import java.util.Scanner;

public class reserve {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("请输入一个数字：");
        int num = scanner.nextInt();

        int reversedNum = reverseNumber(num);

        System.out.println("逆序输出的数字为：" + reversedNum);
        // 关闭输入流
        scanner.close();
    }

    // 逆序一个整数
    public static int reverseNumber(int num) {
        int reversedNum = 0;
        while (num != 0) {
            int digit = num % 10;  // 取出最后一位数字
            reversedNum = reversedNum * 10 + digit;  // 加入逆序数字
            num /= 10;  // 移除最后一位数字
        }
        return reversedNum;
    }
}

