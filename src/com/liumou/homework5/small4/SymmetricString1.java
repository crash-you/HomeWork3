package com.liumou.homework5.small4;

import java.util.Scanner;

public class SymmetricString1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入一个字符串: ");
        StringBuilder input = new StringBuilder(scanner.nextLine());
        if (input.equals(input.reverse().toString())) {
            System.out.println("是对称字符串。");
        } else {
            System.out.println("不是对称字符串。");
        }
        scanner.close();
    }
}
