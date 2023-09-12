package Technology;

public class LapTop extends Computer{
    private double weight;
    public double getWeight() {
        return weight;
    }
    public boolean isHeavy() {
        if(weight > 4) {
            return true;
        }
        return false;
    }

    public LapTop(String manufacturer, int serial, int yearReleased, double weight) {
        super(manufacturer, serial, yearReleased);
        this.weight = weight;
    }
}
