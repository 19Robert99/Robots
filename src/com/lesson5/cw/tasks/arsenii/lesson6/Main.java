package com.lesson5.cw.tasks.arsenii.lesson6;

import java.util.Arrays;
import java.util.Collections;

public class Main {
    /*   public static void main(String[] args) {
          Integer[] numbers = {2, 6, 9, 1, 3};
           Arrays.sort(numbers, Collections.reverseOrder());
           System.out.println(numbers[0]);

       }


               } */
    public static void main(String[] args) {
        double result1 = 0;
        double result2 = 0;
        double[] mass1 = new double[5];
        double[] mass2 = new double[5];
        for (int i = 0; i < mass1.length; i++) {
            mass1[i] = (int) (Math.random() * 6);
            mass2[i] = (int) (Math.random() * 6);
        }
        
        System.out.println(Arrays.toString(mass1));
        System.out.println(Arrays.toString(mass2));
        for (int j = 0; j < mass2.length; j++) {
            result1 += mass1[j];
            result2 += mass2[j];
        }

        double avg = result1 / mass1.length;
        double avg2 = result2 / mass2.length;



        if (result1 > result2) {
            System.out.println("Первое больше");

        }
        
        if (result1 == result2){
            System.out.println("Они одинаковые");
        }
        
        if (result1 < result2) {
            System.out.println("Второе больше");
        }
        
    }
}





