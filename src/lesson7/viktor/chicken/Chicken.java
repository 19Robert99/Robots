package lesson7.viktor.chicken;

public class Chicken extends Bird implements BirdAction{
    private int noun;
    public Chicken(String name, int age, int weight, int noun) {
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
        System.out.println("Chicken Kukariku");
    }
    @Override
    public void nest(String nestName){
        System.out.println("Nest of chicken");
    }
}
