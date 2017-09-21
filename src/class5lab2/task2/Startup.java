package class5lab2.task2;

//Superclass - Concrete

public class Startup {
    
    public static void main(String[] args) {
           Adult fred = new Adult();
           Baby sue = new Baby();
           
           fred.setName("Fred");
           System.out.println("This adult is named: " + fred.getName());
           fred.movement();
           fred.setWeight(-1);
           
           sue.setName("Sue");
           System.out.println("This baby is named: " + sue.getName());
           sue.babyMovement();
       } 
}
