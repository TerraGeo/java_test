package test.professional.default_func_interfaces;

import java.util.function.IntBinaryOperator;

public class IntBinaryOperatorOne {
    public static void main(String[] args) {
        //IntBinaryOperator inp = i1, i2 -> i1/i2;
        IntBinaryOperator inp = (i1, i2) -> i1/i2;
        System.out.println(inp.applyAsInt(3, 5));
    }
}
