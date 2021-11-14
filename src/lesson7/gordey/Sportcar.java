package lesson7.gordey;

public class Sportcar extends Car implements ArrangingRaces {
    private int Spielraum;

    public Sportcar(String name, int maxSpeed, int power, int spielraum) {
        super(name, maxSpeed, power);
        this.Spielraum = spielraum;

    }

    @Override
    public void race() {
        System.out.println(getName() + ": " + "MaxSpeed: " + getMaxSpeed() + "Power: " + getPower());

    }
}
