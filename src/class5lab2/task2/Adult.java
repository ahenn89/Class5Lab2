package class5lab2.task2;

//Abstract

public class Adult extends Person {
    public void movement(){
        System.out.println("Adults walk across the room.");
    }
    
    public Adult(){
        super();
        
        setSpeak("Hello");
    }
}
