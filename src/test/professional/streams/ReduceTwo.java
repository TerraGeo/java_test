package test.professional.streams;

import java.util.stream.Stream;

public class ReduceTwo {
    public static void main(String[] args) {
        Stream<String> stream = Stream.of("2", "3", "4");
        Stream<String> streamTwo = Stream.of("2", "3", "4");
        Stream<String> streamThree = Stream.of("2", "3", "4");
        System.out.println(stream.reduce("1", String::concat, String::concat));
        System.out.println(streamTwo.reduce(String::concat));
        System.out.println(streamThree.reduce("11", String::concat));
    }
}
