package com.lesson5.cw.tasks.vova;

public class Table {
    public static void main(String[] args) {
        int table = 1;

        int i;
        int j;

        for (i = 0; i < 9; i++) {
            for (j = 0; j < 9; j++) {
                table = (i + 1) * (j + 1);
                System.out.print(table + " ");
                if (j == 8) {
                    System.out.println();
                }
            }
        }
    }
}


