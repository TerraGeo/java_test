package test.professional.collectionsPro;

import java.util.HashMap;
import java.util.Map;

public class GetOrDefaultMap1 {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        map.put("last", "sword");
        System.out.println(map.getOrDefault("first", "arrow"));
    }
}
