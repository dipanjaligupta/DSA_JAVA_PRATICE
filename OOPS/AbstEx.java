public class AbstEx{
    public static void main(String[] args){
          Horse h = new Horse();
          h.eat();
          h.walk();
         chiken c = new chiken();
          c.eat();
          c.walk();
    }
}
abstract class Animal{
    //non-abstract methods
    void eat(){
        System.out.println("animal eats");
    }
    abstract void walk();//no any implements and does not creating the object
}
class Horse extends Animal{
    void walk(){
         System.out.println("walks on 4 legs");
    }
}
class chiken extends Animal{
    void walk(){
         System.out.println("walks on 2 legs");
    }
}
