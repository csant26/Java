//Two methods to use thread using interface.

public class threadInterface {
    public static void main(String[] args) throws Exception{
        //Method 1: Anonymous
        // Runnable r1 = new Runnable(){
        //     public void run(){
        //         System.out.println("Thread is running.");
        //     }  
        // };
        // Thread thread = new Thread(r1);
        // thread.start();

        //Method 2: Implement interface
        Myrunnable runnable = new Myrunnable();
        Thread thread = new Thread(runnable);
        thread.start();
    }
}
class Myrunnable implements Runnable{
    public void run(){
        System.out.println("Thread is running.");
    }
}
