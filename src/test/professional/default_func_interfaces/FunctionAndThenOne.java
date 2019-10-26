package test.professional.default_func_interfaces;

import java.util.function.Function;

public class FunctionAndThenOne {
    public static void main(String[] args) {
        Function<String, Double> f = Double::parseDouble;
        System.out.println(f.andThen(s -> s * 2).apply("1"));
    }
}
