package lesson8.gordey;

public class Task2 {
    public static void main(String[] args) {
        Seller seller = new Seller(45, "Bob");
        sell(seller);
        Customer customer = new Customer(68, "Otto");
        buy(customer);

    }

    public static void sell(SellCake sellCake) {
        sellCake.sell();
    }

    public static void buy(BuyCake buyCake) {
        buyCake.buy();
    }
}