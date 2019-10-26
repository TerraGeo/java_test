package test.professional.default_func_interfaces;

import java.util.Date;
import java.util.function.IntConsumer;
import java.util.function.ObjDoubleConsumer;
import java.util.function.ObjIntConsumer;
import java.util.function.ObjLongConsumer;

public class ObjectBiConsumerOne {
    public static void main(String[] args) {
        ObjDoubleConsumer<String> objDoubleConsumer = (message, d) -> System.out.println(message + d);
        ObjIntConsumer<Double> objIntConsumer = (d, i) -> System.out.println(d.intValue() / i);
        ObjLongConsumer<Date> newDateMinusMillis = (date, millis) -> System.out.println(new Date(date.getTime() - millis));
        IntConsumer consumer = System.out::println;

        objDoubleConsumer.accept("Double value is ", 2.3);
        objIntConsumer.accept(8.3, 3);
        newDateMinusMillis.accept(new Date(), 5123788893L);
        consumer.accept(new Integer(3));
    }
}
