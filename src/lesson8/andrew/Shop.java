package lesson8.andrew;

public class Shop implements ShopPossibilities{

    @Override
    public void purchaseOfGoods() {
        System.out.println("Shop is now full of goods");
    }
    @Override
    public void guard() {
        System.out.println("Shop is always under the protection");
    }
    @Override
    public void open() {
        System.out.println("Shop is openned");
    }
    @Override
    public void close() {
        System.out.println("Shop is closed");
    }
}
