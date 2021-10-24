package com.company;
/*
 * Робот мастерит столы из берёзы
 *
 *
 *
 * */

import java.util.Scanner;

public class Polishchuk {

    public static void main(String[] args) {
        RobotVP robotVP= new RobotVP();
        Scanner consoleScanner = new Scanner(System.in);
        String type = consoleScanner.toString();
        String item = consoleScanner.toString();
        String time = consoleScanner.toString();
        System.out.println(robotVP.pickMaterial(type););
        System.out.println(robotVP.isTypeAvailable(item););
    }
}

class RobotVP {
    public void pickMaterial(String typeOfMaterial) {
        String material = "birch";
        if (typeOfMaterial.equals(material)) {
            System.out.println("Материал подходит");
        } else {
            System.out.println("Материал не подходит");
        }

    }

    public void isTypeAvailable(String item){//кровать, стул, комод
        String itemType="chair";
        if (item.equals(itemType)){
            System.out.println("Я могу изготовить");
        }
        else {
            System.out.println("Я не могу изготовить");
        }
    }
    public void leadTime(String time){
        String leadTime="two weeks";
        if (time.equals(leadTime)){
            System.out.println("Я успею сделать");
        }
        else{
            System.out.println("Я не успею сделать");
        }
    }
}