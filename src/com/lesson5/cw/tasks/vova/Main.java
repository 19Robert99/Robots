package com.lesson5.cw.tasks.vova;

public class Main {
    public static void main(String[] args) {
        int birthrate = 14;
        int mortality = -8;

        int people = 1000;
        int population = 10000000;
        for (int year = 0; year < 10; year++) {
            population = population+ (birthrate * (population / people) ) + (mortality * (population / people) );
            if (birthrate > 7){
                birthrate--;
            }
            if (mortality < -6){
                mortality++;
            }
            System.out.println(population);
        }
    }
}
