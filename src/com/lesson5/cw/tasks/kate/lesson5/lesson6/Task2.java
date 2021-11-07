package com.lesson5.cw.tasks.kate.lesson5.lesson6;

import com.lesson5.cw.tasks.vova.lesson6.Array;

import java.util.Arrays;

public class Task2 {
    public static void main(String[] args) {
        int[] val1 = {1, 3, 4, 7, 9};
        int[] val2 = {2, 5, 6, 8, 9};
        System.out.println(Arrays.toString(val1));
        System.out.println(Arrays.toString(val2));

        double sum1 = 0;
        double sum2 = 0;

        double average1 = 0;
        double average2 = 0;

        for (int i = 0; i < 5; i++) {
            sum1 += val1[i];
            sum2 += val2[i];
        }
        average1 =  sum1 / val1.length;
        average2 =  sum2 / val1.length;

        System.out.println(average1);
        System.out.println(average2);
    }
}

