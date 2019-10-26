package test.professional.nio_demos;

import java.nio.file.Path;
import java.nio.file.Paths;

public class PathRelativizeOne {
    public static void main(String[] args) {
        Path path1 = Paths.get("/root/IdeaProjects/java_test");
        Path path2 = Paths.get("/root/IdeaProjects/java_test/test.txt");
        Path relativizedPath1 = path1.relativize(path2);
        Path relativizedPath2 = path2.relativize(path1);

        System.out.println(relativizedPath1.toString());
        System.out.println(relativizedPath2.toString());
    }
}