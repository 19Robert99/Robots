package lesson7.andrew;

public class Penny extends Shop implements StoreOpportunities {
    private int quantityOfCashDesks;
    private int quantityOfWareHouse;
    private int quantityOfRepository;

    public int getQuantityOfCashDesks() {
        return quantityOfCashDesks;
    }

    public void setQuantityOfCashDesks(int quantityOfCashDesks) {
        this.quantityOfCashDesks = quantityOfCashDesks;
    }

    public int getQuantityOfWareHouse() {
        return quantityOfWareHouse;
    }

    public void setQuantityOfWareHouse(int quantityOfWareHouse) {
        this.quantityOfWareHouse = quantityOfWareHouse;
    }

    public int getQuantityOfRepository() {
        return quantityOfRepository;
    }

    public void setQuantityOfRepository(int quantityOfRepository) {
        this.quantityOfRepository = quantityOfRepository;
    }

    @Override
    public void sellThings() {
        System.out.println("The store sold you something");
    }

    public void helpСlients() {
        System.out.println("The store helped you choose a product");
    }

    public void changeJudgments() {
        System.out.println("Store changed Judgments , now cola cost 1$");
    }

    public void guardShop() {
        System.out.println("Security stay near exit and is watching everyone");
    }
    @Override
    public String toString() {
        return "Task1lesson7{" +
                "quantityOfCashDesks=" + getQuantityOfCashDesks() +
                ", quantityOfWareHouse=" + getQuantityOfWareHouse() +
                ", quantityOfRepository=" + getQuantityOfRepository() +
                ", area=" + getArea() +
                ", quantityOfGoods=" + getQuantityOfGoods() +
                ", quantityOfWorkers=" + getQuantityOfWorkers() +
                '}';
    }

}






