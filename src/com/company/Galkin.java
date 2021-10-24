package com.company;
//пылесос

import java.sql.SQLOutput;
import java.util.Scanner;

public class Galkin {
    f
    public static void main(String[] args) {

        RobotGa vitya = new RobotGa();
        vitya.start();
        Scanner inputParams = new Scanner(System.in);
        vitya.waterSupply(25);

        while (vitya.isStart()){
            System.out.println("Choose a direction move of Robot ");
            int directionOfRobot = inputParams.nextInt();
            vitya.setDirection(directionOfRobot);
            vitya.getDirection(directionOfRobot);
        }
        if (vitya.getDirection()){
            vitya.shutdown();
        }
    }
}

class RobotGa {
    public int direction;
    boolean isStart = false;


    public boolean start() {
        isStart = true;
        System.out.println("Robot is activated");
        return isStart;
    }

    public boolean isStart() {
        return isStart;
    }

    public boolean shutdown() {
        System.out.println("Robot is switched off");
        return isStart = false;
    }

    public static int waterSupply(int power) {
        System.out.println("Power of water supply is" + power);
        return power;
    }

    public int getDirection(int smth) {
        if (this.direction == 1) {
            System.out.println("Robot turned right");
        }
        if (this.direction == 2) {
            System.out.println("Robot turned left");
        }
        if (this.direction == 3) {
            System.out.println("Robot moved back");
        }
        if (this.direction == 4) {
            System.out.println("Robot moved forward");
        }
        if (this.direction == 0) {
            System.out.println("Robot shutted down");
            shutdown();
        }
        this.direction = smth;
        return smth;
    }

    public RobotGa() {
        System.out.println("Choose a direction move of Robot(1-right,2-left,3-back,4-forward,0 - shutdown)");

    }

    public void setDirection(int direction){
        this.direction = direction;
    }
}