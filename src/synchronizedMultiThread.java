public class synchronizedMultiThread {
    public static void main(String[] args) throws Exception{
        Table tobj = new Table();
        Thread1 thread1 = new Thread1(tobj);
        Thread2 thread2 = new Thread2(tobj);
        thread1.start();
        thread2.start();
    }
}

class Table{
    synchronized void printTable(int n){
        for(int i = 1;i<=5;i++){
            System.out.println(n*i);
        }try{
            Thread.sleep(400);
        }catch(Exception e){
            System.out.println(e);
        }
    }
}

class Thread1 extends Thread{
    Table t;
    Thread1(Table t){
        this.t = t;
    }
    public void run(){
        t.printTable(5);
    }
}
class Thread2 extends Thread{
    Table t;
    Thread2(Table t){
        this.t = t;
    }
    public void run(){
        t.printTable(100);
    }
}