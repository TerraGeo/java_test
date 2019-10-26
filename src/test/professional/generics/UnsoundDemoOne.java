package test.professional.generics;

import java.util.Arrays;
import java.util.List;

public class UnsoundDemoOne {
    public static void main(String[] args) {
        genericCall();
    }

    static void beforGenerics() {
        String[] strs = {"NaN"};
        Object[] objs = strs;
        objs[0] = 1;
        String one = strs[0];
        //String zero = UnsoundDemoOne.<Integer, String>coerce(0);
    }

    static void genericCall() {
        List<Integer> ints = Arrays.asList(1);
        List raw = ints;
        List<String> strs2 = raw;
        String one1 = strs2.get(0);
    }


    static class Constrain<A, B extends A> {
    }

    static class Bind<A> {
        <B extends A> A upcast(Constrain<A, B> constrain, B b) {
            return b;
        }
    }

    /*static <T, U> U coerce(T t) {
        Constrain<U, ? super T> constrain = null;
        Bind<U> bind = new Bind<U>();
        return bind.upcast(constrain, t);
    }*/
}
