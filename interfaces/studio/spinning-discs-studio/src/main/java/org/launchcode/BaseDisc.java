package org.launchcode;

public abstract class BaseDisc {
    private String title;
    private double price;
    private int yearReleased;

    private String player;

    public BaseDisc(String title, double price, int yearReleased, String player) {
        this.title = title;
        this.price = price;
        this.yearReleased = yearReleased;
    }

    public String getTitle() {
        return title;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getYearReleased() {
        return yearReleased;
    }


    public String getPlayer() {
        return player;
    }

}
