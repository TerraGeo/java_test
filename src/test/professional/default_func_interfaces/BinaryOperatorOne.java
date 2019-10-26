package test.professional.default_func_interfaces;

import java.util.function.BinaryOperator;

public class BinaryOperatorOne {
    public static void main(String[] args) {
        BinaryOperator<Integer> bio = BinaryOperator.minBy(Integer::compareTo);
        BinaryOperator<Integer> bio2 = BinaryOperator.minBy(Integer::compare);
        System.out.println(bio.apply(3, 3));
        System.out.println(bio2.apply(3, 3));
    }
}
