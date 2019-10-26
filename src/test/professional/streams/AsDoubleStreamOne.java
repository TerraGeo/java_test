package test.professional.streams;

import java.util.function.DoublePredicate;
import java.util.function.Predicate;
import java.util.stream.IntStream;

public class AsDoubleStreamOne {
    public static void main(String[] args) {
        IntStream stream = IntStream.of(2, 4, 6, 1, 34, 5, 9);
        Predicate<Double> pre = d -> d > 1;
        DoublePredicate doublePredicate = d -> d > 1;

        //System.out.println(stream.asDoubleStream().anyMatch(pre));
        System.out.println(stream.asDoubleStream().anyMatch(doublePredicate));
    }
}
