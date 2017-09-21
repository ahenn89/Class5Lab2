package class5lab2.task2;

//Abstract

public class Baby extends Person {
    public void babyMovement(){
        System.out.println("Babies crawl across the room.");
    }
    public Baby(){
        super();
        
        setSpeak("Goo-Goo-Ga-Ga");
    }
}
