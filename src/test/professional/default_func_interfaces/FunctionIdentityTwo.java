package test.professional.default_func_interfaces;

import java.util.function.Function;

public class FunctionIdentityTwo {
    public static void main(String[] args) {
        Function<Double, Double> f = Function.identity();
        System.out.println(f.apply(10.));
    }
}
