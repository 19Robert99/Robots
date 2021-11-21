package lesson8.vera;

public class HorrorGame {
    private int age;
    private String size;
    private String color;

    public HorrorGame() {
    }

    public HorrorGame(int age, String size, String color) {
        this.age = age;
        this.size = size;
        this.color = color;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getColor() {
        System.out.println("It's pink");
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Game" +
                "age" + age + '\'' +
                ", size" + size + '\'' +
                ", color" + color +
                '.';
    }

}
