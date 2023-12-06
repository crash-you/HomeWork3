package com.liumou.homework5.small6;

public class Operations {
    public static void main(String[] args) {
        String str = "Five miles away";

        //  统计字符串中字母e出现的次数。
        countChar(str);

        // 提取字符串away。
        extractString(str);

        //  将字符串复制到一个字符数组Char[]str 中。
        arrayCopy(str);

        //  将字符串中每个单词的第一个字母变成大写，输出到控制台。
        changeBigString(str);

        // 实现该字符串的逆序输出。
        reverseOutput(str);
    }

    private static void countChar(String str) {
        int count = countOccurrences(str, 'e');
        System.out.println(" 字母'e'出现的次数为: " + count);
    }

    private static void extractString(String str) {
        String subString = str.substring(str.indexOf("away"));
        System.out.println(" 提取的字符串为: " + subString);
    }

    private static void arrayCopy(String str) {
        char[] charArray = str.toCharArray();
        char[] str1 = new char[str.length()];
        System.arraycopy(charArray, 0, str1, 0, str.length());
        System.out.print("字符数组为: ");
        System.out.println(new String(str1));
    }

    private static void changeBigString(String str) {
        String[] words = str.split(" ");
        StringBuilder capitalizedString = new StringBuilder();

        for (String word : words) {
            if (!word.isEmpty()) {
                String firstLetter = word.substring(0, 1);
                String restLetters = word.substring(1);
//                System.out.println(restLetters.toString());  输出： ive  iles  way
                capitalizedString.append(firstLetter.toUpperCase()).append(restLetters).append(" ");
            }
        }

        System.out.println(" 每个单词的首字母大写: " + capitalizedString.toString().trim());
    }

    private static void reverseOutput(String str) {
        StringBuilder reversedString = new StringBuilder(str);
        System.out.println(" 逆序输出字符串: " + reversedString.reverse().toString());
    }

    // 辅助函数：统计字符出现次数
    private static int countOccurrences(String str, char target) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == target) {
                count++;
            }
        }
        return count;
    }
}
