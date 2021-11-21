package lesson8.gordey;

public class Seller extends Human implements SellCake {
    public Seller(int age, String name) {
        super(age, name);
    }


    @Override
    public void sell() {
        System.out.println("С вас 10$");
    }
}