package test.professional.default_func_interfaces;

import java.util.function.ToDoubleBiFunction;
import java.util.function.ToIntBiFunction;
import java.util.function.ToLongBiFunction;

public class PrimitiveBiFunctionsOne {
    public static void main(String[] args) {
        ToIntBiFunction<Double, String> stringDoubleSum = (d, s) -> (int)(d + Double.valueOf(s));
        ToLongBiFunction<? super Integer, String> integerStringSum = (i, s) -> i + Integer.valueOf(s);
        ToDoubleBiFunction<Long, String> longStringDivision = (l, s) -> (double) (l / Long.valueOf(s));

        System.out.println(stringDoubleSum.applyAsInt(2.4, "1.3"));
        System.out.println(integerStringSum.applyAsLong(1, "23"));
        System.out.println(longStringDivision.applyAsDouble(61L, "3"));
    }
}
