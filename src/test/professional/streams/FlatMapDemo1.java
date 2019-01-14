package test.professional.streams;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FlatMapDemo1 {
    public static void main(String[] args) {
        Stream<String> stream = Stream.of("Cat", "Dog", "Rat");
        Stream<Integer> ints = stream.flatMap(s -> Stream.of(s.length()));
        System.out.println(ints.collect(Collectors.toSet()));
    }
}
