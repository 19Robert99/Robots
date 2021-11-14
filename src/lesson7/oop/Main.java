package lesson7.oop;

public class Main {
    public static void main(String[] args) {
//        Animal animal = new Animal("Jon", 20, 100);

//        System.out.println(animal);

        Wolf wolf = new Wolf();
        doPredatorAction(wolf);

        Lion lion = new Lion();
        doPredatorAction(lion);
    }

    public static void doPredatorAction(PredatorAction action){
        action.growl();
    }
}
