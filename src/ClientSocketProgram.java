import java.net.*;
import java.io.*;
public class ClientSocketProgram {
    public static void main(String[] args) throws Exception{
        Socket s =new Socket("localhost",4999);
        PrintWriter pr = new PrintWriter(s.getOutputStream());
        pr.println("hillo");
        pr.flush();
        s.close();
    }
}
