package test.professional.nio_demos;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import static java.nio.file.StandardCopyOption.REPLACE_EXISTING;

public class CopyOne {
    public static void main(String[] args) throws IOException {
        Path path1 = Paths.get("/root/IdeaProjects/java_test/my_tested_text_file.txt");
        Path path2 = Paths.get("../my_tested_text_file.txt");
        Files.copy(path1, path2, REPLACE_EXISTING);
    }
}
