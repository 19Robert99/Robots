package lesson7.Vova;

public class DeLorean extends Car implements Sounds{
    private int future;
    private int past;

    public int getFuture() {
        return future;
    }

    public void setFuture(int future) {
        this.future = future;
    }

    public int getPast() {
        return past;
    }

    public void setPast(int past) {
        this.past = past;


    }
    @Override
            public void soudCar(String car) {
        System.out.println("wop");
    }
}
