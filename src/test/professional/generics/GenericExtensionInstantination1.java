package test.professional.generics;

import java.util.ArrayList;
import java.util.List;
import java.util.Observable;

public class GenericExtensionInstantination1 {
    public static void main(String[] args) {
        Observable observable = new Observable();
        List<? extends Number> list = new ArrayList<>();
        /*list.add(new Integer(10));
        list.add(new Double(1.2));*/
        /*Number one = new Number() {
            @Override
            public int intValue() {
                return 1;
            }

            @Override
            public long longValue() {
                return 1L;
            }

            @Override
            public float floatValue() {
                return 1f;
            }

            @Override
            public double doubleValue() {
                return 1.0;
            }
        };
        list.add(one);*/

        System.out.println(list.get(0) + "and" + list.get(1));
    }
}
