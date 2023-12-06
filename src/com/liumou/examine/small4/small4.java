package com.liumou.test.small4;

import java.util.*;

public class small4 {
        public static void main(String[] args) {
            // 使用HashMap记录每种颜色小球的个数
            HashMap<String, Integer> ballMap = new HashMap<>();
            ballMap.put("红色", 5);
            ballMap.put("黑色", 2);
            ballMap.put("黄色", 7);
            ballMap.put("蓝色", 6);

            //  找出数量最多和数量最少的小球颜色，并打印在屏幕上
            //  Map.Entry.comparingByValue() 返回一个比较器，按比例按自然顺序比较Map.Entry 。
            String maxColor = Collections.max(ballMap.entrySet(), Map.Entry.comparingByValue()).getKey();
            String minColor = Collections.min(ballMap.entrySet(), Map.Entry.comparingByValue()).getKey();
            System.out.println("数量最多的小球颜色为：" + maxColor);
            System.out.println("数量最少的小球颜色为：" + minColor);

            // 按照每种颜色小球数量由多到少的顺序，将各种颜色依次打印在屏幕上
            List<Map.Entry<String, Integer>> list = new ArrayList<>(ballMap.entrySet());
            list.sort(Map.Entry.<String, Integer>comparingByValue().reversed());

            System.out.println("按照数量由多到少的顺序打印各种颜色：");
            for (Map.Entry<String, Integer> entry : list) {
                System.out.println(entry.getKey());
            }
        }
    }

