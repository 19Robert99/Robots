package lesson8.vera;

public class Main {
    public static void main(String[] args) {
        HorrorGame poppy = new HorrorGame();
        poppy.setSize("high");
        poppy.setColor("Dark blue");
        poppy.setAge(150);
        /*
        SELECT size, color FROM HorrorGame WHERE age = 150;
        UPDATE HorrorGame
        SET size = "high";
        color = 150;
        INSERT INTO HorrorGame (size, color)
        VALUES ('high', 'Dark blue');
        DELETE FROM HorrorGame
         */
    }
}
