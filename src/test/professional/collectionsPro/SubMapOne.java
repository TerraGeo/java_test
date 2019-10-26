package test.professional.collectionsPro;

import java.util.Map;
import java.util.TreeMap;

public class SubMapOne {
    public static void main(String[] args) {
        Map<Integer, Integer>  map = new TreeMap<>();
        map.put(9, 1);
        map.put(8, 2);
        map.put(7, 3);
        map.put(6, 4);
        //System.out.println(map.subMap(6, true, 9, false).values());
        System.out.println(((TreeMap<Integer, Integer>) map).subMap(6, true, 9, false).values());
        System.out.println(((TreeMap<Integer, Integer>) map).subMap(9, true, 6, false).values());
    }
}
