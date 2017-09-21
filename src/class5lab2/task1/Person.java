package class5lab2.task1;

//Abstract Class

abstract public class Person {
    protected String name;
    protected int weight;
    protected String speak;
    
    public abstract void setName(String newName);
    public abstract String getName();
    
    public abstract void setWeight(int newWeight);
    public abstract int getWeight();
    
    public abstract void setSpeak(String newSpeak);
    public abstract String getSpeak();
    
    
}