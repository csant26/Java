//Two methods to use thread using class.

public class threadClass {
    public static void main(String[] args) throws Exception{
        //Method 1: Use anonymous class (inner/outer) to instantiate the thread.
        Thread thread = new Thread(){
            public void run(){
                System.out.println("Thread is running.");
            }
        };
        thread.start();
    }
}

//Method 2: Esari extend garera tesko object through use garna ni milchha.
// class MyThread extends Thread{
//     public void run(){
//         System.out.println("Thread is running.");
//     }
// }
