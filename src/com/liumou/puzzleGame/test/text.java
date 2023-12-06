package com.liumou.puzzleGame.test;

import java.util.Random;


public class text {
    public static void main(String[] args) {

        int[] tempArr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15};
        Random r = new Random();
        for (int i = 0; i < tempArr.length; i++) {
            int index = r.nextInt(tempArr.length);
            int temp = tempArr[i];
            tempArr[i] = tempArr[index];
            tempArr[index] = temp;
        }

        int [][] data = new int[4][4];
        for (int i = 0; i < tempArr.length; i++) {
            data[i / 4] [i % 4] = tempArr[i];
        }

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(data[i][j] + " ");
            }
            System.out.println();
        }

    }
}

