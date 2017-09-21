package class5lab2.task2;

//Abstract 

public class Person {
      private String name;
      private int weight;
      private String speak;
      
      public void setName(String newName){
          name = newName;
      }
      
      public String getName(){
          return name;
      }
      
      public void setWeight(int newWeight){
          if(newWeight > 0){
              weight = newWeight;
          }else{
              System.out.println("Weight must be bigger than 0.");
          }  
          
      }
      
      public int getWeight(){
          return weight;
      }
      
      public void setSpeak(String newSpeak){
          speak = newSpeak;
      }
      
      public String getSpeak(){
          return speak;
      }
}
