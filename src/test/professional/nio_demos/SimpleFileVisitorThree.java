package test.professional.nio_demos;

import java.io.IOException;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.regex.Pattern;

public class SimpleFileVisitorThree {
    public static void main(String[] args) throws IOException {
        Path path = Paths.get("/root/IdeaProjects/java_test/src/test/professional");
        FileVisitor<Path> searcher = new Search();
        Files.walkFileTree(path, searcher);
    }

    private static class Search extends SimpleFileVisitor<Path> {
        public FileVisitResult visitFile (Path file, BasicFileAttributes bfa) {
            PathMatcher pm = FileSystems.getDefault().getPathMatcher("glob:*.java");
            if (pm.matches(file.getFileName())) {
                System.out.println(file);
            }
            return FileVisitResult.CONTINUE;
        }
    }

}
