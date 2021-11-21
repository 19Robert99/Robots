package lesson8.andrew;

public class Worker extends Human{
    public String rank;
    public String email;
    public String description;
    public int workingHoursInDay;
    public String timeInShop;

    public String getRank() {
        return rank;
    }

    public void setRank(String rank) {
        this.rank = rank;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getWorkingHoursInDay() {
        return workingHoursInDay;
    }

    public void setWorkingHoursInDay(int workingHoursInDay) {
        this.workingHoursInDay = workingHoursInDay;
    }

    public String getTimeInShop() {
        return timeInShop;
    }

    public void setTimeInShop(String timeInShop) {
        this.timeInShop = timeInShop;
    }

    @Override
    public String toString() {
        return "Worker{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", phoneNumber=" + phoneNumber +
                ", height=" + height +
                ", rank='" + rank + '\'' +
                ", email='" + email + '\'' +
                ", description='" + description + '\'' +
                ", workingHoursInDay=" + workingHoursInDay +
                ", timeInShop=" + timeInShop +
                '}';
    }
}
