package test.professional.streams;

import java.util.Optional;

public class OptionalOne {
    public static void main(String[] args) {
        Optional<Integer> op = Optional.of(8);
        //int i = op.filter(p -> p > 8).ifPresent(System.out::println).orElse(0);
        //int i = op.filter(p -> p > 8).ifPresent(System.out::println);
        op.filter(p -> p > 7).ifPresent(System.out::println);
    }
}
