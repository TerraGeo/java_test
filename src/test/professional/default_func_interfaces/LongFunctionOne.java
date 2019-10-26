package test.professional.default_func_interfaces;

import java.util.function.LongFunction;
import java.util.stream.LongStream;
import java.util.stream.Stream;

public class LongFunctionOne {
    public static void main(String[] args) {
        LongStream ls= LongStream.of(1, 2, 3, 4);
        LongFunction longFunction = l -> (int) l;
        Stream<Integer> ins = ls.mapToObj(longFunction);
    }
}
