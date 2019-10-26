package test.professional.default_func_interfaces;

import java.util.function.Function;

public class FunctionComposeTwo {
    public static void main(String[] args) {
        Function<Double, Double> mul = d -> d*2;
        Function<Double, Integer> f = d -> d.intValue();
        //Function<Double, Integer> resultFunction = mul.compose(f);
        Function<Double, Integer> resultFunction = f.compose(mul);

        Function<Double, String> doubleStringFunction = Object::toString;
        Function<String, Double> stringDoubleFunction = s -> Double.valueOf(s) * 3.5;
        Function<String, String> stringResultFunction = doubleStringFunction.compose(stringDoubleFunction);
        Function<Double, Double> doubleResultFunc = stringDoubleFunction.compose(doubleStringFunction);

        System.out.println(resultFunction.apply(12.6));
        System.out.println(stringResultFunction.apply("31.43"));
        System.out.println(doubleResultFunc.apply(7.3));

    }
}
