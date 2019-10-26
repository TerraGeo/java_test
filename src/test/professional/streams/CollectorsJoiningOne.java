package test.professional.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class CollectorsJoiningOne {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();

        list.add("x");
        list.add("y");
        list.add("z");

        System.out.println(list.stream().collect(Collectors.joining()));
        System.out.println(String.join("", list));
    }
}
