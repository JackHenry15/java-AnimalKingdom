package animalApp;

public abstract class AbstractAnimal {
    protected String type;
    protected int id;
    protected String name;
    protected int yearNamed;



    public AbstractAnimal(String type, int id, String name, int yearNamed){
        this.type = type;
        this.id = id;
        this.name = name;
        this.yearNamed = yearNamed;
    }

    public String getType() {
        return type;
    }

    public int getId(){
        return id;
    }
    
    public String getName() {
        return name;
    }

    public int getYearNamed(){
        return yearNamed;
    }

    public void setType(String type){
        this.type = type;
    }

    public void setId(int id){
        this.id = id;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setYearNamed(int yearNamed){
        this.yearNamed = yearNamed;
    }

    public void eat() {
        System.out.println("can eat");;
    }

    @Override
    public String toString() {
        return "\n" + "Type: " + type + "\n"
         + "ID: " + id + "\n"
         + "Name: " + name + "\n"
         + "YearNamed: " + yearNamed + "\n";
    }
}
