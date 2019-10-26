package test.professional.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class MapWithIntermediateFunction {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("1");
        list.add("2");
        list.add("3");
        list.add("4");
        list.add("5");

        Stream<Integer> ints = list.stream().map(s -> {
            System.out.println(s);
            return Integer.parseInt(s);
        });
        System.out.println("Count: ");
        System.out.println(ints.count());
    }
}
