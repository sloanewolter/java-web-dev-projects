package org.launchcode;

public class Main {
    public static void main(String[] args) {

        CD enya = new CD("Enya", 10.00, 2000, "Sony", "Enya", "Smith");
        DVD theGodFather = new DVD("The Godfather", 20.00, 1970, "Sony DVD Player", "Al Pacino", "Coppola");
        enya.spinDisc();
        theGodFather.spinDisc();
        enya.play();
        theGodFather.play();
        // TODO: Call each CD and DVD method to verify that they work as expected.
    }
}