package animalApp;

public class Mammals extends AbstractAnimal {  
    public Mammals(int id, String name, int yearNamed){
        super("Mammal", id, name, yearNamed, "Walking", "Lungs", "Live Birth");
    }
}
