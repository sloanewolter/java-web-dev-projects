package main.java.org.launchcode;

import java.util.Comparator;

public class ToppingsComparator implements Comparator<Toppings>{
    @Override
    public int compare(Toppings o1, Toppings o2) {
        return o1.getName().compareTo(o2.getName());
    }
}
