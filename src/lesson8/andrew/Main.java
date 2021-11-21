package lesson8.andrew;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;
public class Main{
    public static void main(String[] args) {
        Scanner inputParams = new Scanner(System.in);

        Customer petya = new Customer();
        petya.setDescription("Blue eyes,Brown hair,rounded form of face");
        petya.setAge(15);
        petya.setEmail("petya1234@gmail.com");
        petya.setHeight(200);
        petya.setName("Petya");
        petya.setPhoneNumber("+38056345312");

        Worker anya = new Worker();
        anya.setRank("Cashier");
        anya.setWorkingHoursInDay(8);
        anya.setTimeInShop("30 days");
        anya.setPhoneNumber("+380524423432");
        anya.setDescription("Brown eyes,Red hair,squared form of face");
        anya.setEmail("anya123@gmail.com");
        anya.setName("Anya");

        Customer hero = new Customer();
        System.out.println("Choose a name of your hero");
        String nameOfHero = inputParams.nextLine();
        hero.setName(nameOfHero);
        System.out.println("Choose a description of your hero");
        String descriptionOfHero = inputParams.nextLine();
        hero.setDescription(descriptionOfHero);
        do {
            System.out.println("Choose an age of your hero");
            int ageOfHero = inputParams.nextInt();
            hero.setAge(ageOfHero);
        }while(hero.getAge()<100);
        System.out.println("Choose a height of your hero");
        int heightOfHeight = inputParams.nextInt();
        hero.setHeight(heightOfHeight);
        System.out.println("Choose an email of your hero");
        String emailOfHero = inputParams.nextLine();
        hero.setEmail(emailOfHero);
        System.out.println("This is yout hero's characteristic");
        System.out.print(hero);

        Shop shop = new Shop();
        shop.purchaseOfGoods();
        shop.open();
        hero.enterTheShop();
        shop.guard();
        hero.steal();




    }

}

