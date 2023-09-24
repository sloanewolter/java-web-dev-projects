package org.launchcode;

public class DVD extends BaseDisc implements OpticalDisc {

    private String leadActor;
    private String director;

    public DVD(String title, double price, int yearReleased, String player, String leadActor, String director) {
        super(title, price, yearReleased, player);
        this.leadActor = leadActor;
        this.director = director;
    }

    public String getLeadActor() {
        return leadActor;
    }

    public void setLeadActor(String leadActor) {
        this.leadActor = leadActor;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public boolean isNew(int yearReleased) {
        if (2023 - yearReleased < 5) {
            return true;
        }
        return false;
    }

    @Override
    public void spinDisc() {
        System.out.println("This DVD spins at 700 rpm");

    }

    @Override
    public void play() {
        System.out.println("The DVD is now playing.");

    }

    // TODO: Implement your custom interface.

    // TODO: Determine which fields, methods, and constructors can be extended from the base class and which ones
    //  need to be declared separately.
}
