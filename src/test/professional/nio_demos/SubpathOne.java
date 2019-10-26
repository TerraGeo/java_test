package test.professional.nio_demos;

import java.nio.file.Path;
import java.nio.file.Paths;

public class SubpathOne {
    public static void main(String[] args) {
        Path path1 = Paths.get("/root/IdeaProjects/java_test/test.txt");
        Path path2 = Paths.get("/testedte");
        Path resultPath = Paths.get(path2.getRoot().toString(), path1.subpath(0, 3).toString());
        System.out.println(resultPath.toString());
    }
}
