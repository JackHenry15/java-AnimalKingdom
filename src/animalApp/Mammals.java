package animalApp;

public class Mammals extends AbstractAnimal {  
    public Mammals(int id, String name, int yearNamed){
        super("Mammal", id, name, yearNamed);
    }

    // @Override
    // public String move()
    // {
    //     return "Walking";
    // }

    // @Override
    // public String breathe()
    // {
    //     return "Lungs";
    // }

    // @Override
    // public String reproduce()
    // {
    //     return "Live Birth";
    // }

    // @Override
    // public String toString() {
    //     String rtnStr = super.toString();
    //     rtnStr += "\n ID: " + id?;
    //     return rtnStr;
    // }
}
