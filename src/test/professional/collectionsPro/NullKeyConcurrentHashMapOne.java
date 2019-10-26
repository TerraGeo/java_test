package test.professional.collectionsPro;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;
import java.util.concurrent.ConcurrentHashMap;

public class NullKeyConcurrentHashMapOne {
    public static void main(String[] args) {
        String[] strings = new String[2];
        strings[1] = "B";
        /*ConcurrentHashMap<String, Integer> map = new ConcurrentHashMap<>();
        map.put("a", new Integer(1));
        map.put(strings[0], new Integer(2));
        map.put("C", 3);
        map.putIfAbsent("D", new Integer(4));
        System.out.println(map);*/

        Map<String, Integer> map = new LinkedHashMap<>();
        map.put("a", new Integer(1));
        map.put(strings[0], new Integer(2));
        map.put("C", 3);
        map.putIfAbsent("D", new Integer(4));
        System.out.println(map);
    }
}
