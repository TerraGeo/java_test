package test.professional.nio_demos;

import java.io.IOException;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;

public class SimpleFileVisitorInheritanceDemo1 {
    static boolean f;

    public static void main(String[] args) throws IOException {
        Path path = Paths.get("test.txt");
        FileVisitor<Path> searcher = new Search();
        Files.walkFileTree(path, searcher);
        if(!f) System.out.println("No matches");
    }

    private static class Search extends SimpleFileVisitor<Path> {
        public FileVisitResult visitFile (Path file, BasicFileAttributes bfa) {
            PathMatcher pm = FileSystems.getDefault().getPathMatcher("regex:*");
            if (pm.matches(file.getFileName())) {
                System.out.println(file);
                f = true;
            }
            return FileVisitResult.CONTINUE;
        }
    }
}
