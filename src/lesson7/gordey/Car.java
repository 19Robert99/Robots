package lesson7.gordey;

public class Car {
    private String name;
    private int maxSpeed;
    private int power;

    public Car(String name, int maxSpeed, int power) {
        this.name = name;
        this.maxSpeed = maxSpeed;
        this.power = power;

    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }
}