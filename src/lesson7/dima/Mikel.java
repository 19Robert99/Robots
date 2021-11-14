package lesson7.dima;

public class Mikel extends Robot implements Options {

    public Mikel(String name, int age, int height) {
        super(name, age, height);
    }

    @Override
    public void speak(){
        System.out.println("Hello! My name is Mikel");
    }
}
