package com.liumou.homework6.small1;

import java.util.Random;
import java.util.Scanner;

public class MainPageCheck {

    private static final String CHARACTERS = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
    private static final int MAX_ATTEMPTS = 3;
    User user = new User();
    Scanner sc = new Scanner(System.in);
//    login login = new login();

    public void FPassword(){
        System.out.println("请输入您忘记密码的用户名");
        String FUserName = sc.nextLine();
        if (!checkUsername(FUserName)) {
            System.out.println("用户名查询不到，请先注册");
            return;
        }

        System.out.println("请输入对应手机号：");
        String ONumber = sc.nextLine();
        if (!checkNumber(FUserName,ONumber)) {
            System.out.println("手机号输入错误,请重新");
            return;
        }

        System.out.println("请输入该用户名对应身份证号:");
        String FidCard = sc.nextLine();
        if (!checkIdCard(FUserName,FidCard)) {
            System.out.println("身份证号输入错误");
            return;
        }

        System.out.println("请输入新的密码:");
        String newPassword = sc.nextLine();
        modifyPassword(FUserName,new User(FUserName,newPassword,FidCard,ONumber));
        System.out.println("修改成功，你可以登录了");

    }

    //注册用户信息
    public void register() {
//        sc.nextLine(); // 消耗换行符
        System.out.println("请输入用户名");
        String username = sc.nextLine();

        System.out.println("请输入密码:");
        String password = sc.nextLine();

        System.out.println("请输入身份证号");
        String idCard = sc.nextLine();
        if (!idCard(idCard)) {
            System.out.println("格式错误，请重新输入");
            return;
        }

        System.out.println("请输入手机号：");
        String num = sc.nextLine();
        if (number(num)) {
            System.out.println("输入格式错误，请重新");
            return;
        }
        System.out.println("恭喜你注册成功!");
        user.list.add(new User(username, password, idCard, num));
    }

    //检验手机号输入是否正确
    public boolean number(String number) {
        return (number == null || number.length() != 11);
    }

    //检验注册时身份证号是否正确
    public boolean idCard(String idCard) {

        String regex = "([1-9]\\d{5})" +        //表示第一个不能是0，后面5个为任意数字。整体表示身份证的前6位
                "((18|19|20)\\d{2})" +          //年的前两位，18年或19年或20年之后出生的  年的后两位，为任意数字
                "((0[1-9])|(1[0-2]))" +         //月份 ->01-09  10 11 12
                "(0[1-9]|[12]\\d|3[01])" +      //日期 ->01-09 10-29 30 31
                "(\\d{3})[0-9Xx]";                //后四位：前三位为任意，最后一位为0-9或大小写x

        return (idCard.matches(regex));
    }

    //用户登录时页面
    public void loginPage(login login) {
//        sc.nextLine(); // 消耗换行符

        for (int i = 0; i < MAX_ATTEMPTS; i++) {
            System.out.println("请输入你的用户名：");
            String userName = sc.nextLine();

            if (!checkUsername(userName)) {
                System.out.println("用户名未注册，请先注册");
                return;
            }

            System.out.println("请输入密码：");
            String password = sc.nextLine();
            int cp = checkPassword(userName, password);
            if (cp == -2 || cp == -1) {
                continue;
            }

            if (!generateVerificationCode()) {
                continue;
            }

            System.out.println("登录成功！");
            login.mainPage2();
            login.mainPage();
        }
    }

    //生成验证码
    public boolean generateVerificationCode() {
        System.out.println("请输入验证码：");
        Random random = new Random();
        StringBuilder code = new StringBuilder();
        for (int i = 0; i < 5; i++) {
            int index = random.nextInt(CHARACTERS.length());
            code.append(CHARACTERS.charAt(index));
        }
        System.out.println(code.toString());
        String input = sc.nextLine();
        if (!input.equals(code.toString())) {
            System.out.println("验证码错误");
            return false;
        }
        return true;
    }

    //验证身份证号
    public boolean checkIdCard(String username,String idCard){
        return user.checkIdCard(username,idCard);
    }

    //检验用户名是否存在
    public boolean checkUsername(String userName) {
        boolean x = user.checkName(userName);
        return x;
    }

    //检验用户名对应手机号是否正确
    public boolean checkNumber(String username,String ONumber){
        return user.checkNumber(username,ONumber);
    }

    //修改密码
    public void modifyPassword(String FUserName,User newUser){
        user.setPassword(FUserName,newUser);
        System.out.println("修改成功");
    }

    //检验对应用户名的密码是否正确
    public int checkPassword(String userName, String password) {
        return user.checkPassword(userName, password);
    }

}
