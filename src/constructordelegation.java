public class constructordelegation {
    public static void main(String[] args) throws Exception{
        Del del = new Del();
    }
}
class Del{
    public Del(){
        this("Shishant");
    }
    private Del(String x){
        System.out.println(x);
    }
}
