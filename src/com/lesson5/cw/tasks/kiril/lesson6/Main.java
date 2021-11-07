package com.lesson5.cw.tasks.kiril.lesson6;

public class Main {
    public static void main(String[] args) {

        int [] masnumbers = {3,5,7,1,4};
        for (int i = 0; i < masnumbers.length - 1; i++) {
            if (masnumbers[i] > masnumbers[i + 1]) {
                int number = masnumbers[i];
                masnumbers[i] = masnumbers[i + 1];
                masnumbers[i + 1] = number;
            }
        }
        System.out.println(masnumbers );
    }
}
