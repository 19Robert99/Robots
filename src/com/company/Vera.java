package com.company;

import java.util.Objects;
import java.util.Scanner;

public class Vera {
    public void main(String[] args) {
        System.out.println("This robot cook sushi, let's cook");
        RobotH sushiRobot = new RobotH();
        String phrase = "Cook rice";
        String phrase1 = "Take fish";
        String phrase2 = "Take nori";
        Scanner scanner = new Scanner(System.in);
        String inputPhrase = scanner.nextLine();
        String inputPhrase1 = scanner.nextLine();
        String inputPhrase3 = scanner.nextLine();
        if (Objects.equals(inputPhrase, phrase)) {
            System.out.println(sushiRobot.getPrepare());
        }
        if (Objects.equals(inputPhrase1, phrase1)) {
            System.out.println(sushiRobot.getFish());
        }
        if (Objects.equals(inputPhrase3, phrase2)) {
            System.out.println(sushiRobot.getNori());
        }
        System.out.println("Write the cooking time of roll (minute): ");
        int time = scanner.nextInt();

        if (time <= 30) {
            System.out.println("Okey");
        } else {
            System.out.println("Bye bye!");
        }

    }
}

class RobotH {
    public String getPrepare() {
        return ("Alright, 3 sec");
    }

    public String getFish() {
        return ("Got it!");
    }

    public String getNori() {
        return ("Wait a sec..");
    }
}

