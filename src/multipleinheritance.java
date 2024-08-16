public class multipleinheritance {
    public static void main(String[] main){
        Sub sub = new Sub();
        sub.Hi();
        sub.Hillo();
    }
}
abstract class Abs{
    abstract void Hi();
}
interface IA{
    void Hillo();
}
class Sub extends Abs implements IA{
    @Override
    public void Hi(){
        System.out.println("Hi");
    }
    @Override
    public void Hillo(){
        System.out.println("Hillo");
    }
}