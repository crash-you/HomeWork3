package com.liumou;

import java.util.Scanner;

public class NumberOfDigits {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = scanner.nextInt();// 读入正整数

        int numDigits = 0;// 计算位数
        int temp = num;

        while (temp > 0) {
            temp = temp / 10;
            numDigits++;
        }
        System.out.println("位数为：" + numDigits);

        scanner.close();

    }

}
