package lesson8.gordey;

public class Customer extends Human implements BuyCake{

    public Customer(int age, String name) {
        super(age, name);
    }

    @Override
    public void buy() {
        System.out.println("спасибо!");
    }
}