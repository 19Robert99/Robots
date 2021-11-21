package lesson8.vera;

public class Doll extends HorrorGame implements GameAction{
    @Override
    public void scream() {
        System.out.println("*scream");
    }

    @Override
    public void invisible() {
        System.out.println("nothing");
    }
}
