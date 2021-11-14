package lesson7.dima;

public class Billie extends Robot implements Options{
    private int weight;

    public Billie() {
    }

    public Billie(String name, int age, int height, int weight) {
        super(name, age, height);
        this.weight = weight;
    }

    public int getWeight() {
        System.out.println("The weight is" + weight);
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    @Override
    public void speak(){
        System.out.println("Hello!");
    }
}
