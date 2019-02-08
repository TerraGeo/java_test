package test.professional.collectionsPro;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class ListComparator1 {
    public static void main(String[] args) {
        final List<Integer> collect = new ArrayList<Integer>() {{
            add(1);
            add(41);
            add(6);
            add(12);
        }}.stream().sorted(Comparator.comparing(Integer::intValue)).collect(Collectors.toList());
        System.out.println(collect);
    }
}
