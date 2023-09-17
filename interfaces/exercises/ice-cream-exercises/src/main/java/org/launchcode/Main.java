package main.java.org.launchcode;
import java.util.Comparator;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Case menu = new Case();
        ArrayList<Flavor> flavors = menu.getFlavors();
        ArrayList<Cone> cones = menu.getCones();
        ArrayList<Toppings> toppings = menu.getToppings();
        Comparator comparator = new FlavorComparator();
        flavors.sort(comparator);
        Comparator comparatorCone = new ConeComparator();
        cones.sort(comparatorCone);
        Comparator comparatorToppings = new ToppingsComparator();
        toppings.sort(comparatorToppings);
        System.out.println(toppings);


        // TODO: Use a Comparator class to sort the 'flavors' array alphabetically by the 'name' field.

        // TODO: Use a Comparator class to sort the 'cones' array in increasing order by the 'cost' field.

        // TODO: Print the 'flavors' and 'cones' lists (in a clear manner) to verify the sorting.
    }
}