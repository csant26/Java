public class classL {
    public static void main(String[] args) throws Exception{
        Rectangle rect = new Rectangle();
        rect.Add();
    }
}
//access modifier diyena vaney default ho i.e. euta namespace vitra use garna milchha
//unlike in .net, default doesn't mean private.
class Rectangle{
    int a = 5;
    int b = 6;
    public void Add(){
        System.out.println(a+b);
    }
}
