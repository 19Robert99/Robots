package lesson7.oop;

public class Lion extends Animal implements PredatorAction {

    @Override
    public void growl() {
        System.out.println("Lion grrrrrrr");
    }

    @Override
    public void asingGroup(String groupName) {
        System.out.println("Lion group");
    }
}
