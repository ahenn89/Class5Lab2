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

    @Override
    public void setWeight(int newWeight) {
        
    }

    @Override
    public int getWeight() {
        return 0;
    }

    @Override
    public void setSpeak(String newSpeak) {
        speak = newSpeak;
    }

    @Override
    public String getSpeak() {
        return speak;
    }
    
}
