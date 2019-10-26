package test.professional.streams;

import java.util.stream.Stream;

public class StreamPeekTwo {
    public static void main(String[] args) {
        Stream stream = Stream.of("1", "2", "3");
        // stream.peek(System.out::println).anyMatch(s -> ((String)s).contains("5"));
        System.out.println(stream.peek(System.out::println).anyMatch(s -> ((String)s).contains("5")));
    }
}
