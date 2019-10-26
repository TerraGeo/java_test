package test.professional.generics;

import java.util.ArrayList;
import java.util.List;

public class PecsDemoTwo {
    public static void main(String[] args) {
        List<? super Number> list = new ArrayList<>();
        list.add(new Number() {
            @Override
            public int intValue() {
                return 0;
            }

            @Override
            public long longValue() {
                return 0;
            }

            @Override
            public float floatValue() {
                return 0;
            }

            @Override
            public double doubleValue() {
                return 0;
            }

            @Override
            public String toString() {
                return "Chocolate";
            }
        });
        //list.add(new Object());
        list.add(new Double(2.4));
        list.add(2);
        list.add(523f);
        System.out.println(list);
    }
}
