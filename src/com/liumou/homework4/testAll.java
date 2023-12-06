package com.liumou.homework4;

import com.liumou.homework4.small1.*;
import com.liumou.homework4.small2.Line;
import com.liumou.homework4.small2.Point;
import com.liumou.homework4.small3.Circle;
import com.liumou.homework4.small3.Rectangle;
import com.liumou.homework4.small3.Shape;
import com.liumou.homework4.small4.BadmintonCoach;
import com.liumou.homework4.small4.BadmintonPlayer;
import com.liumou.homework4.small4.TableTennisCoach;
import com.liumou.homework4.small4.TableTennisPlayer;
import org.junit.Test;

// 测试类
public class testAll {

    @Test
    public void test1() {
        //创建动物对象，用多态方式
        Pet dog = new Dog("小狗");
        Pet cat = new Cat("小猫");
        Pet bird = new Bird("小鸟");

        //创建主人类
        Master master = new Master();
        //向主人类中传递动物对象
        master.feed(dog);
        master.feed(cat);
        master.feed(bird);
    }

    @Test
    public void test2() {
        Point point1 = new Point(1.0, 4.0);
        point1.print();
        Point point2 = new Point(2.0, 6.0);
        point2.print();

        Line line = new Line(1.0, 4.0, 2.0, 6.0);
        System.out.println(line.getLen());
    }

    @Test
    public void test3() {
        // 向上转型
        Shape shape1 = new Rectangle(6, 8);
        Shape shape2 = new Circle(10);

        // 计算并输出面积
        System.out.println("矩形的面积：" + shape1.getArea());
        System.out.println("圆的面积：" + shape2.getArea());
    }

    @Test
    public void test4() {
        TableTennisCoach tableTennisCoach =
                new TableTennisCoach("小刘", 23);

        TableTennisPlayer tableTennisPlayer =
                new TableTennisPlayer("小王", 18);

        BadmintonPlayer badmintonPlayer =
                new BadmintonPlayer("xiaozhang", 30);

        BadmintonCoach badmintonCoach =
                new BadmintonCoach("dazhang", 36);

        tableTennisCoach.playSports();
        System.out.println("----------------------------------");

        tableTennisPlayer.playSports();
        System.out.println("----------------------------------");

        badmintonCoach.learnLanguage();
        badmintonCoach.playSports();
        System.out.println("----------------------------------");

        badmintonPlayer.learnLanguage();
        badmintonPlayer.playSports();
    }
}
