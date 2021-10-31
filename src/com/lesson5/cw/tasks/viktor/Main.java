package com.lesson5.cw.tasks.viktor;

public class Main {
    /* public static void main(String[] args) {
         String nameOfCity="XYZ";
         int amount = 1000000;
         final int amountOfRate=1000;
         final int birthrate = 14;
         final int deathRate = 8;
         final int difference=birthrate-deathRate;
         for (int years = 1; years < 11; years++) {
             amount = ((amount/amountOfRate)*difference) + amount;
             System.out.println(amount);
         }
     }
    public static void main(String[] args) {
        String nameOfCity = "XYZ";
        int amount = 1000000;
        int amountOfRate = 1000;
        int birthrate = 14;
        int deathRate = 8;

        for (int years = 1; years < 11; years++) {
            int difference = --birthrate - (--deathRate);
            amount = ((amount / amountOfRate) * difference) + amount;
            System.out.println(amount);
            if (birthrate < 7) {
                System.out.println("Рождаемость меньше 7");
                break;}
            if (deathRate < 6) {
                System.out.println("Смертность меньше 6");
                break;
            }
            System.out.println(amount);
        }
    }*/
    public static void main(String[] args) {
        for (int firstNumber = 1; firstNumber < 10; firstNumber++) {
//            System.out.println(firstNumber);
//            System.out.print("\t");
            for (int secondNumber = 1; secondNumber < 10; secondNumber++) {
//                secondNumber = firstNumber * secondNumber;
                System.out.print(firstNumber * secondNumber + "\t");
//                System.out.print("\t");
            }
            System.out.println();
        }
    }
}
