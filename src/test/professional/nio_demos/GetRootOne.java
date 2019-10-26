package test.professional.nio_demos;

import java.nio.file.Paths;

public class GetRootOne {
    public static void main(String[] args) {
        System.out.println(Paths.get("java_test/test.txt").getRoot());
        System.out.println(Paths.get("java_test/test.txt").toAbsolutePath().getRoot());
    }
}
