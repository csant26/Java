public class inheritance_rules
{
    public static void main(String[] args) throws Exception{
        //protected member may be accessed within the same package.
        CA ca = new CA();
        ca.display();
    }
    
}

//interface le interface lai inherit garda extends
//class le interface lai inherit garda implements
interface IA{

}
interface IB extends IA
{

}
class CA
{
    protected void display(){
        System.out.println("Protected method.");
    }
}
class CB extends CA implements IB
{
    //can access the public and protected members of CA
    //to access the protected member, use getter/setter
}
