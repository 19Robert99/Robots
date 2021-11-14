package lesson7.gordey;

public class MuscleCar extends Car implements ArrangingRaces {
    boolean Spoiler;

    public MuscleCar(String name, int maxSpeed, int power, boolean Spoiler) {
        super(name, maxSpeed, power);
    }

    public boolean isSpoiler() {
        return Spoiler;
    }

    public void setSpoiler(boolean spoiler) {
        Spoiler = spoiler;
    }

    @Override
    public void race() {
        System.out.println(getName() + ": " + "MaxSpeed: " + getMaxSpeed() + "Power: " + getPower());
    }
}