package lesson8.viktor;

public class Booker implements BookerAction{
    @Override
    public void question(){
        System.out.println("Which book do you want to read?");
    }
    @Override
    public void reservation() {
        System.out.println("How book do you want to reservation?");
    }
    @Override
    public void giveBack() {
        System.out.println("Thanks for giving back book");
    }
}