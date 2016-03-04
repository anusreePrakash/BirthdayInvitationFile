import java.io.*;
import java.io.FileNotFoundException;
public class FileReader{
    public static void main(String[] args) throws FileNotFoundException{
        String fileName = args[0];

        File file = new File(fileName);
        int size = (int) file.length();
        System.out.println(size);
        char[] buffer = new char[size];

         FileReader fr = new FileReader(file);
    }
}
