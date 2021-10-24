package com.company;
/*
 *
 *
 *рабочее время
 * его работа- доставка воды
 *метод выдавания заказа
 * метод выведение количества бутлей
 * */


import java.util.Scanner;

public class Gordey {
    static int bottleDelivery;
    static float timeDelivery;

    public static void main(String[] args) {
        System.out.println();




        RobotGo bottle = new RobotGo();
        System.out.println("Сколько бyтлей вы желаете заказать?: ");
        Scanner inputParams = new Scanner(System.in);
        bottleDelivery = inputParams.nextInt();

        System.out.println("на который час вы заказываете?: ");
        timeDelivery = inputParams.nextFloat();

        getDeliveryBottle(bottleDelivery, timeDelivery, bottle.getBottle());


    }

    public static void getDeliveryBottle(int val1, float time, int amountB) {
        float time1 = 9;
        float time2 = 21;
        if (val1 <= amountB && time > time1 || time < time2) {
            System.out.println("Статус заказа: заказ в пути! Спасибо, что выбрали нас!");
        } else {
            System.out.println("Заказ отменен, прочтите правило заказа внимательней!");
        }
    }
}


class RobotGo {
    int bottle = 70;


    public int getBottle() {
        return bottle;
    }


}

