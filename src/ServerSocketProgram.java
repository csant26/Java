import java.io.*;
import java.net.*;

public class ServerSocketProgram {
    public static void main(String[] args) throws Exception{
        ServerSocket ss = new ServerSocket(4999);
        Socket s = ss.accept();
        System.out.println("Client connected!");
        InputStreamReader in = new InputStreamReader(s.getInputStream());
        BufferedReader bf = new BufferedReader(in);
        String str = bf.readLine();
        System.out.println("Client "+str);
        s.close();
        ss.close();
    }
}
