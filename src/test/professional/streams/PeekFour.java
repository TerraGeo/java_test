package test.professional.streams;

import java.util.stream.Stream;

public class PeekFour {
    public static void main(String[] args) {
        Stream<Integer> stream = Stream.of(5, 8, 1, 3, 5);
        stream.peek(System.out::print).sorted().distinct().forEach(System.out::print);
        String.CASE_INSENSITIVE_ORDER.reversed();
    }
}
