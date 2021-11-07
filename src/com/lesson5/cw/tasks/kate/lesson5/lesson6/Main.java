package com.lesson5.cw.tasks.kate.lesson5.lesson6;

public class Main {
    public static void main(String[] args) {

        int q = 0;
        for (int i = 1; i <= 99; i++) {
            if (i % 2 != 0) q++;
        }
        int[] number = new int[q];
        for (int i = 1; i <= 99; i++) {
            if (i % 2 != 0) {
                int e = 0;
                number[e] = i;
                System.out.println(number[e] + "");
                e++;
            }
        }
        System.out.println(" ");
        for (int i = number.length - 1; i <= 0; i++) {
            System.out.println(number[i]);

        }
    }
}