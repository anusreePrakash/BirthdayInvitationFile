import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class ReadFile {
    protected char[] readFile(String fileName) throws IOException {
        File file = new File(fileName);
        int size = (int) file.length();
        char[] buffer = new char[size];
        FileReader fr = new FileReader(file);
        fr.read(buffer, 0, size);
        fr.close();
        return buffer;
    }
}
