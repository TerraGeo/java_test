package test.professional.streams;

import java.util.ArrayList;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class AllMatchOne {
    public static void main(String[] args) {
        Stream intsAndString = Stream.of(1, 2, "3");
        Stream intsAndDouble = Stream.of(1, 2, 91., 2389.23);
        Stream heap = Stream.of(1, 25.23, "text", (Runnable) System.out::println);

        System.out.println(intsAndString.allMatch(e -> e instanceof Number));
        System.out.println(intsAndDouble.allMatch(e -> e instanceof Number));
        //System.out.println(heap.allMatch(e -> e instanceof Number));

        //System.out.println(heap.mapToInt(i -> 2).boxed().collect(Collectors.toList()));
        //System.out.println(heap.mapToInt(i -> 2).mapToObj(i -> i).collect(Collectors.toList()));
        System.out.println(heap.map(Object::getClass).collect(Collectors.toList()));
    }
}
