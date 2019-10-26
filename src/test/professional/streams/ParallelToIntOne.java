package test.professional.streams;

import java.util.stream.IntStream;
import java.util.stream.Stream;

public class ParallelToIntOne {
    public static void main(String[] args) {
        Stream<String> stream = Stream.of("1", "2", "3", "4").parallel();
        IntStream ints = stream.mapToInt(Integer::parseInt);

        System.out.println(ints.isParallel());
    }
}
