package lesson7.dima;

public class Robot {
    private String name;
    private int age;
    private int height;

    public Robot() {
    }

    public Robot(String name, int age, int height) {
        this.name = name;
        this.age = age;
        this.height = height;
    }

    public String getName() {
        System.out.println("The name is" + name);
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        System.out.println("The age is" + age);
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getHeight() {
        System.out.println("The height is" + height);
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    @Override
    public String toString() {
        return "Robot{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", height=" + height +
                '}';
    }
}
