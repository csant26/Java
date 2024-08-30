//List all the files or sub-directories within a directory.

import java.io.File;

public class fileDirectory {
    public static void main(String[] args) throws Exception{
        String directoryPath = "E:\\Documents";
        File directory = new File(directoryPath);
        File[] files = directory.listFiles();
        for(File file: files){
            System.out.println(file.getName());
        }
    }
}


//Copy .html and .css files of a directory into two separate directories: HTML and CSS.
