package com.liumou;

import java.util.Scanner;

public class search {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // 给定一系列数据（示例数据）
        int[] data = {12, 34, 56, 78, 90, 45, 23, 67, 89, 10};

        System.out.print("请输入要搜索的数字：");
        int target = scanner.nextInt();

        int index = searchNumber(data, target);

        if (index != -1) {
            System.out.println(target + " 存在于数组中，位置为索引 " + index);
        } else {
            System.out.println(target + " 不存在于数组中。");
        }

        // 关闭输入流
        scanner.close();
    }

    // 在数组中搜索数字，并返回其索引，如果不存在则返回-1
    public static int searchNumber(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i;
            }
        }
        return -1;
    }
}

