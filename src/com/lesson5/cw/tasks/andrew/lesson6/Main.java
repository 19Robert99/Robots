package com.lesson5.cw.tasks.andrew.lesson6;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        int[] arr = new int[]{2, 6, 9, 1, 3};
        Integer value = 0;
        for (Integer x : arr) {
            if (x > value) {
                value = x;
            }
        }
        System.out.println(value);
        System.out.println(Arrays.stream(arr).max());


        Random random = new Random();

        int[] arr1 = new int[]{random.nextInt(5), random.nextInt(5), random.nextInt(5), random.nextInt(5), random.nextInt(5)};
        int[] arr2 = new int[]{random.nextInt(5), random.nextInt(5), random.nextInt(5), random.nextInt(5), random.nextInt(5)};
        printArray(arr1);
        System.out.println(".");
        printArray(arr2);
        int resultByArr2 = getAverage(arr2);
        int resultByArr1 = getAverage(arr1);
        System.out.println();
        System.out.println(resultByArr1);
        System.out.println(resultByArr2);
        if (resultByArr1 > resultByArr2) {
            System.out.println("Первая сумма больше другой");
        }
        if (resultByArr1 < resultByArr2) {
            System.out.println("Вторая сумма больше первой");
        }
        if (resultByArr1 == resultByArr2) {
            System.out.println("Одинаковое");
        }
        int[] arr3 = new int[]{1, 3, 5, 7, 9, 11, 13, 15, 17, 19, 21, 23, 25,27 ,29, 31, 35, 37, 39, 41, 43, 45, 47, 49, 51, 53, 57, 59 ,61 ,63, 65, 67, 69 ,71, 73, 75, 79, 81, 83 ,85 ,87 ,89 ,91 ,93 ,95 ,97 ,99};
        try {
            List<Integer> arr4 = Arrays.asList(1, 3, 5, 7, 9, 11, 13, 15, 17, 19, 21, 23, 25, 27, 29, 31, 35, 37, 39, 41, 43, 45, 47, 49, 51, 53, 57, 59, 61, 63, 65, 67, 69, 71, 73, 75, 79, 81, 83, 85, 87, 89, 91, 93, 95, 97, 99);
            Collections.reverse(arr4);
            System.out.println(arr4);
        }catch(Exception e){
            System.out.println("Erroe" + e);
        }

        String song = "Как тебя покорить Как тебя покорить не знаю я Не проходит без этой мысли дня Не проходит и дня";
//        if (song )

    }

    public static void printArray(int[] arr1) {
        for (int k = 0; k < arr1.length; k++) {
            System.out.print(arr1[k] + " ");
        }
    }

    public static int getAverage(int[] arr1) {
        int sumByArray = 0;
        for (int i = 0; i < arr1.length; i++) {
            sumByArray += arr1[i];
        }
        return sumByArray;
    }

}

