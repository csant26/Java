//Singleton class is the class that allows only one object to be created.

public class Singleton {
    public static void main(String[] ars) throws Exception{
        SingletonClass sc = SingletonClass.objectCreation();
        sc.display();
    }
}
class SingletonClass{
    //static class reference
    private static SingletonClass obj = null;
    private SingletonClass(){
        //private constructor will prevent the instantiation of this class directly.
    }
    public static SingletonClass objectCreation(){
        if (obj == null){
            obj = new SingletonClass();
        }
        return obj;
    }
    public void display(){
        System.out.println("Singleton class example.");
    }
}
