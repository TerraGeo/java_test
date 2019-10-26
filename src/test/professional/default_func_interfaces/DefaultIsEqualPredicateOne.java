package test.professional.default_func_interfaces;

import java.util.function.Predicate;

public class DefaultIsEqualPredicateOne {
    public static void main(String[] args) {
        String in = new String("1");
        Predicate<String> stringPredicate = Predicate.isEqual(in);
        System.out.println(stringPredicate.test("2"));
        System.out.println(stringPredicate.test("1"));
        System.out.println(stringPredicate.test(new String("1")));
    }
}
