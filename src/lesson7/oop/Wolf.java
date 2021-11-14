package lesson7.oop;

public class Wolf extends Animal implements PredatorAction {
    @Override
    public void growl() {
        System.out.println("Wolf grrrrrrrr");
    }

    @Override
    public void asingGroup(String prideName) {
        System.out.println("Wolf group");
    }
}
