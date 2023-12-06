package com.liumou.homework5.small1;

import java.util.*;

public class login {
    public static void main(String[] args) {
        Map<String,String> map = new HashMap<>();
        map.put("admin","password");
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 3; i++) {
            System.out.print("请输入用户名: ");
            String inputUsername = scanner.nextLine();
            System.out.print("请输入密码: ");
            String inputPassword = scanner.nextLine();

            if (map.containsKey(inputUsername) && map.containsValue(inputPassword)) {
                System.out.println("登录成功！");
                break;
            } else {
                System.out.println("用户名或密码不正确。");
                if (i < 2) {
                    System.out.println("还有" + (2 - i) + "次机会。");
                } else {
                    System.out.println("您已经用完了所有的尝试机会。");
                }
            }
        }
        scanner.close();
    }

}
