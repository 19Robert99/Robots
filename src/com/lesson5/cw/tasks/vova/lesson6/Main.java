package com.lesson5.cw.tasks.vova.lesson6;

public class Main {
    public static void main(String[] args) {

        int[] mas = {2,6,9,1,3};

        for (int i = 0; i < mas.length - 1; i++) {
            if (mas[i] > mas[i + 1]) {
                int swap = mas[i];
                mas[i] = mas[i + 1];
                mas[i + 1] = swap;

            }
        }
        System.out.println(mas[mas.length - 1]);
    }
}


