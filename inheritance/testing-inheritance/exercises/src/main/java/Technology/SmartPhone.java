package Technology;

public class SmartPhone extends Computer {
    private String carrier;
    public void printSlogan() {
        if(carrier.equals("verizon")) {
            System.out.println("Can you hear me now?");
        }

    }

    public SmartPhone(int iD, String manufacturer, int serial, int yearReleased, String carrier) {
        super(iD, manufacturer, serial, yearReleased);
        this.carrier = carrier;
    }
}

