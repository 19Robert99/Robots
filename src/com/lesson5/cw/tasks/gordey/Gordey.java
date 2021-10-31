package com.lesson5.cw.tasks.gordey;

import java.util.Scanner;

public class Gordey {
    static int fertilityInYear = 140000;
    static int mortalityInYear = 80000;
    static int totalYearFertility;
    static int population = 10000000;

    public static void main(String[] args) {
//        totalYearFertility = fertilityInYear - mortalityInYear;
//        for (int i = 0; i < 10; i++) {
//            population = totalYearFertility + population;
//            System.out.println(population);
//
//        }
//        for (int i = 0; i < 10; i++) {
//            if (fertilityInYear > 70000) {
//                fertilityInYear -= 10000;
//            }
//            if (mortalityInYear > 60000) {
//                mortalityInYear -= 10000;
//            }
//            population = fertilityInYear + population - mortalityInYear;
//            System.out.println(population);
//        }
//        for (int i = 0; i < 10; i++) {
//            for (int j = 0; j < 10; j++) {
//                System.out.print(i * j + "   \t");
//            }
//            System.out.println("  ");
//        }
        Scanner scanner = new Scanner(System.in);
        System.out.println("1-сложение. 2-вычетание. 3-умножение. 4-деление. 5-выход");
        int choiseEquation;
        int i = 0;

        while (i != 1) {
            System.out.print("Введите число a: ");
            float a = scanner.nextFloat();
            System.out.print("Введите число b: ");
            float b = scanner.nextFloat();
            System.out.print("Выберите опцию: ");

            choiseEquation = scanner.nextInt();
            switch (choiseEquation) {
                case 1:
                    System.out.println(a + b);
                    break;
                case 2:
                    System.out.println(a - b);
                    break;
                case 3:
                    System.out.println(a * b);
                    break;
                case 4:
                    System.out.println(a / b);
                    break;
                case 5:
                    System.out.println("Попользовался и выкинул, типичный человек");
                    i = 1;
                    break;
                default:
                    System.out.println("ERROR");


            }
        }
    }
}
