package test.professional.streams;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FlatMapTwo {
    public static void main(String[] args) {
        Stream<Double> stream = Stream.of(12.4, 12.6, 12.9);
        //Stream<Integer> integerStream = stream.flatMap(d -> d.intValue());
        Stream<Integer> integerStream = stream.flatMap(d -> Stream.of(d.intValue()));
        System.out.println(integerStream.collect(Collectors.toSet()));
    }
}
