import java.awt.*;
import java.awt.datatransfer.StringSelection;
import java.io.File;
import java.io.IOException;
import java.net.URI;
import java.nio.file.Files;
import java.nio.file.Paths;

public class FileCreationDemo {
    public static void main(String[] args) throws IOException {
        //new File("./src/resources/dir").mkdirs();
        System.out.println(Files.createDirectories(Paths.get("./src/resources/dir/")).toString());
        System.out.println(Paths.get("C:\\Users\\serhii.ivanov\\IdeaProjects\\Test\\.\\src\\resources\\dir").getFileName());
        StringSelection stringSelection = new StringSelection("C:\\Users\\serhii.ivanov\\IdeaProjects\\Test\\.\\src\\resources\\dir");
        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(stringSelection, null);
    }
}