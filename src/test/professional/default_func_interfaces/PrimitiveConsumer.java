package test.professional.default_func_interfaces;

import java.util.function.DoubleConsumer;
import java.util.function.IntConsumer;
import java.util.function.LongConsumer;

public class PrimitiveConsumer {
    public static void main(String[] args) {
        IntConsumer intConsumer = (i) -> System.out.println(++i);
        LongConsumer longConsumer = (l) -> {
            System.out.println(l + System.currentTimeMillis());
        };
        DoubleConsumer doubleConsumer = d -> System.out.println(d/3);

        intConsumer.accept(5);
        longConsumer.accept(7);
        doubleConsumer.andThen(d -> System.out.println(d * 2))
                .andThen(d -> System.out.println(d * 2))
                .accept(6);
    }
}
