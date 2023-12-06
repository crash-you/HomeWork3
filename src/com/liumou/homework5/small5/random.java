package com.liumou.homework5.small5;

import java.util.Random;
import java.util.Scanner;

public class random {
    public static void main(String[] args) {

        System.out.println("请输入一个字符串：");
        Scanner sc = new Scanner(System.in);

        String input = sc.nextLine();

        String shuffledString = shuffleString(input);
        System.out.println("打乱后字符串为：" + shuffledString);

        sc.close();
}

    private static String shuffleString(String input) {
        char[] chars = input.toCharArray();
        Random random = new Random();

        for (int i = 0; i < chars.length; i++) {
            int randomAt = random.nextInt(chars.length);
            char temp = chars[randomAt];

            chars[randomAt] = chars[i];
            chars[i] = temp;
        }
        return new String(chars);
    }
}
