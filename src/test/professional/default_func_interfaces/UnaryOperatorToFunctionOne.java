package test.professional.default_func_interfaces;

import java.util.function.Function;
import java.util.function.UnaryOperator;

public class UnaryOperatorToFunctionOne {
    public static void main(String[] args) {
        UnaryOperator<Double> up = d -> d + 2;
        UnaryOperator<Double> up2 = d -> d + 3;
        //UnaryOperator<Double> up3 = up.compose(up2);
        Function<Double, Double> up3 = up.compose(up2);
        System.out.println(up3.apply(8.3));
    }
}
