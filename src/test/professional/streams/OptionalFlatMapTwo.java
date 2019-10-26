package test.professional.streams;

import java.util.Optional;
import java.util.stream.Stream;

public class OptionalFlatMapTwo {
    public static void main(String[] args) {
        Stream<String> stream = Stream.of("one", "two", "three");
        Optional<String> optional = stream.filter(s -> s.length() > 5).findFirst().flatMap(s -> Optional.of("4"));
        System.out.println(optional);
    }
}
