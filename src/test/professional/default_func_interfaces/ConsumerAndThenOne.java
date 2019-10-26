package test.professional.default_func_interfaces;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerAndThenOne {
    public static void main(String[] args) {
        List<Integer> integerList = new ArrayList<>();

        integerList.add(10);
        integerList.add(20);
        integerList.add(30);
        integerList.add(40);

        Consumer<Integer> cons = System.out::print;
        Consumer<Integer> con = i -> System.out.print(" " + i*2 + " ");
        cons.andThen(con);

        integerList.forEach(cons);
        integerList.forEach(con);
        integerList.forEach(cons.andThen(con));
    }
}
