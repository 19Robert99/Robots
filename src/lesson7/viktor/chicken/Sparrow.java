package lesson7.viktor.chicken;

public class Sparrow extends Bird implements BirdAction{
    private int noun;
    public Sparrow(String name, int age, int weight, int noun){
//        super(name, age, weight);
        this.noun=noun;
    }

    public int getNoun() {
        return noun;
    }

    public void setNoun(int noun) {
        this.noun = noun;
    }

    @Override
    public void voice() {
        System.out.println("Sparrow Chik Chirik");
    }

    @Override
    public void nest(String nestName) {
        System.out.println("Sparrow nest");
    }
}
