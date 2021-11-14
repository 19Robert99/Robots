package lesson7.andrew;

public class Main {
    public static void main(String[] args) {
        Penny penny = new Penny();
        penny.setArea(100);
        penny.setQuantityOfWorkers(40);
        penny.setQuantityOfGoods(10000);
        penny.setQuantityOfRepository(25);
        penny.setQuantityOfWareHouse(2);
        penny.setQuantityOfCashDesks(5);
        penny.sellThings();
        penny.helpСlients();
        penny.changeJudgments();
        penny.guardShop();
        System.out.println(penny);
    }

    public static void doStoreOpportunities(StoreOpportunities action){
//        @Override
//        action.sellthings();
    }
}

