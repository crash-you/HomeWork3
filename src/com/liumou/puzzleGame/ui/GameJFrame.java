package com.liumour.ui;

import javax.swing.*;
import javax.swing.border.BevelBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Random;

public class GameJFrame extends JFrame implements KeyListener, ActionListener {
    int[][] data = new int[4][4];

    //游戏主界面
    public GameJFrame() {
        initJFrame();

        initJMenuBar();

        initData();

        initImage();

        //设置界面是否打开
        this.setVisible(true);


    }

    //记录空白方块在二维数组中的位置
    int x = 0;
    int y = 0;

    int [][] win = {
            {1,2,3,4},
            {5,6,7,8},
            {9,10,11,12},
            {13,14,15,0},
    };

    int step = 0;

    String path = "image\\animal\\animal3\\";

    JMenuItem replayMenu = new JMenuItem("重新游戏");
    JMenuItem reLoginMenu = new JMenuItem("重新登录");
    JMenuItem closeMenu = new JMenuItem("关闭游戏");

    JMenuItem accountMenu = new JMenuItem("二维码付款");

    private void initData() {
        int[] tempArr = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15};
        Random r = new Random();
        for (int i = 0; i < tempArr.length; i++) {
            int index = r.nextInt(tempArr.length);
            int temp = tempArr[i];
            tempArr[i] = tempArr[index];
            tempArr[index] = temp;
        }


        for (int i = 0; i < tempArr.length; i++) {
            if (tempArr[i] == 0) {
                x = i / 4;
                y = i % 4;
            }
                data[i / 4][i % 4] = tempArr[i];
            }

        }



    private void initImage() {

        this.getContentPane().removeAll();

        if (victory()){
            JLabel winJLabel = new JLabel(new ImageIcon("E:\\zixuezhilu--java\\Javase\\puzzleGame\\image\\win.png"));
            winJLabel.setBounds(203,283,197,73);
            this.getContentPane().add(winJLabel);
        }

        JLabel stepCount = new JLabel("已走步数" + step);
        stepCount.setBounds(50,30,100,20);
        this.getContentPane().add(stepCount);

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                int num = data[i][j];
                //创建一个ImageIcon对象
                //创建一个JLabel对象(管理容器)
                JLabel jLabel = new JLabel(new ImageIcon(path + num + ".jpg"));
                //  指定图片位置
                jLabel.setBounds(105 * j + 83, 105 * i + 134, 105, 105);
                //设置边框
                jLabel.setBorder(new BevelBorder(0));
                //把管理容器添加到界面中
                this.getContentPane().add(jLabel);
            }
        }
//先加载的在上方，后加载的在外边
        ImageIcon bg = new ImageIcon("image\\background.png");
        JLabel background = new JLabel(bg);
        background.setBounds(40, 40, 508, 560);
        this.getContentPane().add(background);


        this.getContentPane().repaint();
    }


    private void initJMenuBar() {
        //创建整个菜单对象
        JMenuBar jMenuBar = new JMenuBar();

        //创建菜单上的选项 （功能 关于我们）
        JMenu functionMenu = new JMenu("功能");
        JMenu aboutMenu = new JMenu("求赞助");

        //创建选项下的条目对象


        //将下面每一个条目添加刀选项条目中
        functionMenu.add(replayMenu);
        functionMenu.add(reLoginMenu);
        functionMenu.add(closeMenu);

        aboutMenu.add(accountMenu);

        //给条目绑定事件
        replayMenu.addActionListener(this);
        reLoginMenu.addActionListener(this);
        closeMenu.addActionListener(this);
        accountMenu.addActionListener(this);

        //将菜单里的两个选项添加到菜单中
        jMenuBar.add(functionMenu);
        jMenuBar.add(aboutMenu);


        // 给整个界面设置菜单
        this.setJMenuBar(jMenuBar);
    }

    private void initJFrame() {
        //设置界面宽高
        this.setSize(603, 680);
        //设置界面标题
        this.setTitle("拼图游戏单机版");
        //设置界面置顶
        this.setAlwaysOnTop(true);
        //设置界面居中
        this.setLocationRelativeTo(null);
        //设置关闭模式
        this.setDefaultCloseOperation(3);
        //设置取消的居中放置，只有取消了才会按照xy轴的形式添加组件
        this.setLayout(null);
        //给整个事件添加键盘监听事件
        this.addKeyListener(this);
    }

    @Override
    public void keyTyped(KeyEvent keyEvent) {

    }

    @Override
    public void keyPressed(KeyEvent keyEvent) {

        int keyCode = keyEvent.getKeyCode();
        if(keyCode == 65 )
        {
            this.getContentPane().removeAll();
            JLabel all = new JLabel(new ImageIcon(path + "all.jpg"));
            all.setBounds(83,134,420,420);
            this.getContentPane().add(all);
            ImageIcon bg = new ImageIcon("image\\background.png");
            JLabel background = new JLabel(bg);
            background.setBounds(40, 40, 508, 560);
            this.getContentPane().add(background);

            this.getContentPane().repaint();
        }
    }

    @Override
    public void keyReleased(KeyEvent keyEvent) {

        if(victory()){
            return;
        }


        int code = keyEvent.getKeyCode();
        if (code == 37) {
            System.out.println("向左移动");
            if(y ==3){
                return;
            }
            data[x][y] = data[x][y + 1];
            data[x][y + 1] = 0;
            y++;
            step++;
            initImage();

        } else if (code == 38) {
            System.out.println("向上移动");
            if(x ==3){
                return;
            }
            data[x][y] = data[x + 1][y];
            data[x + 1][y] = 0;
            x++;
            step++;
            initImage();

        } else if (code == 39) {
            System.out.println("向右移动");
            if(y == 0){
                return;
            }
            data[x][y] = data[x][y - 1];
            data[x][y - 1] = 0;
            y--;
            step++;
            initImage();

        } else if (code == 40) {
            System.out.println("向下移动");
            if(x == 0){
                return;
            }
            data[x][y] = data[x-1][y];
            data[x - 1][y] = 0;
            x--;
            step++;
            initImage();
        }else  if(code == 65){
            initImage();
        }else if (code == 87){
            data = new int[][]{
                    {1,2,3,4},
                    {5,6,7,8},
                    {9,10,11,12},
                    {13,14,15,0},
            };
            initImage();
        }
    }

    public boolean victory(){
        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data.length; j++) {
                if(data[i][j] != win[i][j])
                {
                    return false;
                }
            }
        }
        return true;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {

        //获取当前点击的条目
        Object source = actionEvent.getSource();
        //判断
        if(source == replayMenu)
        {
            System.out.println("重新游戏");
            step = 0;
            initData();
            initImage();
        }
        else if (source == reLoginMenu)
        {
            System.out.println("重新登录");
            this.setVisible(false);
            new LoginJFrame();
        }
        else if(source == closeMenu)
        {
            System.out.println("关闭游戏");
            System.exit(0);
        }
        else if (source == accountMenu)
        {
            System.out.println("求赞助");
            //创建一个弹窗对象
            JDialog jDialog = new JDialog();
            //创建一个管理图片容器的对象JLabel
            JLabel jLabel = new JLabel(new ImageIcon("image\\QQ).jpg"));
            jLabel.setBounds(0,0,258,258);
            //图片添加到弹框中
            jDialog.getContentPane().add(jLabel);
            //弹框大小
            jDialog.setSize(344,344);
            //谈款置顶
            jDialog.setAlwaysOnTop(true);
            //弹框居中
            jDialog.setLocationRelativeTo(null);
            //弹框不关闭则无法关闭下面界面
            jDialog.setModal(true);
            //让弹框显示出来
            jDialog.setVisible(true);



        }
    }
}

