public class superr {
    public static void main(String[] args){
        II ii = new II();
    }
}
class I{
    public I(){
        System.out.println("Base class constructor");
    }
    public void display(){
        System.out.println("Base class method.");
    }
}
class II extends I{
    II(){
        super();
        super.display();
    }
}
