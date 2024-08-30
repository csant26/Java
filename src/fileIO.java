//Write a Java program to read from input.txt and write its contents into output.txt


import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class fileIO {
    public static void main(String[] args) throws IOException{
        FileInputStream in = new FileInputStream("input.txt");
        FileOutputStream out = new FileOutputStream("output.txt");
        int c;
        while ((c = in.read())!= -1) {
            out.write(c);
        }
        in.close();
        out.close();
    }
}

