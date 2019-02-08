package test.professional.streams;

import java.util.stream.Stream;

public class StreamPeek1 {
    public static void main(String[] args) {
        Stream<Integer> stream = Stream.of(4, 10, 8, 3);
        System.out.println(stream.peek(System.out::print).anyMatch(x -> x >= 10));
    }
}
