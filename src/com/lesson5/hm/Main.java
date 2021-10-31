package com.lesson5.hm;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Robot programmer = new Robot();

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please write your code");
        programmer.writeCode(scanner.nextLine());
        System.out.println("Result of test: " + programmer.testCode());
        System.out.println("Grade: " + programmer.reviewCode());
        programmer.commitAndPush();
        System.out.println("Last commit: " + programmer.lastCommit());

        programmer.bugFix(scanner.nextLine());
        System.out.println("Grade: " + programmer.reviewCode());


        int priceForWater = 5;
        int priceForSoup = 5;
        int generalPrice = 0;


        switch (1){
            case 1: generalPrice += priceForWater;
        }

        System.out.println(generalPrice);
    }


}
