package test.professional.nio_demos;

import java.io.IOException;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.regex.Pattern;

public class SimpleFileVisitorTwo {
    static boolean f;

    public static void main(String[] args) throws IOException {
        Path path = Paths.get("src");
        FileVisitor<Path> searcher = new Search();
        Files.walkFileTree(path, searcher);
        if(!f) System.out.println("No matches");
    }

    private static class Search extends SimpleFileVisitor<Path> {
        public FileVisitResult visitFile (Path dir, BasicFileAttributes bfa) {
            Pattern p = Pattern.compile("...");
            PathMatcher pm = FileSystems.getDefault().getPathMatcher("glob:...");
            if (pm.matches(dir.getFileName())) {
                System.out.println(dir);
                f = true;
            }
            return FileVisitResult.CONTINUE;
        }
    }
}
