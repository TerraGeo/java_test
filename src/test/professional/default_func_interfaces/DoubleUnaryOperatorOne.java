package test.professional.default_func_interfaces;

import java.util.Map;
import java.util.function.DoubleUnaryOperator;

public class DoubleUnaryOperatorOne {
    public static void main(String[] args) {
        DoubleUnaryOperator power = val -> Math.pow(val, 2);
        System.out.println(power.applyAsDouble(3));
    }
}
