package com.lesson5.cw.tasks.andrew;
import java.util.Scanner;
public class Galkin {
    public static void main(String[] args) {
        Scanner inputParams  = new Scanner(System.in);
        while(true) {
            System.out.println("Choose your operation 1.Addition 2.Subtraction 3.Multiplication 4.Division 5.Exit");
            int operation = inputParams.nextInt();
            System.out.println("Choose your first number");
            double firstNumber = inputParams.nextDouble();
            System.out.println("Choose your second number");
            double secondNumber = inputParams.nextDouble();
            switch (operation){
                case 1:
                    getSum(firstNumber,secondNumber);
                    break;
                case 2:
                    getSubtraction(firstNumber,secondNumber);
                    break;
                case 3 :
                    getMultiplication(firstNumber,secondNumber);
                    break;
                case 4:
                    getDivision(firstNumber,secondNumber);
                    break;
                case 5:
                    System.out.println("Goodbye");
                    System.exit(1);
            }
        }
    }

    public static void getSum(double first, double second){
        System.out.println(first+second);
    }

    public  static void getDivision(double first, double second){
        System.out.println(first+second);
    }

    public static void getSubtraction(double first,double second){
        System.out.println(first+second);

    }
    public static void getMultiplication(double first, double second){
        System.out.println(first+second);
    }
}



