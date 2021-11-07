package com.lesson5.cw.tasks.dima.lesson6;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        double result1 = 0;
        double result2 = 0;
        double[] val = {2, 5, 1, 3, 4};
        double[] number = {1, 5, 2, 4, 3};

        System.out.println(Arrays.toString(val));
        System.out.println(Arrays.toString(number));

        result1 = getResult(val);
        result2 = getResult(number);
        System.out.println("Result of the first array:  " + result1);
        System.out.println("Result of the second array:  " + result2);

        if (result1 > result2) {
            System.out.println("The arithmetic mean of the first array is greater");
        }
        if (result1 < result2) {
            System.out.println("The arithmetic mean of the second array is larger");
        }
        if (result1 == result2) {
            System.out.println("The arithmetic mean of the first and second arrays are equal");
        }
    }

    public static double getResult(double[] val) {
        double result1 = 0;
        for (int i = 0; i < val.length; i++) {
            result1 += val[i];
        }
        result1 /= val.length;
        return result1;

    }
}
