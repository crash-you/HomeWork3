package com.liumou.homework6.small3;

import java.util.HashMap;
import java.util.Scanner;

public class translate2 {
    public static void main(String[] args) {
        // 定义Map集合用于存储词典的数据
        HashMap<String, String> word = new HashMap<>();
        // 向集合添加词典的数据。
        word.put("apple", "苹果");
        word.put("banner", "香蕉");
        word.put("book", "书");
        word.put("telephone", "电话");
        word.put("cat", "猫");
        word.put("dog", "狗");
        word.put("student", "学生");
        word.put("teacher", "老师");

        boolean isRunning = true;
        while (isRunning) {
            // 键盘录入功能获取我们要翻译的单词
            Scanner scanner = new Scanner(System.in);
            System.out.println("请您输入您要翻译的单词（输入'exit'退出）：");
            String inputWord = scanner.nextLine();
            // 判断是否退出循环
            if (inputWord.equalsIgnoreCase("exit")) {
                isRunning = false;
            } else {
                // 调用判断打印输出
                select(inputWord, word);
            }
        }
    }

    // 定义方法对键盘录入的数据进行判断
    public static void select(String inputWord, HashMap<String, String> word) {
        if (inputWord.isEmpty()) {
            System.out.println("请输入您要翻译的单词：");
        } else if (!word.containsKey(inputWord)) {
            System.out.println("对不起，您要翻译的单词不存在，请重新输入：");
        } else {
            String chinese = word.get(inputWord);
            System.out.println(inputWord + "翻译成中文意思为：" + chinese);
        }
    }
}

