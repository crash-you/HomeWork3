package com.liumou.examine.small2;

public class small {

    public static void main(String[] args) {

        String strOld = "let there be light.";

        //获取新字符串
        String strNew = capitalize(strOld);

        System.out.println("旧字符串为：" + strOld);
        System.out.println("新字符串为：" + strNew);

    }

    private static String capitalize(String strOld) {
        String[] split = strOld.split(" ");
        // 利用StringBuilder构建新的字符串
        StringBuilder sb = new StringBuilder();

        for (String s : split) {
            if (s.length() > 0) {
                sb.append(Character.toUpperCase(s.charAt(0))).append(s.substring(1)).append(" ");
            }
        }
        return sb.toString().trim();
    }


}
