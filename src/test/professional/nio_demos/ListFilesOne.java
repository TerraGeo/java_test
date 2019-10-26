package test.professional.nio_demos;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Collectors;

public class ListFilesOne {
    public static void main(String[] args) throws IOException {
        System.out.println(Files.list(Paths.get("/root/IdeaProjects/java_test/src/test/professional")).map(Path::getFileName).collect(Collectors.toList()));
    }
}
