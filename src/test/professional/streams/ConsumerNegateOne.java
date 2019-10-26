package test.professional.streams;

import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class ConsumerNegateOne {
    public static void main(String[] args) {
        Stream<Integer> stream = Stream.of(2, 5, 6, 8);
        Predicate<Integer> lp = (i) -> i > 5;
        Consumer<Integer> consumer = (i) -> {if (lp.negate().test(i)) System.out.println(i);};
        stream.forEach(consumer);
    }
}
