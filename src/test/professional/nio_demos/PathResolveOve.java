package test.professional.nio_demos;

import java.nio.file.Path;
import java.nio.file.Paths;

public class PathResolveOve {
    public static void main(String[] args) {
        Path path1 = Paths.get("/root/IdeaProjects/java_test");
        Path path2 = Paths.get("java_test/test.txt");
        Path resolvedPath = path2.resolve(path1);

        System.out.println(resolvedPath.toString());
    }
}
