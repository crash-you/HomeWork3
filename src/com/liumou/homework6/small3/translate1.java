package com.liumou.homework6.small3;

import java.util.HashMap;
import java.util.Scanner;

public class translate1 {
    public static void main(String[] args) {
        //定义Map集合用于存储词典的数据
        HashMap<String, String> word = new HashMap<String, String>();
        while (true) {
            //集合合添加词典的数据。
            word.put("apple", "苹果");
            word.put("banner", "香蕉");
            word.put("book", "书");
            word.put("telephone", "电话");
            word.put("cat", "猫");
            word.put("dog", "狗");
            word.put("student", "学生");
            word.put("teacher", "老师");
            //键盘录入功能获取我们要翻译的单词
            Scanner sc = new Scanner(System.in);
            System.out.println("请您输入您要翻译的单词：");
            String w = sc.nextLine();
            //调用判断打印输出
            Select(w, word);
        }
    }

    //定义方法对键盘录入的数据进行判断
    public static String Select(String w, HashMap<String, String> word) {
        if (w.isEmpty()) {
            System.out.println("请输入您要翻译的单词：");
            return "";
        } else if (!word.containsKey(w)) {
            System.out.println("对不起，您要翻译的单词不存在，请重新输入：");
        } else {
            String chinese = word.get(w);
            System.out.println(w + "翻译成中文意思为：" + chinese);
        }
        return w;
    }
}
