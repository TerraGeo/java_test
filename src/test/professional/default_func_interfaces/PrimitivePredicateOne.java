package test.professional.default_func_interfaces;

import java.util.function.DoublePredicate;
import java.util.function.IntPredicate;
import java.util.function.LongPredicate;

public class PrimitivePredicateOne {
    public static void main(String[] args) {
        IntPredicate intPredicate = (i) -> {return i < 2;};
        DoublePredicate doublePredicate = d -> Math.abs(d) == d;
        LongPredicate longPredicate = longValue -> System.currentTimeMillis() > longValue;

        System.out.println(intPredicate.test(7));
        System.out.println(doublePredicate.test(-1.3));
        System.out.println(longPredicate.negate().test(System.currentTimeMillis()));
    }
}
