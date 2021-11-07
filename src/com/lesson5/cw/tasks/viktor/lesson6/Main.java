package com.lesson5.cw.tasks.viktor.lesson6;

import java.util.Arrays;

public class Main {


        /*int[] numbers = new int[]{2, 6, 9, 1, 3};
        for (int i = 0; i < numbers.length - 1; i++) {
            if (numbers[i] > numbers[i + 1]) {
                int biggestNumber = numbers[i];
                numbers[i] = numbers[i + 1];
                numbers[i + 1] = biggestNumber;
            }
        }
        System.out.println(numbers[numbers.length - 1]);*/

    public static void main(String[] args) {
        int[] firstNumbers = new int[]{(int) (Math.random() * 6), (int) (Math.random() * 6), (int) (Math.random() * 6), (int) (Math.random() * 6), (int) (Math.random() * 6)};
        int[] secondNumbers = new int[]{(int) (Math.random() * 6), (int) (Math.random() * 6), (int) (Math.random() * 6), (int) (Math.random() * 6), (int) (Math.random() * 6)};


        int firstAverage = action(firstNumbers);
        int secondAverage = action(secondNumbers);
        System.out.println("Первый массив: " + Arrays.toString(firstNumbers));
        System.out.println("Второй массив: " + Arrays.toString(secondNumbers));

        if (firstAverage < secondAverage) {
            System.out.println("Второй массив больше");
        }
        if (firstAverage > secondAverage) {
            System.out.println("Первый массив больше");
        } else {
            if (firstAverage == secondAverage) {
                System.out.println("Массивы одинаковы");
            }
        }

    }

    public static int action(int[] array) {
        int sum=0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        return sum / array.length;
    }
}

