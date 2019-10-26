package test.professional.default_func_interfaces;

import java.util.function.Predicate;

public class PredicateTwo {
    public static void main(String[] args) {
        String in = "Whizlab";
        Predicate<String> p = s -> s.indexOf("i") > 0;
        System.out.println(p.and(s -> s.length() > 4).negate().test(in));
        System.out.println(p.negate().or(s -> s.length() > 4).test(in));
        System.out.println(p.or(s -> s.length() > 4).negate().test(in));
    }
}
