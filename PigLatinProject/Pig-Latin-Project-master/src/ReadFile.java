import javax.xml.crypto.Data;
import java.io.*;
import java.util.*;
public class ReadFile
{
    public static String readFile() throws FileNotFoundException {
        //doesn't print yet

        try {
            BufferedReader reader = new BufferedReader(new FileReader("Data.txt"));
            String words;
            words = reader.readLine();
            return words;
        } catch (IOException e) {
            e.printStackTrace();
        }

        return null;
    }

}
