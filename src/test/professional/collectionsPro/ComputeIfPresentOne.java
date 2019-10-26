package test.professional.collectionsPro;

import java.util.HashMap;
import java.util.Map;

public class ComputeIfPresentOne {
    public static void main(String[] args) {
        Map<Integer, Integer> map = new HashMap<>();
        map.put(1, 7);
        map.put(2, 8);
        map.put(3, 6);
        map.put(4, 5);
        map.put(null, 3);
        map.put(null, null);

        map.putIfAbsent(4, 61);
        map.computeIfAbsent(6, e -> e *3);
        map.computeIfPresent(3, (k, v) -> null);

        map.values().forEach(System.out::println);
        System.out.println(map);
    }
}
