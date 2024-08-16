public class constructorChaining {
    public static void main(String[] args) throws Exception{
        CDE cde = new CDE();
        ChildClass ch = new ChildClass();
    }
}
class ABC{
    public ABC(){
        System.out.println("Default Constructor Called.");
    }
    public ABC(String str){
        this();
        System.out.println("Parameterized Constructor Called.");
    }
}
class CDE extends ABC{
    public CDE(){
        super("Shishant");
    }
}
class BaseClass{
    BaseClass(){
        System.out.println("Base class constructor is called.");
    }
}
class ChildClass extends BaseClass{
    ChildClass(){
        super();
        System.out.println("From Base Class Constructor.");
    }
}