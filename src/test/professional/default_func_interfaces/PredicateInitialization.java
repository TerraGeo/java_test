package test.professional.default_func_interfaces;

import java.util.function.Predicate;

public class PredicateInitialization {
    public static void main(String[] args) {
        /*Predicate<Integer> p1 = (p1) -> p1 > 5;
        Predicate<Integer> p2 = p2 -> p2 > 5;
        Predicate<Integer> p3 = x -> return x > 5;
        Predicate<Integer> p4 = (i) -> i.compareTo(5);
        Predicate<Integer> p5 = i -> {i > 5};*/
        Predicate<Integer> p6 = i -> i > 5;
        Predicate<Integer> p7 = (i) -> i > 5;
        Predicate<Integer> p8 = (i) -> {return i > 5;};
        Predicate<Integer> p9= i -> {return i > 5;};

        System.out.println(p6.negate().and(i -> i > 10).or(i -> i == i).test(4));
        System.out.println(p6.negate().test(4));
        System.out.println(p6.or(i -> i == 4).test(4));
        System.out.println(p6.negate().and(i -> i > 10).test(6));
    }
}
