package Technology;

public class Computer extends AbstractEntity {
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

    public Computer(int iD, String manufacturer, int serial, int yearReleased) {
        super(iD);
        this.manufacturer = manufacturer;
        this.serial = serial;
        this.yearReleased = yearReleased;
    }

}
