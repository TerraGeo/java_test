package test.professional.streams;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamConcatOne {
    public static void main(String[] args) {
        Stream stream1 = Stream.of("A", "B");
        Stream stream2 = Stream.of("1", "2");
        Stream out = ((Stream) Stream.concat(stream1, stream2).parallel()).sorted();
        out.forEach(System.out::println);

        System.out.println(Stream.concat(stream1, stream2).collect(Collectors.toList()));
    }
}
