package ro.fasttrackit.curs10.homework2.exercise1;

import static ro.fasttrackit.curs10.homework2.exercise1.Basket.*;

public class BasketMain {
    public static void main(String[] args) {
        System.out.println("------");
        System.out.println("Cosul contine: " + fruits);
        System.out.println("Exista fructul cautat in lista? --> " + findFruit("Mere"));
        System.out.println("A fost gasit/eliminat fructul din lista? --> " + removeFruit("Pere"));
        System.out.println("Cosul dupa eliminarea dructului contine: " + fruits);
        System.out.println("Fructul cautat este la pozitia: " + positionOfFruit("Cirese"));
        System.out.println("Cosul cu fructe diferite ca denumire contine: " + distinct(fruits));

        addFruits("Capsuni");
        System.out.println("Cosul dupa adaugarea fructului contine : " + fruits);
        System.out.println();
        System.out.println("Cosul contine : " + countFruits() + " fructe");
        System.out.println("---CustomCount");
        System.out.println("Cosul contine: " + customCount()+ " fructe");

    }
}
