package com.liumou.homework6.small1;

import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class User {

    private String username;
    private String password;
    private String idCard;
    private String number;

    List<User> list = new LinkedList<>();// 创建一个用户列表

    public User() {
    }

    // 构造函数用于创建用户
    public User(String username, String password, String idCard, String number) {
        this.username = username;
        this.password = password;
        this.idCard = idCard;
        this.number = number;
//        list.add(this);
    }

    // 用于检查用户的身份证
    public boolean checkIdCard(String username, String idCard) {
        for (User user : list) {
            if (user.getUsername().equals(username)) {
                if (user.getIdCard().equals(idCard)) {
                    return true;
                }
            }
        }
        return false;
    }

    // 用于检查用户名是否存在
    public boolean checkName(String userName) {
        for (User user : list) {
            if (user.getUsername().equals(userName)) {
                return true;
            }
        }
        return false;
    }

    // 用于设置用户的密码
    public void setPassword(String username, User Nuser) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getUsername().equals(username)) {
                list.set(i, Nuser);
                break;
            }
        }
        this.password = password;
    }

    // 返回用户名
    public String getUsername() {
        return username;
    }

    // 返回用户的身份证
    public String getIdCard() {
        return idCard;
    }

    // 返回用户的号码
    public String getNumber() {
        return number;
    }


    // 返回用户的密码
    public String getPassword() {
        return password;
    }

    // 检查用户的密码是否匹配
    public int checkPassword(String userName, String passWord) {
        for (User user : list) {
            String name = user.getUsername();
            if (name.equals(userName)) {
                if (user.getPassword().equals(passWord)) {
                    System.out.println("密码验证成功");
                    return 1;
                } else {
                    System.out.println("密码不匹配");
                    return -2;
                }
            }
        }
        System.out.println("用户不存在");
        return -1;
    }

    @Override
    public String toString() {
        return "User{username = " + username + ", password = " + password + ", idCard = " + idCard + ", number = " + number + "}";
    }

    // 用于检查用户的号码
    public boolean checkNumber(String username, String oNumber) {
        for (User user : list) {
            if (user.getUsername().equals(username)) {
                if (user.getNumber().equals(oNumber)) {
                    return true;
                }
            }
        }
        return false;
    }
}
