public class privateconstructor {
    public static void main(String[] args) throws Exception{
        Single sing = Single.getObjectSingle();
    }
}

class Single{
    private Single(){
        
    }
    private static Single single;
    public static Single getObjectSingle(){
        if(single==null){
            single=new Single();
        }
        return single;
    }
}