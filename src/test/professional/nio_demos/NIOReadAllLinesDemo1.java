package test.professional.nio_demos;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Stream;

public class NIOReadAllLinesDemo1 {
    public static void main(String[] args) throws IOException {
        //Stream<String> stream = Files.readAllLines(Paths.get("test.txt"));
        List<String> strings = Files.readAllLines(Paths.get("test.txt"));
        Stream<String> stream = Files.lines(Paths.get("test.txt"));
        strings.stream().skip(1).forEach(System.out::println);
    }
}
