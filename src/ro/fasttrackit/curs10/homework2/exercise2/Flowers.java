package ro.fasttrackit.curs10.homework2.exercise2;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Flowers {
    public static void main(String[] args) {
        getAll();
        removeFlower("garoafa");
        getAll();
        addFlower("trandafir");
    }

    static final Set<String> buquet = new HashSet<>(List.of("trandafir", "crin", "garoafa", "zambila",
            "lalea", "margareta"));

    public static void getAll() {
        for (String flowers : buquet) {
            System.out.println(flowers);
        }
    }

    public static void addFlower(String flower) {
        for (String flowers : buquet) {
            if (flower.contains(flowers)) {
                System.out.println("Floarea exista deja in buchet!");
            } else {
                buquet.add(flower);
            }
        }
    }

    public static void removeFlower(String flower) {
        for (String flowers : buquet) {
            if (flower.equals(flowers)) {
                buquet.remove(flower);
            }
        }
    }

}

