package com.company;


import java.util.Scanner;

public class Dima {
    public static void main(String[] args) {
        System.out.println("Hello! Welcome to OperatorBot");

        RobotDN waiter = new RobotDN();

        Scanner val = new Scanner(System.in);


        System.out.println("First question: What do you want to order");
        String type = val.nextLine();
        waiter.takeOrder(type);
        System.out.println("Second question: How many servings should we put");
        String servings = val.nextLine();
        waiter.asksHowManyServings(servings);
        System.out.println("Can you write your address");


        System.out.println("Thanks for the order, wait for it within 45 minutes");


    }
}

class RobotDN {
        public void takeOrder(String type){
            if (type.equals("Soup, Hot food, Salad")){
                System.out.println("Ok");
            } else {
                System.out.println("Sorry, we don't have it in the moment");
            }
        }
        public void asksHowManyServings(String servings){
            if (servings.equals("1 || 2 || 3 || 4 || 5 || 6")){
                System.out.println();
            }
        }


}

