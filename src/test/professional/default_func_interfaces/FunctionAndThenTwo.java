package test.professional.default_func_interfaces;

import java.util.function.Function;

public class FunctionAndThenTwo {
    public static void main(String[] args) {
        Function<Integer, String> function = s -> s.toString();
        Function<Integer, String> afterAndThen = function.andThen((String s) -> s + " 2");
        Function<String, String> afterCompose = function.compose(s -> Integer.parseInt(s));
        Function<String, String> resultFunction = function.andThen((String s) -> s + " 2").compose((String s) -> Integer.parseInt(s));

        System.out.println(resultFunction.apply("7"));
    }
}
