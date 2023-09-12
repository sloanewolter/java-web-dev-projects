package Technology;

public class Computer {
    private String manufacturer;
    private int serial;
    private int yearReleased;

    public boolean isOld() {
        if(yearReleased < 2020) {
            return true;
        }
        return false;
    }

    public String getManufacturer() {
        return manufacturer;
    }
    public int getSerial() {
        return serial;
    }

    public int getYearReleased() {
        return yearReleased;
    }

    public Computer(String manufacturer, int serial, int yearReleased) {
        this.manufacturer = manufacturer;
        this.serial = serial;
        this.yearReleased = yearReleased;
    }

}
