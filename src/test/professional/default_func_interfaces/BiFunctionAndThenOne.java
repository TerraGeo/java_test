package test.professional.default_func_interfaces;

import java.util.function.BiFunction;

public class BiFunctionAndThenOne {
    public static void main(String[] args) {
        BiFunction<Integer, Integer, String> squaredSumToString = (a, b) -> String.format("Sum of each squared [%d, %d] is ", a, b) + (a*a + b*b);
        //BiFunction<Integer, Integer, Integer> andThenFunction = squaredSumToString.andThen(s -> s + "That's the result");
        BiFunction<Integer, Integer, String> andThenFunction = squaredSumToString.andThen(s -> s + ". That's the result");

        System.out.println(squaredSumToString.apply(4, 5));
        System.out.println(andThenFunction.andThen(s -> " here ").apply(1, 2));
        System.out.println(andThenFunction.apply(1, 2));
    }
}
