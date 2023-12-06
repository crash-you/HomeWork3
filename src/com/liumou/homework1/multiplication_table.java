package com.liumou;

public class multiplication_table {

    public static void main(String[] args) {
        //制作九九乘法表
        //一层循环代表被乘数
        for (int i = 1; i <= 9; i++) {
            //二层循环代表乘数
            for (int j = i; j <= 9; j++) {
                int x = i * j;
                System.out.printf("%4d", x);
            }
            //换行
            System.out.println();
        }
    }
}
