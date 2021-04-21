package ro.fasttrackit.curs10.homework2.exercise1;

import java.util.*;

public class Basket {
    public static void main(String[] args) {
        System.out.println("------");
        System.out.println("Cosul contine: " + fruits);
        System.out.println("Exista fructul cautat in lista? --> " + findFruit("Mere"));
        System.out.println("A fost gasit/eliminat fructul din lista? --> " + removeFruit("Pere"));
        System.out.println("Cosul acuma contine: " + fruits);
        System.out.println("Fructul cautat este la pozitia: " + positionOfFruit("Cirese"));
        System.out.print("\"Cosul cu fructe diferite ca denumire contine: \"");
        distinct(fruits);
        fruits.add(4, "Capsuni");
        System.out.println("Cosul dupa adaugarea fructului Capsuni contine : " + fruits);
        System.out.println();
        customCount();
    }

    static final List<String> fruits = new ArrayList<>(List.of("Pere", "Mere", "Cirese", "Visine", "Portocale",
            "Caise", "Mere"));


    public static boolean findFruit(String fruit) {
        for (String myFruit : fruits) {
            if (fruit.equals(myFruit)) {
                return true;
            }
        }
        return false;
    }

    public static boolean removeFruit(String fruit) {
        for (String myFruit : fruits) {
            if (fruit.equals(myFruit)) {
                fruits.remove(fruit);
                return true;
            }

        }
        fruits.remove(fruit);
        return false;
    }

    public static int positionOfFruit(String fruit) {
        for (String myFruit : fruits) {
            if (fruit.equals(myFruit)) {
                return fruits.indexOf(fruit);
            }
        }
        return 0;
    }

    public static void distinct(Collection<String> fruits) {
        Set<String> cosFructe = new HashSet<>();
        for (String myFruit : fruits) {
            cosFructe.add(myFruit);
        }
        System.out.println(cosFructe);
    }

    public static int customCount() {
        int counter = 0;
        ListIterator<String> iterator = fruits.listIterator();
        //Iterator<String> iterator = fruits.iterator();
        do {
            counter++;
        } while (iterator.hasNext());
        return counter;
    }
}


