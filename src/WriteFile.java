import java.io.FileWriter;
import java.io.PrintWriter;
import java.io.IOException;
public class WriteFile
{
    private String path;
    private boolean append_to_file = false;

    public WriteFile(String file_path)
    {
        path = file_path;
    }
}
