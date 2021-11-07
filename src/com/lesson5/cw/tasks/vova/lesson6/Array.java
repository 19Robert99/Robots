package com.lesson5.cw.tasks.vova.lesson6;

import java.util.Arrays;

public class Array {
    public static void main(String[] args) {
        int sizeArray = 0;
        for (int j = 0; j < 99; j++) {
            if (j % 2 != 0) {
                sizeArray++;
            }
        }

        System.out.println(sizeArray);
        int[] array = new int[sizeArray];
        int indexArray = 0;
        for (int i = 0; i < 99; i++) {
            if (i % 2 != 0) {
                array[indexArray] = i;
                indexArray++;
            }

        }
        System.out.println(Arrays.toString(array));
        for (int h = array.length - 1; h > 0; h--) {
            System.out.print(" " + array[h]);
        }
    }
}


