package animalApp;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {
    //holds filteredList
    public static List<AbstractAnimal> filteredList = new ArrayList<>();
    public static void main(String[] args) {
        // System.out.println("Interface");

        Mammals newMammal = new Mammals(1, "Jeff", 1668);
        // System.out.println(newMammal);
        Birds newBird = new Birds(2, "Bruh", 1234);
        // System.out.println(newBird);
        Fish newFish = new Fish(3, "XD", 1337);
        // System.out.println(newFish);

        List<AbstractAnimal> animalList = new ArrayList<AbstractAnimal>();
        // System.out.println(animalList.size());

        animalList.add(new Mammals( 0, "Panda", 1869));
        animalList.add(new Mammals( 1, "Zebra", 1778));
        animalList.add(new Mammals( 2, "Koala", 1816));
        animalList.add(new Mammals( 3, "Sloth", 1804));
        animalList.add(new Mammals( 4, "Armadillo", 1758));
        animalList.add(new Mammals( 5, "Raccoon", 1758));
        animalList.add(new Mammals( 6, "Bigfoot", 2021));

        animalList.add(new Birds( 7, "Pigeon", 1837));
        animalList.add(new Birds( 8, "Peacock", 1821));
        animalList.add(new Birds( 9, "Toucan", 1758));
        animalList.add(new Birds( 10, "Parrot", 1824));
        animalList.add(new Birds( 11, "Swan", 1758));

        animalList.add(new Fish( 12, "Salmon", 1758));
        animalList.add(new Fish( 13, "Catfish", 1817));
        animalList.add(new Fish( 14, "Perch", 1758));
        // System.out.println(animalList);

        //Sort by descending yearNamed
        System.out.println("Sort by descending yearNamed");
        animalList.sort((a1, a2) -> {
            return (a1.getYearNamed() < a2.getYearNamed()) ? 1 : -1;
        });
        System.out.println(animalList);
        //sort alphabetically
        System.out.println("sort alphabetically");
        animalList.sort((a1, a2) -> {
            return a1.getName().compareTo(a2.getName());
        });
        System.out.println(animalList);
        //sort based on move
        // System.out.println("sort alphabetically");

        //list only breathe=lungs
        // System.out.println("sort alphabetically");

        //list breathe=lungs & 1758
        // System.out.println("sort alphabetically");

        //list reproduction=eggs and breathe = lungs
        // System.out.println("sort alphabetically");

        //list alphabetically by name, yearNamed=1758
        // System.out.println("sort alphabetically");

        // printFilterAnimals(animalList, (a) -> a.get);

    }
        //method to filter a list
    public static void printFilterAnimals(List<AbstractAnimal> animalList, AnimalTester animalTester){
        filteredList.clear();
        for (AbstractAnimal a : animalList) {
            if (animalTester.test(a)){
                System.out.println(a);
            }
        }
    }
}