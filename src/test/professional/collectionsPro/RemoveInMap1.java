package test.professional.collectionsPro;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class RemoveInMap1 {
    public static void main(String[] args) {
        Map map = new HashMap<>();
        map.put(1, "A");
        map.put(2, "B");
        map.put(3, "C");
        map.put(4, "D");
        map.remove("A");
        map.remove(3, "C");
        map.remove(4, "B");
        map.values().forEach(System.out::print);
    }
}
