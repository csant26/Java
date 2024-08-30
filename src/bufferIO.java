import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class bufferIO {
    public static void main(String[] args) throws IOException{
        String str = "Hello World";
        FileOutputStream fos = new FileOutputStream("input.txt");
        BufferedOutputStream bos = new BufferedOutputStream(fos);
        byte b[] = str.getBytes();
        bos.write(b);
        bos.flush();
        bos.close();
        fos.close();
        System.out.println("written succesfully");
    }
}
