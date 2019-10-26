package test.professional.default_func_interfaces;

import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SupplierOne {
    public static void main(String[] args) {
        Supplier<String> welocmeToLowerCase = "Welcome. "::toLowerCase;
        /*Supplier<Integer> helloLettersCount = (i) -> {

            return i;
        };*/
        Supplier<Integer> helloLettersCount = () -> {
            return "hello".length();
        };

        int[] fibs = {0, 1};
        Stream<Integer> fibonacci = Stream.generate(() -> {
            int result = fibs[1];
            int nextFib = fibs[0] + fibs[1];
            fibs[0] = fibs[1];
            fibs[1] = nextFib;
            return result;
        });

        System.out.println(welocmeToLowerCase.get());
        System.out.println(helloLettersCount.get());
        System.out.println(fibonacci.limit(20).collect(Collectors.toList()));
    }
}
