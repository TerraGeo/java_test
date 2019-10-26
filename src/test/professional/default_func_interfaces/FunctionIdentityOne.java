package test.professional.default_func_interfaces;

import java.util.function.Function;

public class FunctionIdentityOne {
    public static void main(String[] args) {
        Function f = Function.identity();
        System.out.println(f.apply("A"));
    }
}
