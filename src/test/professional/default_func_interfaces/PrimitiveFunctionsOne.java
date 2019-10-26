package test.professional.default_func_interfaces;

import java.util.Date;
import java.util.function.DoubleFunction;
import java.util.function.IntFunction;
import java.util.function.LongFunction;

public class PrimitiveFunctionsOne {
    public static void main(String[] args) {
        IntFunction<String> squareToString = i -> i + " squared is " + i * i;
        LongFunction<Date> toDate = Date::new;
        DoubleFunction<String> doubleFunction = Double::toHexString;

        System.out.println(((LongFunction<Date>) Date::new).apply(System.currentTimeMillis()));
        System.out.println(toDate.apply(System.currentTimeMillis()));
        System.out.println(squareToString.apply(83));
        System.out.println(doubleFunction.apply(3.3));
    }
}
