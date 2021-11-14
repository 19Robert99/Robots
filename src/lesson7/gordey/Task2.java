package lesson7.gordey;

public class Task2 {
    public static void main(String[] args) {
        Sportcar sportCar = new Sportcar("Viper", 400,670, 4);
        arrangingRaces(sportCar);
        MuscleCar muscleCar = new MuscleCar("Mustang", 250, 900, true);
        arrangingRaces(muscleCar);



    }
    public static void arrangingRaces (ArrangingRaces arrange){
        arrange.race();
    }
}