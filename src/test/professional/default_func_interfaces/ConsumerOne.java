package test.professional.default_func_interfaces;


import java.util.function.Consumer;
import java.util.function.DoubleConsumer;
import java.util.function.IntConsumer;
import java.util.function.LongConsumer;

public class ConsumerOne {
    public static void main(String[] args) {
        Consumer<String> stringConsumer = System.out::println;
        stringConsumer.andThen((s) -> System.out.println("- " + s)).accept("Sup, maaaan?");
    }
}
