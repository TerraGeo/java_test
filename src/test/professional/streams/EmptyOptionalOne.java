package test.professional.streams;

import java.util.stream.Stream;

public class EmptyOptionalOne {
    public static void main(String[] args) {
        Stream stream = Stream.of("A", "B" ,"C");
        System.out.println(stream.limit(1).skip(1).findAny());
    }
}
