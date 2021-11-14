package lesson7.arsenii;

public class Dragon {
    private String name;
    private int age;
    private int weight;

    public Dragon() {


    }

    public Dragon(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Dragon(String name, int age, int weight) {
        this.name = name;
        this.age = age;
        this.weight = weight;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        System.out.println("Возраст" + " " + age);
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }
}
