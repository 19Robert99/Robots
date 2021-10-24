package com.company;

import java.util.Scanner;

/*
Робот строит дом


 */
public class Vova {
    public static void main(String[] args) {
        int putBlock = 0;
        Scanner scanner = new Scanner(System.in);
        String materiall = scanner.nextLine();
        RobotVK robot = new RobotVK();
        int howMuchPut = 0;
        robot.material(materiall);

        for (int i = 0 ; i < howMuchPut; i++){
             robot.setBlock(putBlock);
        }

        System.out.println(materiall);

    }
}

class RobotVK {

    public static String material(String material ) {
        if (material.equals("Дуб")) {
            material = "Нет в наличии";


        }
        if (material.equals("Ель")) {
            material = "Есть";

        }
        return material;
    }

    public int setBlock (int putBlock) {
        return putBlock++;
    }

    public static int removeBlock(int removeBlock) {
        return removeBlock--;
    }
}
