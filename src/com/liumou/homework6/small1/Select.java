package com.liumou.homework6.small1;

import java.util.Map;
import java.util.Scanner;

public class Select {

    Scanner scanner = new Scanner(System.in);
    Employer employer = new Employer();

    // 添加员工信息
    public void addEm() {
        boolean exist = true;

        while (exist) {
            System.out.println("请输入员工id：");
            int id = scanner.nextInt();
            employer.setId(id);
            scanner.nextLine();

            System.out.println("请输入员工名称：");
            String name = scanner.nextLine();

            System.out.println("请输入年纪:");
            int age = scanner.nextInt();
            scanner.nextLine();

            System.out.println("请输入员工地址:");
            String addr = scanner.nextLine();
            if (employer.integeridMap.containsKey(id)) {
                exist = true;
                System.out.println("id重复");
                System.out.println("请重新输入");
            }
            employer.integeridMap.put(id,new Employer.id(name,age,addr));
            System.out.println("添加成功");
            exist = false;
        }
        findAll();
    }

    //遍历集合获取全部员工对象
    private void findAll() {
        System.out.println("当前田间全部员工为：");
        System.out.println("List中的全部元素:");
        for (Map.Entry<Integer, Employer.id> entry : employer.integeridMap.entrySet()) {
            int key = entry.getKey();
            Employer.id value = entry.getValue();
            System.out.println("Key: " + key + ", Value: " + value.getName() + " " + value.getAge() + " " + value.getAdder());
        }
    }

    // 删除员工信息
    public void deleteEm() {

        System.out.println("请输入员工id");
        int id = scanner.nextInt();
        if (!employer.integeridMap.containsKey(id)){
            System.out.println("该员工id不存在");
            return;
        }
        employer.integeridMap.remove(id);
    }

    // 查找员工信息
    public void findEm() {
        System.out.println("请输入查询id");
        int id = scanner.nextInt();
        if (!employer.integeridMap.containsKey(id)){
            System.out.println("该员工不存在");
            return;
        }
        System.out.println("查询成功，员工信息为：");
        Employer.id em = employer.integeridMap.get(id);
        System.out.println("姓名" + em.getName() + " 年纪：" + em.getAge() + " 地址:" + em.getAdder());
    }

    // 修改员工信息
    public void modifyEm() {
        System.out.println("输入你要修改的员工的id");
        int modifyId = scanner.nextInt();
        scanner.nextLine();

        if (!employer.integeridMap.containsKey(modifyId)){
            System.out.println("该员工不存在");
            return;
        }
        System.out.println("修改后的员工姓名为:");
        String MName = scanner.nextLine();

        System.out.println("修改后的员工年纪为:");
        int MAge = scanner.nextInt();
        scanner.nextLine();

        System.out.println("修改后的员工地址为:");
        String MAddr = scanner.nextLine();
        employer.integeridMap.put(modifyId,new Employer.id(MName,MAge,MAddr));
    }

    // 清空所有员工信息
    public void clearedEm() {
        employer.integeridMap.clear();
        System.out.println("集合剩余元素为：");
        findAll();
    }
}
