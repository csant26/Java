public class thiis {
    public static void main(String[] args){
        Shant shant1 = new Shant();
        Shant shant2 = new Shant("Shishant");
        Shant shant3 = new Shant(14);
    }
}
class Shi{
    public Shi(){
        System.out.println("Hello");
    }
    public Shi(String x){
        System.out.println(x);
    }
    public Shi(int x){
        System.out.println(x);
    }
    public Shi(String x, int y){
        this(x);
    }
}
class Shant extends Shi{
    public Shant(){
        super();
    }
    public Shant(String x){
        this(x,14);
    }
    public Shant(int x){
        this("Shishant",x);
    }
    public Shant(String x, int y){
        super(x,y);
    }
}
