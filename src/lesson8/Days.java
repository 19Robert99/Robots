package lesson8;

public enum Days {
    MONDAY(1, "Понедельник"),
    TUESDAY(2, "Вторник"),
    WEDNESDAY(3, "Среда"),
    THURSDAY(4, "Четверг"),
    FRIDAY(5, "Пятница"),
    SATURDAY(6, "Суббота"),
    SUNDAY(7, "Воскресенье");

    private int num;
    private String name;

    Days(int num, String name) {
        this.num = num;
        this.name = name;
    }

    public static Days getDayByNum(int num){
        for (Days day : Days.values()) {
            if (day.getNum() == num){
                return day;
            }
        }
        return null;
    }

    public int getNum() {
        return num;
    }

    public String getName() {
        return name;
    }
}
