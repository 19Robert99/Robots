package com.company;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int i = scanner.nextInt();

        switch (i){
            case 4:
                System.out.println(" i = 4");
            case 5:
                System.out.println(" i = 5");
        }
    }
}