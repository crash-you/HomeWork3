package com.liumou.sadwadaw;

public class asdw {
    public static void main(String[] args) {

        String str = "6+2+6+6+5+2+4+4+5+5";
        int sum = 0;
        String[] split = str.split("\\+");
        for (String s : split) {
            sum += Integer.parseInt(s);
            System.out.print(s + " " );
        }
        System.out.println();
        System.out.println(sum);
    }
}
