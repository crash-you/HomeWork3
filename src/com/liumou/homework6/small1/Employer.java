package com.liumou.homework6.small1;

import java.util.*;

public class Employer {

    private int id;

    // 静态内部类，表示雇主的详细信息
    static class id{
        private String name;
        private int age;
        private String adder;

        public id(String name,int age,String addr){
            this.name = name;
            this.age = age;
            this.adder = addr;
        }

        public String getName() {
            return name;
        }

        public int getAge() {
            return age;
        }

        public String getAdder() {
            return adder;
        }
    }


//    ArrayList<Employer> employerArrayList = new ArrayList<>();
//    Set<Employer> employerSet = new HashSet<>();
    // 整数映射，用于存储雇主的ID和相关详细信息
    Map<Integer,id> integeridMap = new HashMap<>();
    public Employer() {
    }

    public Employer(int id, String name, int age, String adder) {
//        employerArrayList.add(new Employer(10086,"zhangsan",23,"奥特星球"));
//        employerSet.add(new Employer(10086,"zhangsan",23,"奥特星球"));
        integeridMap.put(10086,new id(name,age,adder));
    }

    /**
     * 获取
     * @return id
     */
/*    public int getId(int id) {
        return this.id;
    }*/

    /**
     * 设置
     * @param id
     */
    public void setId(int id) {
        this.id = id;
    }

}
