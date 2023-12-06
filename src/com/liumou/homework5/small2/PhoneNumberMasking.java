package com.liumou.homework5.small2;

import java.util.Scanner;

public class PhoneNumberMasking {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入您的电话号码：");
        String number = scanner.nextLine();
        String maskedNumber = maskPhoneNumber(number);
        System.out.println("Masked Phone Number: " + maskedNumber);
    }

    public static String maskPhoneNumber(String phoneNumber) {
        if (phoneNumber == null || phoneNumber.length() != 11) {
            throw new IllegalArgumentException("Invalid phone number!");
        }
        return phoneNumber.substring(0, 3) + "****" + phoneNumber.substring(7);
    }
}
