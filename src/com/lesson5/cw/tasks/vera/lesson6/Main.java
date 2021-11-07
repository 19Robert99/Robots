package com.lesson5.cw.tasks.vera.lesson6;

import java.util.Arrays;

public class Main {
    //    public static void main(String[] args) {
//        int [] five = new int [] {2, 6, 9, 1, 3};
//        for (int i = 0; i < five.length - 1; i++) {
//            if (five[i] > five[i + 1]) {
//                int number = five[i];
//                five[i] = five[i + 1];
//                five[i + 1] = number;
//            }
//        }
//        System.out.println(five[five.length - 1]);
//    }
    public static void main(String[] args) {
        int[] firstArray = {4, 5, 3, 2, 1};
        int[] secondArray = {0, 3, 4, 5, 2};
        System.out.println(Arrays.toString(firstArray));
        System.out.println(Arrays.toString(secondArray));

        int sumFirst = 0;
        int sumSecond = 0;

        for (int i = 0; i < firstArray.length; i++) {
            sumFirst += firstArray[i];
            sumSecond += secondArray[i];
        }

        int avrgCount = sumFirst / firstArray.length;
        int avrgCountSecond = sumSecond / secondArray.length;
        if (avrgCount > avrgCountSecond) {
            System.out.println("The first average is bigger than second");
        }
        if (avrgCount < avrgCountSecond) {
            System.out.println("The first average is smaller than second");
        }
        if (avrgCount == avrgCountSecond) {
            System.out.println("They are equal");
        }
    }
}

