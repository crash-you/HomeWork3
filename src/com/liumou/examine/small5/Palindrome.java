package com.liumou.examine.small5;

import java.util.Scanner;

public class Palindrome {
    /**
     * 本题采用动态规划解决
     */
    public static String longestPalindrome(String s) {

        int n = s.length();
        boolean[][] dp = new boolean[n][n];
        int start = 0;
        int maxLen = 1;

        // 初始化单个字符为回文
        for (int i = 0; i < n; i++) {
            dp[i][i] = true;
        }

        // 检查长度为2的子串
        // 用于标记长度为2的子串是否为回文。
        // 如果相邻的两个字符相同，那么它们构成一个长度为2的回文子串。
        for (int i = 0; i < n - 1; i++) {
            if (s.charAt(i) == s.charAt(i + 1)) {
                dp[i][i + 1] = true;
                start = i;
                maxLen = 2;
            }
        }

        // 检查更长的子串
        // 处理长度大于2的子串。它使用两个指针i和j来标识子串的起始和结束位置。
        // 如果子串的第一个和最后一个字符相同，并且去除首尾字符后的子串是回文的，
        // 那么该子串也是回文的。这个过程会持续更新最长回文子串的起始位置和长度，直到遍历完整个字符串。
        for (int length = 3; length <= n; length++) {
            for (int i = 0; i <= n - length; i++) {
                int j = i + length - 1;
                if (s.charAt(i) == s.charAt(j) && dp[i + 1][j - 1]) {
                    dp[i][j] = true;
                    if (length > maxLen) {
                        start = i;
                        maxLen = length;
                    }
                }
            }
        }
        return s.substring(start, start + maxLen);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(longestPalindrome(str));         // 输出str中包含的回文字段
        System.out.println(longestPalindrome("cbbd"));  // 输出："bb"
    }
}

