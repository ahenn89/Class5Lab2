package class5lab2.task1;

//Abstract Class

public class Adult extends Person{

    private String name;
    
    @Override
    public void setName(String newName) {
        name = newName;
    }

    @Override
    public String getName() {
        return name;
    }
    
}
