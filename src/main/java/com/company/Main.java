package com.company;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        //  двовимірний масиву з 4 рядками та 6 стовбцям
        int[][] array = new int[4][6];

        // Наповнив масив випадковими значеннями від 0 до 100
        Random random = new Random();
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 6; j++) {
                array[i][j] = random.nextInt(101);
                // Генерую випадкове число від 0 до 100
            }
        }
        // Виводжу масиву на екран
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 6; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }
}
