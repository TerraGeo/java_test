package test.professional.collectionsPro;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class ReplaceInMapTwo {
    public static void main(String[] args) {
        Map<String, Integer> map = new LinkedHashMap<>();
        map.put("A", 2);
        map.put("B", 1);
        map.put("D", 0);
        map.put("C", 54);
        System.out.println(map);

        try {
            map.replaceAll((k, v) -> 100/v);
        } finally {
            System.out.println(map);
        }

    }
}
