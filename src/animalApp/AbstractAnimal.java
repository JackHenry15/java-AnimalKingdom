package animalApp;

public abstract class AbstractAnimal {
    protected String type;
    protected int id;
    protected String name;
    protected int yearNamed;
    protected String move;
    protected String breath;
    protected String reproduction;




    public AbstractAnimal(String type, int id, String name, int yearNamed, String move, String breath, String reproduction){
        this.type = type;
        this.id = id;
        this.name = name;
        this.yearNamed = yearNamed;
        this.move = move;
        this.breath = breath;
        this.reproduction = reproduction;
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

    public String getMove(){
        return move;
    }
    public String getBreath(){
        return breath;
    }
    public String getReproduction(){
        return reproduction;
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

    public void setMove(String move){
        this.type = move;
    }
    public void setBreath(String breath){
        this.type = breath;
    }
    public void setReproduction(String reproduction){
        this.type = reproduction;
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
