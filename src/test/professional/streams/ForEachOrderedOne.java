package test.professional.streams;

import java.util.ArrayList;
import java.util.List;

public class ForEachOrderedOne {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("A");
        list.add("a");
        list.add("Ba");

        //list.forEachOrdered(System.out::println);
        list.stream().forEachOrdered(System.out::println);
    }
}
