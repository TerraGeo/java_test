package test.nio_demos;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FileAttributesDemo1 {
    public static void main(String[] args) throws IOException {
        Path path = Paths.get("test.txt");
        System.out.println(Files.readAttributes(path, "*"));
    }
}
