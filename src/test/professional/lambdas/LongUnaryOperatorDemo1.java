package test.professional.lambdas;

import java.util.function.LongUnaryOperator;

public class LongUnaryOperatorDemo1 {
    public static void main(String[] args) {
        LongUnaryOperator lou = l -> l*2;
        long l = lou.compose(lou).applyAsLong(3);
        System.out.println(l);
    }
}
