package test.professional.streams;

import java.util.OptionalInt;
import java.util.stream.IntStream;

public class PeekThree {
    public static void main(String[] args) {
        IntStream stream = IntStream.of(2, 4, 6, 8);
        OptionalInt first = stream.peek(System.out::print).findAny();
        System.out.println(first.getAsInt());
    }
}
