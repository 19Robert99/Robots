package com.lesson5.cw.tasks.misha.lesson6;


public class Main {
    public static void main(String[] args) {
//        int numbers[] = new int[]{2, 6, 9, 1, 3};
//        int max = 0;
//        for (int i = 0; i < numbers.length; i++) {
//            if (numbers[i] > max)
//                max = numbers[i];
//        }
//        System.out.println(max);


        double sumMas1 = 0;
        double sumMas2 = 0;

        int[] Mas1 = new int[5];
        for (int i = 0; i < Mas1.length; i++) {
            Mas1[i] = (int) (Math.random() * 6);
            System.out.print(Mas1[i] + " ");
            sumMas1 += Mas1[i];
        }
        System.out.println(" ");

        int[] Mas2 = new int[5];
        for (int i = 0; i < Mas2.length; i++) {
            Mas2[i] = (int) (Math.random() * 6);
            System.out.print(Mas2[i] + " ");
            sumMas2 += Mas2[i];
        }

        System.out.println(" ");

        if (sumMas1 == sumMas2) {
            System.out.println("Средние арифметические значения двух массивов равны");
        } else if (sumMas1 > sumMas2) {
            System.out.println("Среднее арифметическое значение первого массива больше и равно ");
        } else {
            System.out.println("Среднее арифметическое значение второго массива больше и равно ");
        }

    }
}
