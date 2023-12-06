package com.liumou.test.small6;

import java.util.Scanner;

public class Division {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        try {
            // 提示并读取第一个数
            System.out.print("请输入第一个非负数：");
            int num1 = Integer.parseInt(scanner.nextLine());
            if (num1 < 0) {
                throw new InputMinusException("输入不能为负数");
            }

            // 提示并读取第二个数
            System.out.print("请输入第二个非负数：");
            int num2 = Integer.parseInt(scanner.nextLine());
            if (num2 < 0) {
                throw new InputMinusException("输入不能为负数");
            }

            // 计算并输出两个数相除的值
            System.out.println("相除的结果为：" + (num1 / num2));
        } catch (NumberFormatException e) {
            System.out.println("数据类型不一致：" + e.getMessage());
        } catch (ArithmeticException e) {
            System.out.println("除数不能为0：" + e.getMessage());
        } catch (InputMinusException e) {
            System.out.println("输入错误：" + e.getMessage());
        } finally {
            scanner.close(); // 关闭输入流
        }
    }
}
