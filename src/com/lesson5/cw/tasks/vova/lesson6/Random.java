package com.lesson5.cw.tasks.vova.lesson6;

import java.util.Arrays;

public class Random {
    public static void main(String[] args) {
        double result1 = 0;
        double result2 = 0;
        int[] mas1 = new int[5];
        int[] mas2 = new int[5];
        for (int i = 0; i < mas1.length; i++) {
            mas1[i] = (int) (Math.random() * 6);
            mas2[i] = (int) (Math.random() * 6);
        }
        System.out.println(Arrays.toString(mas1));
        System.out.println(Arrays.toString(mas2));
        result1 = meanArephmitic(mas1);
        result2 = meanArephmitic(mas2);
        /*for (int j = 0; j < mas1.length-1; j++) {
            result1 += mas1[j];
            result2 += mas2[j];
        }
        result1 = result1/ mas1.length;
        result2 = result2/ mas2.length;

         */
        System.out.println(result1);
        System.out.println(result2);
        if (result1 > result2) {
            System.out.println("first array larger");
        } else if (result1 == result2) {
            System.out.println("the arrays are equal");
        } else {
            System.out.println("second array larger");
        }
    }

    public static double meanArephmitic(int[] mas) {
        int result = 0;
        for (int ma : mas) {
            result += ma;
        }
        return result / mas.length;
    }
}
