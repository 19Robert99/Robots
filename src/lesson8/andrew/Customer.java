package lesson8.andrew;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.ThreadLocalRandom;
public class Customer extends Human implements CustomerPossibilities,ShopPossibilities{
    public String email;
    public String description;
    public int[] chanceToSteal = {1,2};
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "email='" + email + '\'' +
                ", description='" + description + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", phoneNumber=" + phoneNumber +
                ", height=" + height +
                '}';
    }
    @Override
    public void steal() {
        System.out.println("You have got a chance to steal smth");
        System.out.println("Do you really want to steal smth?if yes enter 1,if no enter 2");
        byte choice = inputParams.nextByte();
        if (choice == 1){
            if(chanceToSteal[ThreadLocalRandom.current().nextInt(1, 2)] == 1){
                System.out.println("You stole chocolate, now you are robber");
                exitTheShop();
            }
            if(chanceToSteal[ThreadLocalRandom.current().nextInt(1, 2)] == 2){
                System.out.println("Now you are arrested .You need to stay 15 minutes in prison");
                try {
//                    TimeUnit.SECONDS.sleep(15);
                    Thread.sleep(15000);
                } catch (InterruptedException e) {
                    e.printStackTrace();

                }
                exitTheShop();
            }
        }else {
            System.out.println("Nice choice");

        }
    }
    @Override
    public void buy(){
        System.out.println("You bought smth in the shop");
    }
    @Override
   public void enterTheShop(){
        System.out.println("You entered the Shop");
    }
    @Override
    public void exitTheShop(){
        System.out.println("You left the Shop");
    }
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
