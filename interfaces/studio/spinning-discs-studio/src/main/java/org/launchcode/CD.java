package org.launchcode;

public class CD extends BaseDisc implements OpticalDisc {
    private String singer;
    private String producer;

    public CD(String title, double price, int yearReleased, String player, String singer, String producer) {
        super(title, price, yearReleased, player);
        this.singer = singer;
        this.producer = producer;
    }

    public String getSinger() {
        return singer;
    }

    public void setSinger(String singer) {
        this.singer = singer;
    }

    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    @Override
    public void spinDisc() {
        System.out.println("This CD spins at 500 rpm");
    }

    @Override
    public void play() {
            System.out.println("The CD is now playing");

        }

    }
    // TODO: Implement your custom interface.

    // TODO: Determine which fields, methods, and constructors can be extended from the base class and which ones
    //  need to be declared separately.

