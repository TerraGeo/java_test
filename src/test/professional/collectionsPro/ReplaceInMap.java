package test.professional.collectionsPro;

import java.util.Map;
import java.util.TreeMap;

public class ReplaceInMap {
    public static void main(String[] args) {
        Map<Integer, String> map = new TreeMap<>();

        map.put(1, "One");
        map.put(2, "Two");
        map.put(3, "Three");

        map.replace(1, "1", null);
        System.out.println(map);
        map.replace(3, null);

        System.out.println(map);
    }
}
