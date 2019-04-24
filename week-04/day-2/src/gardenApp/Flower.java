package gardenApp;

public class Flower extends Plant {

    public Flower(String color) {
        super(color, "Flower", 5, 0.75);
    }

    @Override
    public boolean needWatering() {
        this.waterAmount = 5;
        return super.needWatering();
    }
}



