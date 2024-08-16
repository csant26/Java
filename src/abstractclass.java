//Anonymous Inner class using Abstract class
//Implementation of abstract class without instantiation

public class abstractclass {
    public static void main(String[] args){
        Utilities ut = new Utilities() {
            void display(){
                System.out.println("Good morning.");
            }
        };
        ut.display();
    }    
}
abstract class Utilities{
    abstract void display();
}
