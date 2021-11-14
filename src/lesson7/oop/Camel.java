package lesson7.oop;

public class Camel extends Animal {
    private int countOfHump;

    public Camel() {
    }

    public Camel(String name, int age, int weight, int countOfHump) {
        super(name, age, weight);
        this.countOfHump = countOfHump;
    }

    public int getCountOfHump() {
        return countOfHump;
    }

    public void setCountOfHump(int countOfHump) {
        this.countOfHump = countOfHump;
    }

    @Override
    public int getAge() {
        System.out.println("");
        return super.getAge();
    }

    @Override
    public void test() {
        System.out.println("Child test method");
    }
}
