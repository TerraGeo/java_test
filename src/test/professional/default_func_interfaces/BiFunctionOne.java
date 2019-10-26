package test.professional.default_func_interfaces;

import java.util.function.BiFunction;

public class BiFunctionOne {
    public static void main(String[] args) {
        //BiFunction<Double, Double, String> function = (d, s) -> d + Double.parseDouble(s);
        BiFunction<Double, Double, String> function = (d, s) -> d + s.toString();

        System.out.println(function.apply(2., 2.));


    }
}
