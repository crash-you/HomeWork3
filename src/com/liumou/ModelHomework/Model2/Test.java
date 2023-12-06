package com.liumou.ModelHomework.Model2;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("输入算式数(m): ");
        int m = scanner.nextInt();
        scanner.nextLine();
        System.out.print("输入每列展示几个算式数 (n): ");
        int n = scanner.nextInt();

        Exercise exercise = new Exercise();
        exercise.generateEquations(m);

        Printer.printExercise(exercise, n);
    }
}
