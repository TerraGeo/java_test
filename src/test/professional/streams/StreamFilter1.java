package test.professional.streams;

import java.util.stream.Stream;

public class StreamFilter1 {
    public static void main(String[] args) {
        Stream<String> strings = Stream.of("AB", "AC", "ABC", "ABCD", "AB");
        String output = strings.filter(s -> s.length() > 2)
                               .filter(s -> s.indexOf("C") > -1)
                               .findFirst().orElse("None");
        System.out.println(output);
    }
}
