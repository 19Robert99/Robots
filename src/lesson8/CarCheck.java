package lesson8;

public class CarCheck {
    public static void main(String[] args) {
        Sidane s = new Sidane();
        s.drive();
        s.startEngine();

        Track track = new Track();
        s.startEngine();
        track.drive();


    }


    public static void startCar(Car car){
        car.startEngine();
    }
}
