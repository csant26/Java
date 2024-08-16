public class innerclass {
    public static void main(String[] args) throws Exception{
        Outer.Inner in = new Outer().new Inner();
        in.show();
    }
}
class Outer{
    class Inner{
        public void show(){
            System.out.println("Nested class method.");
        }
    }
}