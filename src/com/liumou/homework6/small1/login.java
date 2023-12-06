package com.liumou.homework6.small1;

import java.util.Random;
import java.util.Scanner;


public class login {
    //    Employer employer = new Employer();
//    private static final int MAX_ATTEMPTS = 3;
    //    private static final String CHARACTERS = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
    private static final String addE = "添加员工";
    private static final String deleteE = "删除员工";
    private static final String findE = "查找员工";
    private static final String modifyE = "修改员工";
    private static final String clearedE = "清空员工";
    private static final String exit = "退出";
    MainPageCheck mainPageCheck = new MainPageCheck();
    Scanner sc = new Scanner(System.in);
    Select se = new Select();
    boolean exist = true;

    // 主页面2，提供操作选项
    public void mainPage2() {
//        boolean exist = true;
        while (exist) {
            System.out.println("=========欢迎来到信息登录系统=========");
            System.out.println("=========请选择你要执行的操作=========");
            System.out.println("1: " + addE);
            System.out.println("2: " + deleteE);
            System.out.println("3: " + findE);
            System.out.println("4: " + modifyE);
            System.out.println("5: " + clearedE);
            System.out.println("6: " + exit);
            System.out.println("请输入你的选择：");
            int select = sc.nextInt();

            switch (select) {
                case 1 -> {
                    se.addEm();
                    break;
                }
                case 2 -> {
                    se.deleteEm();
                    break;
                }
                case 3 -> {
                    se.findEm();
                    break;
                }
                case 4 -> {
                    se.modifyEm();
                    break;
                }
                case 5 -> {
                    se.clearedEm();
                    break;
                }
                case 6 -> {
                    exist = false;
                    break;
                }
            }
        }
    }

    // 主页面提供登录、注册等选项
    public void mainPage() {
        System.out.println("=========欢迎来到信息登录系统=========");
        while (exist) {
            System.out.println("1：登录");
            System.out.println("2：注册");
            System.out.println("3：忘记密码");
            System.out.println("4：退出");
//        boolean repeat = true;

            System.out.println("请输入您的选择");
            int select = sc.nextInt();
            switch (select) {
                case 1 -> {
                    mainPageCheck.loginPage(this);
                    break;
                }

                case 2 -> {
                    mainPageCheck.register();
                    break;
                }
                case 3 -> {
                    mainPageCheck.FPassword();
                    break;
                }
                case 4 -> {
                    exist = false;
                    break;
                }
            }
        }
    }
}