package lesson7.vera;

public class Main1 {
    public static void main(String[] args) {
        Circus clown = new Circus("Happy", 178);
//        clown.getSmile();
        clown.setHeight(170);

        System.out.println(clown);

        Circus dancer = new Circus("Smile", 230);
    }
    public static void doCircus(doAction smile) {
        smile.getSmile();
    }

}
