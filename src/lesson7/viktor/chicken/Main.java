package lesson7.viktor.chicken;

public class Main {
    public static void main(String[] args) {
        Chicken chicken=new Chicken("Helen", 2, 1000, 20);
        doBirdAction(chicken);

        Sparrow sparrow=new Sparrow("Grysha", 1, 100, 1);
        doBirdAction(sparrow);
    }
    public static void doBirdAction(BirdAction action){action.voice();}
}
