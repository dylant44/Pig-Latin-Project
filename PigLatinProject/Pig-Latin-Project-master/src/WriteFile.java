import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class WriteFile {
    public static void saveWords(String args){
        try {
            PrintWriter printWriter = new PrintWriter("Data.txt", "UTF-8");
            printWriter.println(args);
            printWriter.close();
        } catch (FileNotFoundException | UnsupportedEncodingException e) {
            e.printStackTrace();
        }
    }
}
