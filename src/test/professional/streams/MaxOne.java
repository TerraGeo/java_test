package test.professional.streams;

import java.util.stream.Stream;

public class MaxOne {
    public static void main(String[] args) {
        Stream<String> stream = Stream.of("abc", "ab");
        System.out.println(stream.max((s1, s2) -> Integer.compare(s2.length(), s1.length())).get());
    }
}
