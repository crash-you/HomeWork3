package com.liumou.homework3.vote;

import java.util.HashSet;
import java.util.Set;

public class Voter {
    // 属性的定义
    private static final int MAX_COUNT = 100;    // 最大投票数
    private static int count;                   // 投票数
    // 静态变量，存放已经投票的学生

    //set集合里存储的是voter类型的对象的地址！！！！！！！！
    private static Set<Voter> voters = new HashSet<Voter>();
    private String name;
    private String answer;

    // 构造方法
    public Voter(String name) {
        this.name = name;
    }

    public Voter() {
    }

    public Voter(int count, Set<Voter> voters, String name, String answer) {
        this.count = count;
        this.voters = voters;
        this.name = name;
        this.answer = answer;
    }

    /**
     * 获取
     *
     * @return count
     */
    public static int getCount() {
        return count;
    }

    /**
     * 设置
     *
     * @param count
     */
    public static void setCount(int count) {
        Voter.count = count;
    }

    /**
     * 获取
     *
     * @return voters
     */
    public static Set<Voter> getVoters() {
        return voters;
    }

    /**
     * 设置
     *
     * @param voters
     */
    public static void setVoters(Set<Voter> voters) {
        Voter.voters = voters;
    }

    // 投票
    public void voterFor(String answer) {
        if (count == MAX_COUNT) {
            System.out.println("投票结束。");
            return;
        }
        if (voters.contains(this)) {
            System.out.println(name + "，请勿重复投票。");
        } else {
            this.answer = answer;
            count++;
            voters.add(this);
            System.out.println(name + " 感谢你的投票。");
        }
    }

    // 打印投票结果
    public static void printVoterResult() {
        System.out.println("当前投票数为：" + count);
        System.out.println("参与投票的学生和结果如下：");

        //增强for循环
        for (Voter voter : voters) {
            System.out.println(voter.name + " 意见 " + voter.answer);
        }
    }

    public static void main(String[] args) {
        // 创建参与投票的学生对象
        Voter tom = new Voter("Tom");
        Voter jack = new Voter("Jack");
        Voter mike = new Voter("Mike");
        // 学生开始投票
        tom.voterFor("是");
        tom.voterFor("否");
        jack.voterFor("是");
        mike.voterFor("是");
        // 打印投票结果
        Voter.printVoterResult();
    }

    /**
     * 获取
     *
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * 设置
     *
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取
     *
     * @return answer
     */
    public String getAnswer() {
        return answer;
    }

    /**
     * 设置
     *
     * @param answer
     */
    public void setAnswer(String answer) {
        this.answer = answer;
    }

    public String toString() {
        return "Voter{MAX_COUNT = " + MAX_COUNT + ", count = " + count + ", voters = " + voters + ", name = " + name + ", answer = " + answer + "}";
    }
}
