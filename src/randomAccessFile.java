//Write a Java program to read,  read/write using RandomAccessFile.
import java.io.*;

public class randomAccessFile {
    public static void main(String[] args) throws IOException
    {
        String FILEPATH ="input.txt";  
        writeToFile(FILEPATH, "Stay positive. Better days are on their way.", 31); 
        System.out.println(new String(readFromFile(FILEPATH, 0, 18)));  
        System.out.println(new String(readFromFile(FILEPATH, 0,100)));  
    }  
    private static byte[] readFromFile(String filePath, int position, int size)  
            throws IOException {  
        RandomAccessFile file = new RandomAccessFile(filePath, "r");  
        file.seek(position);  
        byte[] bytes = new byte[size];  
        file.read(bytes);  
        file.close();  
        return bytes;  
    }  
    private static void writeToFile(String filePath, String data, int position)  
            throws IOException {  
        RandomAccessFile file = new RandomAccessFile(filePath, "rw");  
        file.seek(position);  
        file.write(data.getBytes());  
        file.close();  
    }   
}

    


