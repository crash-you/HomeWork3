package com.liumou.examine.small4;

import java.util.HashMap;
import java.util.Map;

public class small5 {
        public static void main(String[] args) {
            // 创建一个HashMap来记录各种颜色小球的数量
            Map<String, Integer> ballCountMap = new HashMap<>();
            ballCountMap.put("红色", 5);
            ballCountMap.put("黑色", 2);
            ballCountMap.put("黄色", 7);
            ballCountMap.put("蓝色", 6);

            OutPutMLCount(ballCountMap);

            // 按照每种颜色小球数量由多到少的顺序打印
            // stream流 + lambda莱姆大表达式
            ballCountMap.entrySet().stream()
                    .sorted(Map.Entry.<String, Integer>comparingByValue().reversed())
                    .forEach(entry -> System.out.println(entry.getKey() + "，数量：" + entry.getValue()));
        }

    private static void OutPutMLCount(Map<String, Integer> ballCountMap) {
        // 找出数量最多和数量最少的小球颜色
        String mostColor = "";
        String leastColor = "";
        int mostCount = Integer.MIN_VALUE;  //设置为Integer类的最小值
        int leastCount = Integer.MAX_VALUE; //设置为Integer类的最大值 反向比较

        for (Map.Entry<String, Integer> entry : ballCountMap.entrySet()) {
            if (entry.getValue() > mostCount) {
                mostCount = entry.getValue();
                mostColor = entry.getKey();
            }
            if (entry.getValue() < leastCount) {
                leastCount = entry.getValue();
                leastColor = entry.getKey();
            }
        }

        System.out.println("数量最多的小球颜色：" + mostColor + "，数量：" + mostCount);
        System.out.println("数量最少的小球颜色：" + leastColor + "，数量：" + leastCount);


    }
}

