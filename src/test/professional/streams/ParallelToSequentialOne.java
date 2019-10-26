package test.professional.streams;

import java.util.stream.Stream;

public class ParallelToSequentialOne {
    public static void main(String[] args) {
        Stream.of(2, 33).parallel().sequential();
    }
}
