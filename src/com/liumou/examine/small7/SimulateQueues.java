package com.liumou.examine.small7;

import java.util.ArrayList;

public class SimulateQueues {

    //模拟队列最大容量
    private static int MAX_CONTAINS = 10;

    //模拟容量因子
    private static int CAPACITY_FACTOR = 2;

    //模拟是否自动扩容情况
    //0表示默认（不自动扩容）
    //1表示自动扩容
    private static int i = 0;

    //模拟指针
    private static int tag = 0;

    //初始指针
    private static int first = 0;

    //定义数组集合
    private static ArrayList<String> arrayList = new ArrayList<>(MAX_CONTAINS);

    public void put(String s) {
        if (i == 0) {
            if (arrayList.size() >= MAX_CONTAINS) {
                arrayList.remove(0);
                //将指针归为当前队列中相对第一个入队元素
                tag = tag % MAX_CONTAINS;
                //更新当前相对第一个入队元素指针指向
                first = tag;
            }
        }

        if (i == 1) {
            if (arrayList.size() >= MAX_CONTAINS) {
                int add = MAX_CONTAINS * CAPACITY_FACTOR;
                arrayList.ensureCapacity(add);
                MAX_CONTAINS = add;
            }
        }

        arrayList.add(s);
        tag++;
    }

    //获取当前队列第一个入队元素
    public String get() {
        if (!isEmpty()) {
            return arrayList.get(first);
        } else {
            return null; // 返回null代表队列为空
        }
    }

    //判断队列是否为空
    public boolean isEmpty() {
        return arrayList.isEmpty();
    }

    //返回队列中的元素个数
    public int size() {
        return arrayList.size();
    }

    public SimulateQueues() {
    }

    //设置扩容因子
    public SimulateQueues(int i) {
        SimulateQueues.i = i;
    }
}
