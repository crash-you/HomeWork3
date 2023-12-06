package com.liumour.ui;

import javax.swing.*;

public class LoginJFrame extends JFrame {
    public LoginJFrame()
    {
        //设置界面宽高
        this.setSize(488,430);
        //设置界面标题
        this.setTitle("拼图 登录");
        //设置界面置顶
        this.setAlwaysOnTop(true);
        //设置界面居中
        this.setLocationRelativeTo(null);
        //设置关闭模式
        this.setDefaultCloseOperation(3);

        //设置界面是否显示
        this.setVisible(true);
    }
}
