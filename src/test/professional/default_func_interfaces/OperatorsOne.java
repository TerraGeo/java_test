package test.professional.default_func_interfaces;

import java.util.Arrays;
import java.util.function.BinaryOperator;
import java.util.function.UnaryOperator;
import java.util.stream.Stream;

public class OperatorsOne {
    public static void main(String[] args) {
        UnaryOperator<String> toUpperCase = String::toUpperCase;
        BinaryOperator<Double> doubleSum = (d1, d2) -> d1 + d2;

        System.out.println(toUpperCase.apply("everywhere"));
        System.out.println(doubleSum.apply(7.6, 2.));

        int sum = Stream.of(3, 5, 8, 9, 12).reduce(0, (i1, i2) -> i1 + i2);
        System.out.println(sum);
    }
}
