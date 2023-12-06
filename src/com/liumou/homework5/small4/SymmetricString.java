package com.liumou.homework5.small4;

import java.util.Scanner;

public class SymmetricString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入一个字符串: ");
        String input = scanner.nextLine();
        if (isSymmetric(input)) {
            System.out.println("是对称字符串。");
        } else {
            System.out.println("不是对称字符串。");
        }
        scanner.close();
    }

    public static boolean isSymmetric(String str) {
        int n = str.length();
        for (int i = 0; i < n / 2; i++) {
            if (str.charAt(i) != str.charAt(n - i - 1)) {
                return false;
            }
        }
        return true;
    }
}
